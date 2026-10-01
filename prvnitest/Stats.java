package org.example.prvnitest;

public class Stats {
    private int year;
    private int countriesCount;
    private double prumer;
    private double maxAvgYears;
    private double minAvgYears;
    private String maxCountry;
    private String minCountry;

    public Stats(int year, int countriesCount, double prumer, double maxAvgYears, double minAvgYears, String maxCountry, String minCountry) {
        this.year = year;
        this.countriesCount = countriesCount;
        this.prumer = prumer;
        this.maxAvgYears = maxAvgYears;
        this.minAvgYears = minAvgYears;
        this.maxCountry = maxCountry;
        this.minCountry = minCountry;
    }


    public void setPrumer(double prumer) {
        this.prumer = prumer;
    }

    public double getPrumer() {
        return prumer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setCountriesCount(int countriesCount) {
        this.countriesCount = countriesCount;
    }

    public void setMaxAvgYears(double maxAvgYears) {
        this.maxAvgYears = maxAvgYears;
    }

    public void setMinAvgYears(double minAvgYears) {
        this.minAvgYears = minAvgYears;
    }

    public void setMaxCountry(String maxCountry) {
        this.maxCountry = maxCountry;
    }

    public void setMinCountry(String minCountry) {
        this.minCountry = minCountry;
    }

    public int getYear() {
        return year;
    }

    public int getCountriesCount() {
        return countriesCount;
    }

    public double getMaxAvgYears() {
        return maxAvgYears;
    }

    public double getMinAvgYears() {
        return minAvgYears;
    }

    public String getMaxCountry() {
        return maxCountry;
    }

    public String getMinCountry() {
        return minCountry;
    }
}
