package com.ohgiraffers.section02.preparedstatement;

import com.ohgiraffers.model.dto.EmployDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class Application04 {

    public static void main(String[] args) {

        /* index. 1. EMPLOYEE 테이블에서 조회할 사원의 성씨를 입력받아
        *   해당하는 성을 가지고 있는 사원의 정보를 모두 출력
        *  */

        Connection con = getConnection();

        PreparedStatement pstmt = null;

        ResultSet rset = null;

        EmployDTO emp = null;

        List<EmployDTO> arr = null;


        Scanner sc = new Scanner(System.in);
        System.out.print("조회하실 성씨를 입력해주세요 : ");
        String empName = sc.nextLine();

        String query = "SELECT * FROM EMPLOYEE WHERE EMP_NAME LIKE CONCAT(?, '%')";

        try {
            pstmt = con.prepareStatement(query);

            pstmt.setString(1, empName);

            rset = pstmt.executeQuery();

            arr = new ArrayList<>();

            while (rset.next()) {

                emp = new EmployDTO();

                // "중요" - get 값을 꺼낸다음 set에 저장
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

                arr.add(emp);
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            close(rset);
            close(pstmt);
            close(con);
        }

        for (EmployDTO employDTO : arr) {
            System.out.println("employDTO = " + employDTO);
        }
    }
}
