package com.flexy.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by arunv on 12/10/16.
 */
public class MonthAttendance implements Serializable {

    private String percentage;

    private String medicalLeaves;

    private String plannedLeaves;

    private String urgentLeaves;

    private String monthYear;

    public String getPercentage() {
        return percentage;
    }

    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }

    public String getMedicalLeaves() {
        return medicalLeaves;
    }

    public void setMedicalLeaves(String medicalLeaves) {
        this.medicalLeaves = medicalLeaves;
    }

    public String getPlannedLeaves() {
        return plannedLeaves;
    }

    public void setPlannedLeaves(String plannedLeaves) {
        this.plannedLeaves = plannedLeaves;
    }

    public String getUrgentLeaves() {
        return urgentLeaves;
    }

    public void setUrgentLeaves(String urgentLeaves) {
        this.urgentLeaves = urgentLeaves;
    }

    public String getMonthYear() {
        return monthYear;
    }

    public void setMonthYear(String monthYear) {
        this.monthYear = monthYear;
    }

}