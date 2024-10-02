package com.ohgiraffers.section01.statement;

import com.ohgiraffers.model.dto.EmployDTO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application04 {

    public static void main(String[] args) {

        /* title. 전체 사원 정보를 EmployeeETO 를 통해 객체에 담아서 출력
         *  */

        Connection con = getConnection();

        Statement stmt = null;

        ResultSet rset = null;

        // 회원 한 명의 정보를 담을 DTO
        EmployDTO emp = null;
        // 한명의 정보들을 하나의 인스턴스로 묶기 위한 List
        List<EmployDTO> empList = null;

        String query = "SELECT * FROM EMPLOYEE";

        empList = new ArrayList<>();

        try {
            stmt = con.createStatement();

            rset = stmt.executeQuery(query);

            /* 조회한 결과를 객체에 담기 */
            while (rset.next()) {
                emp = new EmployDTO();

                emp.setEmpId(rset.getString("EMP_ID"));
                emp.setEmpName(rset.getString("EMP_NAME"));
                emp.setEmpNo(rset.getString("EMP_NO"));
                emp.setEmail(rset.getString("EMAIL"));
                emp.setPhone(rset.getString("PHONE"));
                emp.setDeptCode(rset.getString("DEPT_CODE"));
                emp.setJobCode(rset.getString("JOB_CODE"));
                emp.setSalLevel(rset.getString("SAL_LEVEL"));
                emp.setSalary(rset.getInt("SALARY"));
                emp.setBonus(rset.getDouble("BONUS"));
                emp.setManagerId(rset.getString("MANAGER_ID"));
                emp.setHireDate(rset.getDate("HIRE_DATE"));
                emp.setHireDate(rset.getDate("ENT_DATE"));
                emp.setEntYn(rset.getString("ENT_YN"));

                empList.add(emp);

            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            close(rset);
            close(stmt);
            close(con);
        }

        for (EmployDTO oneEmployee : empList) {
            System.out.println("oneEmployee = " + oneEmployee);
        }

    }

}