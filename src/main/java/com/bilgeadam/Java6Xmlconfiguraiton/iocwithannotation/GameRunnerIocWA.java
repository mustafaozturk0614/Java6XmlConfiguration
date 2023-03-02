package com.bilgeadam.Java6Xmlconfiguraiton.iocwithannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunnerIocWA {
    @Autowired
    @Qualifier("pacman")
    IGameConsoleIocWA game;

//    public GameRunnerIocWA(@Qualifier("mario") IGameConsoleIocWA game) {
//    this.game=game;
//    }
    public  void  run(){
        System.out.println("Oyun çalışıyor: "+game.getClass().getSimpleName());
        System.out.println(game.hashCode());
        game.up();
        game.down();
        game.left();
        game.right();
    }

}
