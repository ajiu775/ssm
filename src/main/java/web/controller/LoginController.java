package web.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: jax
 * @description: Login
 * @author: Allen
 * @create: 2020-05-09 19:16
 **/
@Slf4j
@Controller
public class LoginController {
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String start() {
        return "index";
    }

    @RequestMapping(value = "/lo", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(String username, String password, HttpServletRequest request) {
        System.out.println(request.getParameter("username"));
        return "index";
    }

    //TODO contact view and model

}
