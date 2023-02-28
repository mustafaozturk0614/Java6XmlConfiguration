package com.bilgeadam.Java6Xmlconfiguraiton.annotation;


import org.springframework.context.support.ClassPathXmlApplicationContext;

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

        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("annotationContext.xml");
        
        GameRunner gameRunner=context.getBean(GameRunner.class);
        gameRunner.run();

    }
}
