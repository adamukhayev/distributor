package kz.adam.ukhayev.distributor.component.feign;

import kz.adam.ukhayev.distributor.model.auth.AuthenticationDto;
import kz.adam.ukhayev.distributor.model.dto.ResponseUserDto;
import kz.adam.ukhayev.distributor.model.dto.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(
        value = "users-api",
        url = "${feign.url.user-api}"
)
public interface FeignUserApi {

    @PostMapping(value = "/login", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<ResponseUserDto> inLogin(@RequestBody AuthenticationDto authenticationDto);

    @PostMapping(value = "/register", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Void> registerUser(@RequestBody UserDto userDto);

    @PostMapping(value = "/captcha", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<String> sendEmail(@RequestParam String email);
}
