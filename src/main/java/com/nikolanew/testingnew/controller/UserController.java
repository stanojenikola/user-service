package com.nikolanew.testingnew.controller;

import com.nikolanew.testingnew.helper.digitalocean2.Fibonnaci;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/user")
public class UserController {

    record User(String name) {
    }

    UserController() {
        Object object = new Fibonnaci();
        object.toString();
    }

    @GetMapping("username")
    public String userName() {
        return "nikola";
    }

}
