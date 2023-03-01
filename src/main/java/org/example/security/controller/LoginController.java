package org.example.security.controller;

import lombok.RequiredArgsConstructor;
import org.example.security.dto.AuthCredentials;
import org.example.security.dto.LoginResponseDto;
import org.example.security.service.LoginService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class LoginController {

    private final LoginService loginService;

    @PostMapping("/login")
    public LoginResponseDto login(@RequestBody AuthCredentials authCredentials) {
        return LoginResponseDto
                .builder()
                .token(loginService.login(authCredentials))
                .build();
    }

}
