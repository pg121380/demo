package com.example.demo.bean;

public class Employee {
    private String eId;
    private String eName;
    private String postId;
    private int age;
    private boolean isMarried;
    private String deptId;
    private int hireDate;

    public Employee(String eId, String eName, String postId, int age, boolean isMarried, String deptId, int hireDate) {
        this.eId = eId;
        this.eName = eName;
        this.postId = postId;
        this.age = age;
        this.isMarried = isMarried;
        this.deptId = deptId;
        this.hireDate = hireDate;
    }

    public String geteId() {
        return eId;
    }

    public void seteId(String eId) {
        this.eId = eId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public int getHireDate() {
        return hireDate;
    }

    public void setHireDate(int hireDate) {
        this.hireDate = hireDate;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eId='" + eId + '\'' +
                ", eName='" + eName + '\'' +
                ", postId='" + postId + '\'' +
                ", age=" + age +
                ", isMarried=" + isMarried +
                ", deptId='" + deptId + '\'' +
                ", hireDate=" + hireDate +
                '}';
    }
}
