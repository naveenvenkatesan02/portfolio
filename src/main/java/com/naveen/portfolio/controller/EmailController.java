package com.naveen.portfolio.controller;

import com.naveen.portfolio.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("api")
public class EmailController {
    @Autowired
    EmailService emailService;

    @PostMapping("getEmail")
    public String getEmail(@RequestBody Map<String, String> request){

        String name = request.get("name");
        String email = request.get("email");
        String phone = request.get("phone");
        String msg = request.get("msg");


        emailService.sendMail(name,email,phone,msg);

        System.out.println(request);
        return "Success";
    }
}
