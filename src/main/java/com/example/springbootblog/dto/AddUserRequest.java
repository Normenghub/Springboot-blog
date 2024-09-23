package com.example.springbootblog.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddUserRequest {
    private String Email;
    private String Password;
}
