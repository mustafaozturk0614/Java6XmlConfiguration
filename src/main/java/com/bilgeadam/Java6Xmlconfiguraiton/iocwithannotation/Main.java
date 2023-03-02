package com.bilgeadam.Java6Xmlconfiguraiton.iocwithannotation;


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
                new AnnotationConfigApplicationContext(IocConfigWA.class);

        GameRunnerIocWA gameRunnerIoc=context.getBean(GameRunnerIocWA.class);
        gameRunnerIoc.run();

    }
}
