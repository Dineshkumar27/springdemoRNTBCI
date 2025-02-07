package com.example.springdemo;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("prototype") //by default it is singleton
 public class CricketPlayer implements Player{

    public CricketPlayer() {
        System.out.println("Object Created: "+getClass().getSimpleName());
    }

    @Override
    public String getPractice() {
           return "Practice Fast Bowling for 20 mins";
    }
}
