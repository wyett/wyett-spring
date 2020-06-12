package com.wyett.valueandpropertysource.component;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author : wyettLei
 * @date : Created in 2020/5/20 11:11
 * @description: TODO
 */

public class DbConnection {

    @Value("wyett")
    private String dbName;

    @Value("${db.username}")
    private String userName;

    @Value("${db.password}")
    private String password;

    public String getDbName() {
        return dbName;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "DbConnection{" +
                "dbName='" + dbName + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
