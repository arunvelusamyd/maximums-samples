package com.flexy.controller;

import com.flexy.model.LoginRequest;
import com.flexy.model.LoginResponse;
import com.flexy.model.Product;
import com.flexy.model.UserProfile;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

@Controller
@Slf4j
public class LoginController {

    @RequestMapping(path = "/logins", method = RequestMethod.POST)
    public @ResponseBody
    LoginResponse createProduct(@RequestBody LoginRequest loginRequest) {
        LoginResponse loginResponse = new LoginResponse();
        UserProfile userProfile = new UserProfile();
        userProfile.setUserId("4938");
        userProfile.setUserName("Arun Velusamy");
        userProfile.setStatus("Active");
        userProfile.setLevel("10");
        loginResponse.setLogin(userProfile);
        return loginResponse;
    }

    @RequestMapping(path = "/logins", method = RequestMethod.OPTIONS)
    public ResponseEntity optionsProduct(HttpServletResponse response) {
        log.debug("Entering Options http method");
        response.setHeader("Allow", "HEAD,GET,PUT,OPTIONS");
        response.setHeader("Access-Control-Allow-Origin", "*");
        return new ResponseEntity(HttpStatus.OK);
    }

}
