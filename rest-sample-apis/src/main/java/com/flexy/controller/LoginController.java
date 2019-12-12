package com.flexy.controller;

import com.flexy.model.LoginRequest;
import com.flexy.model.LoginResponse;
import com.flexy.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @RequestMapping(path = "/login", method = RequestMethod.POST)
    public @ResponseBody
    LoginResponse createProduct(@RequestBody LoginRequest loginRequest) {
        LoginResponse loginResponse = new LoginResponse();
        loginResponse.setUserName("Arun Velusamy");
        loginResponse.setStatus("Active");
        loginResponse.setLevel("10");
        return loginResponse;
    }

}
