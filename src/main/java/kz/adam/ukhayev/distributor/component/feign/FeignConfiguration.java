package kz.adam.ukhayev.distributor.component.feign;

import feign.Logger;
import kz.adam.ukhayev.distributor.exception.UserErrorDecoder;
import org.springframework.context.annotation.Bean;

public class FeignConfiguration {

  @Bean
  Logger.Level feignLoggerLevel() {
    return Logger.Level.FULL;
  }

  @Bean
  public UserErrorDecoder userErrorDecoderEx() {
    return new UserErrorDecoder();
  }
}