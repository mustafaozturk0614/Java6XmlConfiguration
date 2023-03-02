package com.bilgeadam.Java6Xmlconfiguraiton.iocwithannotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("pacman")
public class PacmanIocWA implements IGameConsoleIocWA {

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
