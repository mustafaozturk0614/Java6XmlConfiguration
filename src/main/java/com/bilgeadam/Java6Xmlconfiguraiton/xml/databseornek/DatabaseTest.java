package com.bilgeadam.Java6Xmlconfiguraiton.xml.databseornek;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
    1-Postgre,Mysql s�n�fm�z olsun
    2-DatabaseService Clas�m�z olsun
    3 Postgre ve mysqlde database loglama metotlar�m�z olsun (Postgreye logland� - MYsql e Logland� gibi)
    4-Database servicetede logToDatabase metotumuz olsun buda hangi databasi kullan�yorsak onun
    log metoduna eri��in
    5-bunun i�in bir applicationContext yazal�m ve Databse test s�n�fm�zda testimizi yapal�m
 */
public class DatabaseTest {


    public static void main(String[] args) {

        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("databseContext.xml");

        DatabaseService service=context.getBean("service",DatabaseService.class);
        service.logToDatabase();

    }

}
