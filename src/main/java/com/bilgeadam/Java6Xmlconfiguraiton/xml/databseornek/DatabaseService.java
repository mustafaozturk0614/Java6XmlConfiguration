package com.bilgeadam.Java6Xmlconfiguraiton.xml.databseornek;

public class DatabaseService {
    ILog database;

    public DatabaseService(ILog database) {
        this.database = database;
    }

    public void logToDatabase(){
        database.logToDatabase();
    }

}
