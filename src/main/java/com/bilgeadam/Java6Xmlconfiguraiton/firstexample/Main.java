package com.bilgeadam.Java6Xmlconfiguraiton.firstexample;
/*
1- mariogame  sınıfında  4 tane metodumuz olsun
    -up() zıpla
    -down()
    -left()
    -right()
    GameRunner sınıfında bir run metodumuz olsun
    bu run metodu mariogame sınıfındaki 4 metodumuzu çalıştırsın

 */
public class Main {
    public static void main(String[] args) {
        GameRunner gameRunner=new GameRunner(new SuperContra());
        gameRunner.run();
    }
}
