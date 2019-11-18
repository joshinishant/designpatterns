package com.designpatterns.creational.ObjectPool;

import java.sql.Connection;

public class ObjectPoolDemo {

    public  static void main(String[] args){
        String DB_URL = "jdbc:mysql://localhost/";
        String USER = "username";
        String PASS = "password";
        ObjectPoolTemplate<Connection> sqlConnectionPool= new ObjectPool<>(4000,DB_URL,USER,PASS);
        Connection connection1=sqlConnectionPool.getObject();
        Connection connection2=sqlConnectionPool.getObject();
        Connection connection3=sqlConnectionPool.getObject();

        sqlConnectionPool.destroyObject(connection3);
        sqlConnectionPool.destroyObject(connection2);
    }
}
