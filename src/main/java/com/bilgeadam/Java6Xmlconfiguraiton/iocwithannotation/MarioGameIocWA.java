package com.bilgeadam.Java6Xmlconfiguraiton.iocwithannotation;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@ToString
@Component
@Qualifier("mario")
public class MarioGameIocWA implements IGameConsoleIocWA {

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
