package com.brexson.todos.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    //http://localhost:8080/login?name=Ranga
    //Model
    @GetMapping("login")
    public String gotoLoginPage() {
        return "login";
    }
    @PostMapping("login")
    public String gotoWelcomePage(@RequestParam String name, ModelMap model) {
        model.put("name",name);
        return "welcome";
    }
}