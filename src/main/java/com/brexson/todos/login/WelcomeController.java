package com.brexson.todos.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class WelcomeController {
    @GetMapping("/")
    public String gotoWelcomePage( ModelMap model) {
        model.put("name", "in28ms");
        return "welcome";
    }
}