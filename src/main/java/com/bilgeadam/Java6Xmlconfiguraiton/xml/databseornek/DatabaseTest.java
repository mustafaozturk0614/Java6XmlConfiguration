package com.bilgeadam.Java6Xmlconfiguraiton.xml.databseornek;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
    1-Postgre,Mysql sýnýfmýz olsun
    2-DatabaseService Clasýmýz olsun
    3 Postgre ve mysqlde database loglama metotlarýmýz olsun (Postgreye loglandý - MYsql e Loglandý gibi)
    4-Database servicetede logToDatabase metotumuz olsun buda hangi databasi kullanýyorsak onun
    log metoduna eriþþin
    5-bunun için bir applicationContext yazalým ve Databse test sýnýfmýzda testimizi yapalým
 */
public class DatabaseTest {


    public static void main(String[] args) {

        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("databseContext.xml");

        DatabaseService service=context.getBean("service",DatabaseService.class);
        service.logToDatabase();

    }

}
