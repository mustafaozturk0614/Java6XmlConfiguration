package com.bilgeadam.Java6Xmlconfiguraiton.ioc;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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

        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(IocConfig.class);


//        String myName=context.getBean("name", String.class);
//        System.out.println(myName);
//        IGameConsoleIoc marioGameIoc=context.getBean("mymario",IGameConsoleIoc.class);
//        System.out.println(marioGameIoc.getClass().getSimpleName());

        GameRunnerIoc gameRunnerIoc=context.getBean("gameRunner",GameRunnerIoc.class);
        gameRunnerIoc.run();

    }
}
