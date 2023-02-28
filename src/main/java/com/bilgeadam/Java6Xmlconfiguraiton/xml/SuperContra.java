package com.bilgeadam.Java6Xmlconfiguraiton.xml;

public class SuperContra implements IGameConsole {


    @Override
    public void up() {
        System.out.println("yukari");
    }
    @Override
    public void down() {
        System.out.println("egil");
    }
    @Override
    public void right() {
        System.out.println("geri git");
    }

    @Override
    public void left() {
        System.out.println("kursun at");
    }
}
