package com.bilgeadam.Java6Xmlconfiguraiton.annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
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
