package com.bilgeadam.Java6Xmlconfiguraiton.ioc;

import org.springframework.stereotype.Component;

@Component

public class PacmanIoc implements IGameConsoleIoc {

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
