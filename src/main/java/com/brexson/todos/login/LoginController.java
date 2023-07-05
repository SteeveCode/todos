package com.brexson.todos.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    private AuthenticationService authenticationService;
    // using constructor injection to autowire the authenticationService class
    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    //http://localhost:8080/login?name=Ranga
    //Model
    @GetMapping("login")
    public String gotoLoginPage() {
        return "login";
    }
    @PostMapping("login")
    public String gotoWelcomePage(@RequestParam String name,
                                  @RequestParam String password, ModelMap model) {

        if(authenticationService.authenticate(name, password)) {

            model.put("name", name);
            //Authentication
            //name - in28ms
            //password - dummy
            return "welcome";
        }
        model.put("errorMessage", "Invalid Credentials! Please try again");
        return "login";
    }
}