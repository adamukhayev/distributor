package kz.adam.ukhayev.distributor.service;

import javax.validation.Valid;
import kz.adam.ukhayev.distributor.model.auth.AuthenticationDto;
import kz.adam.ukhayev.distributor.model.dto.ResponseUserDto;
import kz.adam.ukhayev.distributor.model.dto.UserDto;

public interface UserService {

    ResponseUserDto inLogin(AuthenticationDto authenticationDto);

    void registerUser(@Valid UserDto userDto);

    String sendEmail(String email);
}
