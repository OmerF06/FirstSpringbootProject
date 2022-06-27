package com.example.demo3;

import com.example.demo3.bean.User;
import org.springframework.web.bind.annotation.*;

@RestController

public class Controller {
    @GetMapping("/hello")
        public User GetUser(){
        return new User("hello world");
        }

        @GetMapping("/helloWorld")
        @ResponseBody
        public User  Get_Second_User( @RequestParam String name){
        return new User("hello world "+name);
        }
    }
