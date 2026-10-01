package org.example.prvnitest;

public class TopCountries {
    private String entity;
    private String code;
    private int year;
    private double avgYears;
    private double diff;

    public TopCountries(String entity, String code, int year, double avgYears, double diff) {
        this.entity = entity;
        this.code = code;
        this.year = year;
        this.avgYears = avgYears;
        this.diff = diff;
    }

    public String getEntity() {
        return entity;
    }

    public String getCode() {
        return code;
    }

    public int getYear() {
        return year;
    }

    public double getAvgYears() {
        return avgYears;
    }

    public double getDiff() {
        return diff;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAvgYears(double avgYears) {
        this.avgYears = avgYears;
    }

    public void setDiff(double diff) {
        this.diff = diff;
    }
}
