package com.bilgeadam.Java6Xmlconfiguraiton.firstexample;

import lombok.ToString;

@ToString
public class MarioGame implements IGameConsole {



    public  void  up(){
        System.out.println("Zıpla");
    }
    public  void  down(){

        System.out.println("Bir Deliğe gir");
    }
    public  void  left(){

        System.out.println("geri dön");
    }
    public  void  right(){

        System.out.println("hızlan");
    }
}
