package com.example.springdemo;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
 public class CricketPlayer implements Player{

    public CricketPlayer() {
        System.out.println("Object Created: "+getClass().getSimpleName());
    }

    @Override
    public String getPractice() {
           return "Practice Fast Bowling for 20 mins";
    }
}
