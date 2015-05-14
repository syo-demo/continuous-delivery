package com.schabiyo.demo.cd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.boot.*;

@SpringBootApplication
@RestController
public class CdApplication {


    @RequestMapping("/")
    @ResponseBody
    String home(){
	return "Welcome to a CD demo powered by Cloud Foundry";
    }

    public static void main(String[] args) {
        SpringApplication.run(CdApplication.class, args);
    }
}
