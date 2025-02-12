package com.example.springdemo.controller;

import com.example.springdemo.model.Customer2;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
public class CustomerController {

    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){
        StringTrimmerEditor stringTrimmer2= new StringTrimmerEditor(true);
        webDataBinder.registerCustomEditor(String.class,stringTrimmer2);
    }
    @GetMapping("/showCustomerForm")
    public String showForm(Model model){
        Customer2 customer2=new Customer2();
        model.addAttribute("customer2",customer2);
        return "customer-registration";
    }

    @GetMapping("/processCustomerForm")
    public String processCustomerData(@Valid @ModelAttribute("customer2") Customer2 customer2,
                                   BindingResult bindingResult){


        System.out.println("Lastname: |"+ customer2.getLastname()+"|");
        System.out.println(bindingResult);
        if(bindingResult.hasErrors()) {

            return "customer-registration";
        }
        else
            return "process-cust-form";
    }
}
