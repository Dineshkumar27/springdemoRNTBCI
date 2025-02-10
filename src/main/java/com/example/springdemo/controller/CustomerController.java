package com.example.springdemo.controller;

import com.example.springdemo.model.Customer2;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
public class CustomerController {
    @Value("${countries}")
    private List<String> countries;

    @Value("${FavoriteOS}")
    private List<String> favOs;

    @GetMapping("/showCustomerForm")
    public String showForm(Model model){

        Customer2 customer2=new Customer2();
        model.addAttribute("customer2",customer2);
        model.addAttribute("countries",countries);
        model.addAttribute("favoriteOS",favOs);
        return "customer-registration";
    }

    @GetMapping("/processCustomerForm")
    public String processCustomerData(@Valid @ModelAttribute("customer2") Customer2 customer2,
                                     BindingResult bindingResult){


//        System.out.println(customer2.getFirstname()+" "+
//                customer2.getLastname());
        if(bindingResult.hasErrors())
            return "customer-registration";
        else

             return "process-cust-form";
    }
}
