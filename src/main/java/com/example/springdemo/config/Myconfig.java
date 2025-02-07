package com.example.springdemo.config;


import com.example.springdemo.CricketPlayer;
import com.example.springdemo.HockeyPlayer;
import com.example.springdemo.Player;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Myconfig {

    @Bean("batterHockey")
    public Player myPlayer(){//myPlayer is bean name
        return new HockeyPlayer();
    }
}
