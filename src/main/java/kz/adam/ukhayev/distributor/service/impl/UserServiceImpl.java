package kz.adam.ukhayev.distributor.service.impl;


import java.util.Optional;
import javax.validation.Valid;
import kz.adam.ukhayev.distributor.component.feign.FeignUserApi;
import kz.adam.ukhayev.distributor.model.auth.AuthenticationDto;
import kz.adam.ukhayev.distributor.model.dto.ResponseUserDto;
import kz.adam.ukhayev.distributor.model.dto.UserDto;
import kz.adam.ukhayev.distributor.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final FeignUserApi feignUserApi;

    @Override
    public ResponseUserDto inLogin(AuthenticationDto authenticationDto) {
        return Optional.ofNullable(feignUserApi.inLogin(authenticationDto)).map(
                ResponseEntity::getBody).orElse(null);
    }

    @Override
    public void registerUser(@Valid UserDto userDto) {
        feignUserApi.registerUser(userDto);
    }

    @Override
    public String sendEmail(String email) {
        return Optional.ofNullable(feignUserApi.sendEmail(email)).map(ResponseEntity::getBody)
                .orElse(null);
    }
}
