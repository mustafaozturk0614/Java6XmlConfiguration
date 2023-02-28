package com.bilgeadam.Java6Xmlconfiguraiton.xml;


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
                new ClassPathXmlApplicationContext("applicationContext.xml");

       // GameRunner gameRunner=new GameRunner(context.getBean("mygame", IGameConsole.class));
        GameRunner gameRunner=context.getBean("gamerunner", GameRunner.class);
        gameRunner.run();
        GameRunner gameRunner2=context.getBean("gamerunner", GameRunner.class);
        gameRunner2.run();
    }
}
