package com.ohgiraffers.common;

import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class JDBCTemplate {

    public static Connection getConnection() {

        Connection con = null;

        Properties prop = null;

        try {
            prop.load(new FileReader(
                    "src/main/java/com/ohgiraffers/config/config-query.properties"
            ));

            String driver = prop.getProperty("driver");
            String url = prop.getProperty("url");

            Class.forName(driver);

            con = DriverManager.getConnection(url,prop);




        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return con;

    }

    public static void close (Connection con){
        try {
            // con 의 값이 null 값이더라도 con.isClosed 를 통해 통로 닫아주기
            // & 하나는 앞이 거짓이라도 뒤에 조건을 실행시켜주겠다는 의미
            if (con != null & con.isClosed()){
                con.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void close (Statement stmt){
        try {

            if (stmt != null & stmt.isClosed()){
                stmt.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void close (ResultSet rset){
        try {

            if (rset != null & rset.isClosed()){
                rset.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
