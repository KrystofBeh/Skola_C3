package org.example.prvnitestoprava;

public class Change {

    private String entity;
    private String code;
    private int fromYear;
    private int toYear;
    private double fromAvgYear;
    private double toAvgYear;
    private double absChange;
    private double perChange;

    public Change(String entity, String code, int fromYear, int toYear, double fromAvgYear, double toAvgYear, double absChange, double perChange) {
        this.entity = entity;
        this.code = code;
        this.fromYear = fromYear;
        this.toYear = toYear;
        this.fromAvgYear = fromAvgYear;
        this.toAvgYear = toAvgYear;
        this.absChange = absChange;
        this.perChange = perChange;
    }

    public String getEntity() {
        return entity;
    }

    public String getCode() {
        return code;
    }

    public int getFromYear() {
        return fromYear;
    }

    public int getToYear() {
        return toYear;
    }

    public double getFromAvgYear() {
        return fromAvgYear;
    }

    public double getToAvgYear() {
        return toAvgYear;
    }

    public double getAbsChange() {
        return absChange;
    }

    public double getPerChange() {
        return perChange;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setFromYear(int fromYear) {
        this.fromYear = fromYear;
    }

    public void setToYear(int toYear) {
        this.toYear = toYear;
    }

    public void setFromAvgYear(double fromAvgYear) {
        this.fromAvgYear = fromAvgYear;
    }

    public void setToAvgYear(double toAvgYear) {
        this.toAvgYear = toAvgYear;
    }

    public void setAbsChange(double absChange) {
        this.absChange = absChange;
    }

    public void setPerChange(double perChange) {
        this.perChange = perChange;
    }
}
