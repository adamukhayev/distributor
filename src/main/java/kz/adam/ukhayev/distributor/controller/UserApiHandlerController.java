package kz.adam.ukhayev.distributor.controller;

import io.swagger.annotations.ApiOperation;
import javax.validation.Valid;
import kz.adam.ukhayev.distributor.model.auth.AuthenticationDto;
import kz.adam.ukhayev.distributor.model.dto.ResponseUserDto;
import kz.adam.ukhayev.distributor.model.dto.UserDto;
import kz.adam.ukhayev.distributor.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
@ApiOperation(value = "Registration/Login")
public class UserApiHandlerController {

    private final UserService userService;

    @PostMapping("/in-login")
    public ResponseEntity<ResponseUserDto> inLogin(
            @RequestBody AuthenticationDto authenticationDto
    ) {
        return ResponseEntity.ok(userService.inLogin(authenticationDto));
    }

    @PostMapping("/register")
    public ResponseEntity<Void> registerUser(@RequestBody @Valid UserDto userDto) {
        userService.registerUser(userDto);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/send-email/{email}")
    public ResponseEntity<String> sendEmail(@PathVariable String email) {
        return ResponseEntity.ok(userService.sendEmail(email));
    }
}
