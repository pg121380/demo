package com.example.demo.bean;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Education {

    private String eId;
    private String major;
    private String background;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date graduateDate;
    private String school;
    private String foreignLang;

    public String geteId() {
        return eId;
    }

    public void seteId(String eId) {
        this.eId = eId;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public Date getGraduateDate() {
        return graduateDate;
    }

    public void setGraduateDate(Date graduateDate) {
        this.graduateDate = graduateDate;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getForeignLang() {
        return foreignLang;
    }

    public void setForeignLang(String foreignLang) {
        this.foreignLang = foreignLang;
    }

    @Override
    public String toString() {
        return "Education{" +
                "eId='" + eId + '\'' +
                ", major='" + major + '\'' +
                ", background='" + background + '\'' +
                ", graduateDate=" + graduateDate +
                ", school='" + school + '\'' +
                ", foreignLang='" + foreignLang + '\'' +
                '}';
    }

    public Education(String eId, String major, String background, Date graduateDate, String school, String foreignLang) {
        this.eId = eId;
        this.major = major;
        this.background = background;
        this.graduateDate = graduateDate;
        this.school = school;
        this.foreignLang = foreignLang;
    }

    public Education() {
    }
}
