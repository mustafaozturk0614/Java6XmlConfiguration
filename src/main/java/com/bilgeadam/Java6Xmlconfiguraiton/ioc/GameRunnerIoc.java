package com.bilgeadam.Java6Xmlconfiguraiton.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunnerIoc {

    IGameConsoleIoc game;

    public GameRunnerIoc(IGameConsoleIoc game) {
    this.game=game;
    }
    public  void  run(){
        System.out.println("Oyun çalışıyor: "+game.getClass().getSimpleName());
        System.out.println(game.hashCode());
        game.up();
        game.down();
        game.left();
        game.right();
    }

}
