package com.example.springdemo;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class FootballPlayer implements Player{

    public FootballPlayer() {
        System.out.println("Object Created: "+getClass().getSimpleName());
    }

    @Override
    public String getPractice() {
        return "Practice for defend position";
    }
}
