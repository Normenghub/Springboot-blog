package com.example.springbootblog.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class CreateAccessTokenRequest {
    private String refreshToken;
}
