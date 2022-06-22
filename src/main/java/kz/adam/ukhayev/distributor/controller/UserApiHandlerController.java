package kz.adam.ukhayev.distributor.controller;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import kz.adam.ukhayev.distributor.model.auth.AuthenticationDto;
import kz.adam.ukhayev.distributor.model.dto.ResponseUserDto;
import kz.adam.ukhayev.distributor.model.dto.UserDto;
import kz.adam.ukhayev.distributor.service.Answer;
import kz.adam.ukhayev.distributor.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserApiHandlerController {

    private final UserService userService;
    private final Answer answer;

    @PostMapping("/in-login")
    public ResponseEntity<ResponseUserDto> inLogin(
            @RequestBody AuthenticationDto authenticationDto
    ) {
        return ResponseEntity.ok(userService.inLogin(authenticationDto));
    }

    //Удалить со временем
    @PostMapping
    public ResponseEntity<Void> answer(@RequestParam @NotNull Long userId,
            @RequestParam String jwtToken) {

        answer.getAnswer(userId, jwtToken);
        return ResponseEntity.ok().build();
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
