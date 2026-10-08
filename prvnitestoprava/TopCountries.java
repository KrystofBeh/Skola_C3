package org.example.prvnitestoprava;


public class TopCountries {

    private String entity;
    private String code;
    private int year;
    private double avgYear;
    private double rozdil;

    public TopCountries(String entity, String code, int year, double avgYear, double rozdil) {
        this.entity = entity;
        this.code = code;
        this.year = year;
        this.avgYear = avgYear;
        this.rozdil = rozdil;
    }

    public void setRozdil(double rozdil) {
        this.rozdil = rozdil;
    }

    public double getRozdil() {
        return rozdil;
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

    public double getAvgYear() {
        return avgYear;
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

    public void setAvgYear(double avgYear) {
        this.avgYear = avgYear;
    }
}

