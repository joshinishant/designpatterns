package com.designpatterns.creational.ObjectPool;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ObjectPool<T> extends ObjectPoolTemplate<T> {

    private String url;
    private String username;
    private String password;

    public ObjectPool(long timeOutInMilliseconds, String url, String username, String password) {
        super(timeOutInMilliseconds);
        this.url = url;
        this.username = username;
        this.password = password;
    }

    @Override
    protected T createObject() {
        Connection connection=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
        }
        catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
        return (T)connection;
    }

    @Override
    protected void destroyObject(T object) {
        try {
            if (object instanceof Connection) {
                Connection connection = (Connection) object;
                if (!connection.isClosed()) {
                    connection.close();
                }
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
