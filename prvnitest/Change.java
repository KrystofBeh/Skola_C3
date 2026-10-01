package org.example.prvnitest;

public class Change {

    private String name;
    private String code;
    private int startYear;
    private int endYear;
    private double startAvgYears;
    private double endAvgYears;
    private double diff;
    private double perDiff;

    public Change(String name, String code, int startYear, int endYear, double startAvgYears, double endAvgYears, double diff, double perDiff) {
        this.name = name;
        this.code = code;
        this.startYear = startYear;
        this.endYear = endYear;
        this.startAvgYears = startAvgYears;
        this.endAvgYears = endAvgYears;
        this.diff = diff;
        this.perDiff = perDiff;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public void setEndYear(int endYear) {
        this.endYear = endYear;
    }

    public void setStartAvgYears(double startAvgYears) {
        this.startAvgYears = startAvgYears;
    }

    public void setEndAvgYears(double endAvgYears) {
        this.endAvgYears = endAvgYears;
    }

    public void setDiff(double diff) {
        this.diff = diff;
    }

    public void setPerDiff(double perDiff) {
        this.perDiff = perDiff;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public int getStartYear() {
        return startYear;
    }

    public int getEndYear() {
        return endYear;
    }

    public double getStartAvgYears() {
        return startAvgYears;
    }

    public double getEndAvgYears() {
        return endAvgYears;
    }

    public double getDiff() {
        return diff;
    }

    public double getPerDiff() {
        return perDiff;
    }
}
