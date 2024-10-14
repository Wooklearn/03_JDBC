package com.ohgiraffers;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Properties;

import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application {

    public static void main(String[] args) {

        Connection con = getConnection();

        PreparedStatement pstmt = null;

        ResultSet rset = null;

        Properties prop = new Properties();



        try {
            prop.loadFromXML(new FileInputStream(
                    "src/main/java/com/ohgiraffers/config/config-query.properties"
            ));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }


}
