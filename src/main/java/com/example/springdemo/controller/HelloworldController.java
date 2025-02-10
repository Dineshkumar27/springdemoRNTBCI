package com.example.springdemo.controller;


import com.example.springdemo.model.Customer;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpRequest;
import java.util.List;

@Controller
public class HelloworldController {
   @Value("${countries}")
   private List<String> countries;

    @GetMapping("/template")
    public String getTemplate(Model theModel){
        theModel.addAttribute("todaysDate",java.time.Instant.now());
        return "helloworld";//will be view, converted into helloworld.html
    }

    @GetMapping(value = "/showForm")
    public String getForm(Model theModel){
        Customer theCustomer=new Customer();
        theModel.addAttribute("customer",theCustomer);
        theModel.addAttribute("countries",countries);
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

    @PostMapping("/processForm3")
    public String process3(@RequestParam("username") String user, Model model){


        //convert to upper case
        user="Hi "+user.toUpperCase();
        //store it as a model attribute
        model.addAttribute("message2",user);
        return "processed-form3";
    }


    @PostMapping("/processForm4")
    public String process4(@ModelAttribute("customer")Customer customer, Model model){

        //store it as a model attribute
        System.out.println(customer.getFirstname()+" "+customer.getLastname());
        return "processed-form4";
    }


}
