package org.example.prvnitestoprava;

public class Stats {

    private int year;
    private int countryCount;
    private double avgYear;
    private double highAvgYear;
    private double lowAvgYear;
    private String highestCountry;
    private String lowestCountry;

    public Stats(int year, int countryCount, double avgYear, double highAvgYear, double lowAvgYear, String highestCountry, String lowestCountry) {
        this.year = year;
        this.countryCount = countryCount;
        this.avgYear = avgYear;
        this.highAvgYear = highAvgYear;
        this.lowAvgYear = lowAvgYear;
        this.highestCountry = highestCountry;
        this.lowestCountry = lowestCountry;
    }


    public void setYear(int year) {
        this.year = year;
    }

    public void setCountryCount(int countryCount) {
        this.countryCount = countryCount;
    }

    public void setAvgYear(double avgYear) {
        this.avgYear = avgYear;
    }

    public void setHighAvgYear(double highAvgYear) {
        this.highAvgYear = highAvgYear;
    }

    public void setLowAvgYear(double lowAvgYear) {
        this.lowAvgYear = lowAvgYear;
    }

    public void setHighestCountry(String highestCountry) {
        this.highestCountry = highestCountry;
    }

    public void setLowestCountry(String lowestCountry) {
        this.lowestCountry = lowestCountry;
    }

    public int getYear() {
        return year;
    }

    public int getCountryCount() {
        return countryCount;
    }

    public double getAvgYear() {
        return avgYear;
    }

    public double getHighAvgYear() {
        return highAvgYear;
    }

    public double getLowAvgYear() {
        return lowAvgYear;
    }

    public String getHighestCountry() {
        return highestCountry;
    }

    public String getLowestCountry() {
        return lowestCountry;
    }
}
