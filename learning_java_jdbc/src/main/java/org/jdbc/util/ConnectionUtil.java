package org.jdbc.util;

import java.sql.*;
import java.util.Properties;

public final class ConnectionUtil {

    private volatile static ConnectionUtil obj;
    private  Properties props;


    private static final String URL = "url";
    private static final String USER = "user";
    private static final String PASSWORD = "password";

    private static final String FILE_PATH = "/application.properties";
    private ConnectionUtil(){

        props = new Properties();
        try{
            props.load(ConnectionUtil.class.getResourceAsStream(FILE_PATH));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public  static ConnectionUtil getInstance(){
        if(obj == null){
            synchronized (ConnectionUtil.class){
                if(obj == null){
                    obj = new ConnectionUtil();
                }
            }
        }
        return obj;
    }

    public Connection getConnection(){
        Connection con = null;
        try {
            con = DriverManager.getConnection(props.getProperty(URL), props.getProperty(USER), props.getProperty(PASSWORD));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
    public static void close(Statement st, Connection con){
        close(null,st,con);
    }
    public static void close(ResultSet rs, Statement st, Connection con){
        try{
            if(rs != null){
                rs.close();
            }
            if(st != null){
                st.close();
            }
            if(con != null){
                con.close();
            }
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
}
