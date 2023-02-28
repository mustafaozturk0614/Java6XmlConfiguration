package com.bilgeadam.Java6Xmlconfiguraiton.annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class Pacman implements IGameConsole {

    public  void  up(){
        System.out.println("yukarı");
    }
    public  void  down(){

        System.out.println("aşağı");
    }
    public  void  left(){

        System.out.println("sola");
    }
    public  void  right(){

        System.out.println("sağa");
    }

}
