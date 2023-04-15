package kz.adam.ukhayev.distributor.exception;

import com.fasterxml.jackson.databind.ObjectMapper;
import feign.Response;
import feign.codec.ErrorDecoder;
import java.io.IOException;
import java.io.InputStream;
import lombok.SneakyThrows;

public class UserErrorDecoder implements ErrorDecoder {

  final private ErrorDecoder errorDecoder = new Default();

  @SneakyThrows
  @Override
  public Exception decode(String methodKey, Response response) {
    ExceptionInfo message;
    try (InputStream bodyIs = response.body()
        .asInputStream()) {
      ObjectMapper mapper = new ObjectMapper();
      message = mapper.readValue(bodyIs, ExceptionInfo.class);
    } catch (IOException e) {
      return new Exception(e.getMessage());
    }
    switch (message.getInfo()) {
      case "Not found":
        throw new GeneralTestApiException(TestApiError.E404_NOT_FOUND,
            message.getInfo());
      case "Invalid email/password combination":
        throw new GeneralTestApiException(TestApiError.E403_FORBIDDEN,
            message.getInfo());
      default:
        return errorDecoder.decode(methodKey, response);
    }
  }
}