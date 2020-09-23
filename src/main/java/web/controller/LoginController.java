package web.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import web.entity.Student;
import web.service.StudentServiceImpl;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program: jax
 * @description: Login
 * @author: Allen
 * @create: 2020-05-09 19:16
 **/
@Controller
@RequestMapping(value = "/")
@Slf4j
public class LoginController {
    @Resource
    private StudentServiceImpl studentService;
    @Resource
    private ModelAndView modelAndView;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String start() {
        return "index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login(HttpServletRequest request, HttpServletResponse response) {
        Student student = studentService.queryById(Integer.valueOf(request.getParameter("id")));
        if(student.getAccount().equals(request.getParameter("account"))){
            modelAndView.setViewName("fail");
        }
        return modelAndView;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(String username, String password, HttpServletRequest request) {
        System.out.println(request.getParameter("username"));
        return "index";
    }

    //TODO contact view and model

}
