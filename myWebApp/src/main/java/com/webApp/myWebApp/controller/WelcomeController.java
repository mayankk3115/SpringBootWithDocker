package com.webApp.myWebApp.controller;

//import com.webApp.myWebApp.service.AuthenticationService;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class WelcomeController {

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String loginJsp(ModelMap model) {
        model.put("name", getloggedInUserName());
        return "welcome";
    }

    private String getloggedInUserName() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return authentication.getName();
    }

    /*

    @RequestMapping(value="login", method = RequestMethod.POST)
    public String loginToWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {

        if(authenticationService.authenticate(name, password)) {
            model.put("name", name);
            model.put("password", password);
            return "welcome";
        }
        model.put("errorMessage", "Invalid credentials!! Please use correct username and password");
        return "login";
    }*/
}
