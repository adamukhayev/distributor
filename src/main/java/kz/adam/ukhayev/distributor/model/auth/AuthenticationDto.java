package kz.adam.ukhayev.distributor.model.auth;

import lombok.Data;

@Data
public class AuthenticationDto {

    private String email;
    private String password;
}
