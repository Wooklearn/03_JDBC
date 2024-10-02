package com.ohgiraffers.section02.template;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCTemplate {

    /* title. jdbc 커넥션 정보를 하나의 틀로 만들어 필요한 곳에서 호출 */

    // 싱글톤
    public static Connection getConnection() {

        Connection con = null;

        Properties prop = new Properties();

        try {

            prop.load(new FileReader("src/main/java/com/ohgiraffers/config/connection-info.properties"));

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
        }   // 여기서 finally close를 넣으면 사용 불가

        return con;

    }

    public static void close(Connection con) {

        // & 비트연산자 => 좌항과 우항을 모두 비교
        try {
            if (con != null & !con.isClosed()) {
                con.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
