package kz.adam.ukhayev.distributor.component.feign;

import kz.adam.ukhayev.distributor.model.dto.message.MessageDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(
        value = "messenger-api",
        url = "${feign.url.messenger-api}"
)
public interface FeignMessengerApi {

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Void> sendMessage(@RequestBody MessageDto messageDto,
            @RequestHeader("Authorization") String jwtToken);
}
