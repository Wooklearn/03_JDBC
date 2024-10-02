package com.ohgiraffers.practice;

import com.ohgiraffers.model.dto.EmployeeDTO;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application {
    public static void main(String[] args) {

        Connection con = getConnection();

        Statement stmt = null;

        ResultSet rset = null;

        Properties prop = new Properties();

        EmployeeDTO empDTO = null;

        List<EmployeeDTO> empList = null;

        String query = "SELECT * FROM EMPLOYEE";

        try {
            rset = stmt.executeQuery(query);
            empList = new ArrayList<>();

            while(rset.next()){
                empDTO.setEMP_ID("1");

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }


//-- 모든 행 모든 컬럼 조회
//-- EMPLOYEE테이블에서 모든 정보 조회










}
