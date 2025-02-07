package com.example.springdemo;

public class HockeyPlayer implements Player {

    public HockeyPlayer(){
        System.out.println("Object Created "+
                getClass().getName());
    }
    @Override
    public String getPractice() {
        return "Practice Hockey";
    }
}
