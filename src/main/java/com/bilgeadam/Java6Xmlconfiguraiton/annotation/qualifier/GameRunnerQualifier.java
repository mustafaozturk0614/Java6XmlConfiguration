package com.bilgeadam.Java6Xmlconfiguraiton.annotation.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunnerQualifier {
    @Autowired
    @Qualifier("mario")
    IGameConsole game;

//    public GameRunnerQualifier(@Qualifier("mario") IGameConsole game) {
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
