package com.bilgeadam.Java6Xmlconfiguraiton.ioc;

import com.bilgeadam.Java6Xmlconfiguraiton.xml.GameRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("com.bilgeadam.Java6Xmlconfiguraiton.ioc")
public class IocConfig {
    @Bean
    public String name(){
        return "Mustafa";
    }
    @Bean
    @Primary
    public IGameConsoleIoc mymario(){
        return new MarioGameIoc();
    }
    @Bean
    public IGameConsoleIoc mypacman(){
        return new PacmanIoc();
    }
    @Bean
    public IGameConsoleIoc mycontra(){
        return new SuperContraIoc();
    }

    @Bean
    public GameRunnerIoc gameRunner(){
        return new GameRunnerIoc(mypacman());
    }



}
