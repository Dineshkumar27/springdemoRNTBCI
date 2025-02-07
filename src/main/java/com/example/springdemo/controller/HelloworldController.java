package com.example.springdemo.controller;


import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.net.http.HttpRequest;

@Controller
public class HelloworldController {

    @GetMapping("/template")
    public String getTemplate(Model theModel){
        theModel.addAttribute("todaysDate",java.time.Instant.now());
        return "helloworld";//will be view, converted into helloworld.html
    }

    @GetMapping("/showForm")
    public String getForm(Model theModel){
        return "registration-form";
    }
    @GetMapping("/processForm")
    public String process(){
        return "processed-form";
    }

    @GetMapping("/processForm2")
    public String process2(HttpServletRequest httpRequest, Model model){

        //get the value from the form
        String user=httpRequest.getParameter("username");
        //convert to upper case
        user="Hello"+user.toUpperCase();
        //store it as a model attribute
        model.addAttribute("message",user);
        return "processed-form2";
    }

    @GetMapping("/processForm3")
    public String process3(@RequestParam("username") String user, Model model){


        //convert to upper case
        user="Hi "+user.toUpperCase();
        //store it as a model attribute
        model.addAttribute("message2",user);
        return "processed-form3";
    }


}
