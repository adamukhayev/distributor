package kz.adam.ukhayev.distributor.exception;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class GeneralTestApiException extends RuntimeException {

    @JsonProperty
    private TestApiError error;

    public GeneralTestApiException(TestApiError error, String message) {
        super(message);
        this.error = error;
    }

    public GeneralTestApiException(TestApiError error) {
        this(error, error.name());
    }

    @JsonProperty
    @Override
    public String getMessage() {
        return super.getMessage();
    }

}
