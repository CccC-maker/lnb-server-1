package com.example.lnb.controller;

import com.example.lnb.entity.Users;
import com.example.lnb.entity.dto.Login_Register_DTO;
import com.example.lnb.service.LoginRegisterrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LoginRegisterController {

    @Autowired
    private LoginRegisterrService userService;


    /**
     * 注册
     * @param users
     * @return
     */
    @PostMapping("/register")
    public Login_Register_DTO register(@RequestBody Users users){
        return userService.register(users);
    }

    /**
     * 登录
     * @param users
     * @return
     */
    @PostMapping("/login")
    public Login_Register_DTO login(@RequestBody Users users){
        return userService.login(users);
    }

}
