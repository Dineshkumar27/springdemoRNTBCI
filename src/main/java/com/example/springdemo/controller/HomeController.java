package com.example.springdemo.controller;

import com.example.springdemo.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
   public Player player;
    public Player newPlayer;

//   @Autowired
//    public HomeController(Player player) {
//        this.player = player;
//       // this.player=new CricketPlayer(); above line is equivalent this line
//    }
    @Autowired
    public void setPlayer(@Qualifier("batterHockey") Player player
                         ) {
        this.player = player;
//        this.newPlayer=newPlayer;
    }

    @GetMapping("/")
    public String hello(){
        return "Welcome to Spring Boot!";
    }
    @GetMapping("/player")
    public String callPlayer(){

//        return "player==newplayer "+(player==newPlayer);
        return  player.getPractice();
    }
}


//https://github.com/Codefrombasics/springdemo-RNTBCI