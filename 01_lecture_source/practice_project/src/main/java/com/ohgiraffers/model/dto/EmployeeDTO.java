package com.ohgiraffers.model.dto;

public class EmployeeDTO {
    private String EMP_ID;
    private String EMP_NAME;
    private String EMP_NO;
    private String EMP_EMAIL;
    private String PHONE;
    private String DEPT_CODE;
    private String JOB_CODE;
    private String SAL_LEVEL;
    private String SALARY;
    private String BONUS;
    private String MANAGER_ID;
    private String HIRE_DATE;
    private String ENT_DATE;
    private String ENT_YN;

    public EmployeeDTO() {
    }

    public EmployeeDTO(String EMP_ID, String EMP_NAME, String EMP_NO, String EMP_EMAIL, String PHONE, String DEPT_CODE, String JOB_CODE, String SAL_LEVEL, String SALARY, String BONUS, String MANAGER_ID, String HIRE_DATE, String ENT_DATE, String ENT_YN) {
        this.EMP_ID = EMP_ID;
        this.EMP_NAME = EMP_NAME;
        this.EMP_NO = EMP_NO;
        this.EMP_EMAIL = EMP_EMAIL;
        this.PHONE = PHONE;
        this.DEPT_CODE = DEPT_CODE;
        this.JOB_CODE = JOB_CODE;
        this.SAL_LEVEL = SAL_LEVEL;
        this.SALARY = SALARY;
        this.BONUS = BONUS;
        this.MANAGER_ID = MANAGER_ID;
        this.HIRE_DATE = HIRE_DATE;
        this.ENT_DATE = ENT_DATE;
        this.ENT_YN = ENT_YN;
    }

    public String getEMP_ID() {
        return EMP_ID;
    }

    public void setEMP_ID(String EMP_ID) {
        this.EMP_ID = EMP_ID;
    }

    public String getEMP_NAME() {
        return EMP_NAME;
    }

    public void setEMP_NAME(String EMP_NAME) {
        this.EMP_NAME = EMP_NAME;
    }

    public String getEMP_NO() {
        return EMP_NO;
    }

    public void setEMP_NO(String EMP_NO) {
        this.EMP_NO = EMP_NO;
    }

    public String getEMP_EMAIL() {
        return EMP_EMAIL;
    }

    public void setEMP_EMAIL(String EMP_EMAIL) {
        this.EMP_EMAIL = EMP_EMAIL;
    }

    public String getPHONE() {
        return PHONE;
    }

    public void setPHONE(String PHONE) {
        this.PHONE = PHONE;
    }

    public String getDEPT_CODE() {
        return DEPT_CODE;
    }

    public void setDEPT_CODE(String DEPT_CODE) {
        this.DEPT_CODE = DEPT_CODE;
    }

    public String getJOB_CODE() {
        return JOB_CODE;
    }

    public void setJOB_CODE(String JOB_CODE) {
        this.JOB_CODE = JOB_CODE;
    }

    public String getSAL_LEVEL() {
        return SAL_LEVEL;
    }

    public void setSAL_LEVEL(String SAL_LEVEL) {
        this.SAL_LEVEL = SAL_LEVEL;
    }

    public String getSALARY() {
        return SALARY;
    }

    public void setSALARY(String SALARY) {
        this.SALARY = SALARY;
    }

    public String getBONUS() {
        return BONUS;
    }

    public void setBONUS(String BONUS) {
        this.BONUS = BONUS;
    }

    public String getMANAGER_ID() {
        return MANAGER_ID;
    }

    public void setMANAGER_ID(String MANAGER_ID) {
        this.MANAGER_ID = MANAGER_ID;
    }

    public String getHIRE_DATE() {
        return HIRE_DATE;
    }

    public void setHIRE_DATE(String HIRE_DATE) {
        this.HIRE_DATE = HIRE_DATE;
    }

    public String getENT_DATE() {
        return ENT_DATE;
    }

    public void setENT_DATE(String ENT_DATE) {
        this.ENT_DATE = ENT_DATE;
    }

    public String getENT_YN() {
        return ENT_YN;
    }

    public void setENT_YN(String ENT_YN) {
        this.ENT_YN = ENT_YN;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "EMP_ID='" + EMP_ID + '\'' +
                ", EMP_NAME='" + EMP_NAME + '\'' +
                ", EMP_NO='" + EMP_NO + '\'' +
                ", EMP_EMAIL='" + EMP_EMAIL + '\'' +
                ", PHONE='" + PHONE + '\'' +
                ", DEPT_CODE='" + DEPT_CODE + '\'' +
                ", JOB_CODE='" + JOB_CODE + '\'' +
                ", SAL_LEVEL='" + SAL_LEVEL + '\'' +
                ", SALARY='" + SALARY + '\'' +
                ", BONUS='" + BONUS + '\'' +
                ", MANAGER_ID='" + MANAGER_ID + '\'' +
                ", HIRE_DATE='" + HIRE_DATE + '\'' +
                ", ENT_DATE='" + ENT_DATE + '\'' +
                ", ENT_YN='" + ENT_YN + '\'' +
                '}';
    }
}
