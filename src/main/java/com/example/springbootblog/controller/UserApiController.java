package com.example.springbootblog.controller;

import com.example.springbootblog.dto.AddUserRequest;
import com.example.springbootblog.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@Controller
public class UserApiController {
    private final UserService userService;

    @PostMapping("/user")
    public String signUp(AddUserRequest request){
        userService.save(request);
        return "redirect:/login";
    }
}
