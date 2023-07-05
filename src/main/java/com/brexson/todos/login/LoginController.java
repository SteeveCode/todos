package com.brexson.todos.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    //http://localhost:8080/login?name=Ranga
    //Model
    @RequestMapping("login")
    public String gotoLoginPage() {
        return "login";
    }
}