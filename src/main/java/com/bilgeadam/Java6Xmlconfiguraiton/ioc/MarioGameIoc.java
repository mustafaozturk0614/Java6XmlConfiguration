package com.bilgeadam.Java6Xmlconfiguraiton.ioc;

import lombok.ToString;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@ToString
@Component
@Primary
public class MarioGameIoc implements IGameConsoleIoc {



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
