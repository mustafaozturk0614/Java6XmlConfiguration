package com.bilgeadam.Java6Xmlconfiguraiton.annotation.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("pacman")

public class PacmanQualifier implements IGameConsole {

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
