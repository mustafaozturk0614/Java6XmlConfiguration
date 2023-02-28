package com.bilgeadam.Java6Xmlconfiguraiton.xml.databseornek;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Mysql implements ILog {

    String url;
    String username;
    @Override
    public void logToDatabase() {
        System.out.println("username=>>>"+username);
        System.out.println(url+" ==>Mysql'e loglandi");
    }
}
