package com.bilgeadam.Java6Xmlconfiguraiton.firstexample;

public class GameRunner {
    IGameConsole game;

    public GameRunner(IGameConsole game) {
    this.game=game;
    }
    public  void  run(){
        System.out.println("Oyun çalışıyor: "+game.getClass().getSimpleName());
        game.up();
        game.down();
        game.left();
        game.right();
    }

}
