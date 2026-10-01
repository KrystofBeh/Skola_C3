package org.example.prvnitest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

@RestController
public class TestController {
    Data data = new Data();

    @GetMapping("/top-countries")
    public ArrayList<TopCountries> getTopCountries(@RequestParam int year, @RequestParam double min,  @RequestParam int limit) {
        ArrayList<Mens> countries = data.getData();

        countries = countries.stream()
                .filter(i -> i.getYear() == year)
                .filter(i -> i.getAvgYears() >= min)
                .sorted((x1, x2) -> Double.compare(x1.getAvgYears(), x2.getAvgYears()))
                .limit(limit)
                .collect(Collectors.toCollection(ArrayList::new));

        double prumer = countries.stream()
                .map(i -> i.getAvgYears())
                .reduce(0.0, Double::sum) / countries.size();

        ArrayList<TopCountries> topCountries = new ArrayList<>();
        for (Mens mens : countries) {
            double diff =  mens.getAvgYears() - prumer;
            topCountries.add(new TopCountries(
                    mens.getEntity(),
                    mens.getCode(),
                    mens.getYear(),
                    mens.getAvgYears(),
                    diff
            ));
        }

        return topCountries;


    }

    @GetMapping("/stats")
    public Stats getStats(@RequestParam int year) {
        ArrayList<Mens> countries = data.getData();

        countries = countries.stream()
                .filter(i -> i.getYear() == year)
                .sorted((u1, u2) -> Double.compare(u1.getAvgYears(), u2.getAvgYears()))
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println("Found " + countries.size() + " countries");


        double prumer = countries.stream()
                .map(i -> i.getAvgYears())
                .reduce(0.0, Double::sum) / countries.size();


        Stats stats = new Stats(
                year,
                countries.size(),
                prumer,
                countries.get(0).getAvgYears(),
                countries.get(countries.size() - 1).getAvgYears(),
                countries.get(0).getEntity(),
                countries.get(countries.size() -1).getEntity()
                );

        return stats;


    }


    @GetMapping("/countries/{country}/change")
    public Change getChange(@PathVariable String country, @RequestParam int from, @RequestParam int to) {
        ArrayList<Mens> countries = data.getData();

        return null;

    };





}
