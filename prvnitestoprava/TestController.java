package org.example.prvnitestoprava;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class TestController {
    Data data = new Data();

    @GetMapping("/top-countries")
    public List<TopCountries> getTopCountries(@RequestParam Integer year, @RequestParam(required = false) Integer min,  @RequestParam(required = false) Integer limit) {
        ArrayList<Countries> countries = data.getData();
        ArrayList<TopCountries> topCountries = new ArrayList<>();

        if (limit == null){
            limit = countries.size();
        }


        if (min == null){
            countries = countries.stream()
                    .filter(i -> i.getYear() == year)
                    .limit(limit)
                    .collect(Collectors.toCollection(ArrayList::new));
        }else {
            countries = countries.stream()
                    .filter(i -> i.getYear() == year)
                    .filter(i -> i.getAvgYear() >= min)
                    .limit(limit)
                    .collect(Collectors.toCollection(ArrayList::new));

        }

        double prumer = countries.stream()
                .map(i -> i.getAvgYear())
                .reduce(0.0, (a, b) -> a + b) / countries.size();

        for (Countries c : countries) {
            double rozdil = prumer - c.getAvgYear();
            topCountries.add(new TopCountries(c.getEntity(), c.getCode(), c.getYear(), prumer, rozdil));
        }

        return topCountries;
    }



    @GetMapping("/stats")
    public Stats getStats(@RequestParam Integer year) {
        ArrayList<Countries> countries = data.getData();

        countries = countries.stream()
                .filter(i -> i.getYear() == year)
                .collect(Collectors.toCollection(ArrayList::new));

        double prumer = countries.stream()
                .map(i -> i.getAvgYear())
                .reduce(0.0, (a, b) -> a + b) / countries.size();


        Countries highest = countries.stream()
                .max(Comparator.comparingDouble(Countries::getAvgYear))
                .orElse(null);

        Countries lowest = countries.stream()
                .min(Comparator.comparingDouble(Countries::getAvgYear))
                .orElse(null);



        Stats stats = new Stats(year,
                countries.size(),
                prumer,
                highest.getAvgYear(),
                lowest.getAvgYear(),
                highest.getEntity(),
                lowest.getEntity()
        );
        return stats;
    }

    @GetMapping("/countries/{country}/change")
    public Change getChange(@PathVariable String country, @RequestParam Integer from, @RequestParam Integer to) {
        ArrayList<Countries>  countries = data.getData();

        Countries fromCountry = countries.stream()
                .filter(i -> i.getEntity().equalsIgnoreCase(country))
                .filter(i -> i.getYear() == from)
                .findFirst()
                .orElse(null);

        Countries toCountry = countries.stream()
                .filter(i -> i.getEntity().equalsIgnoreCase(country))
                .filter(i -> i.getYear() == to)
                .findFirst()
                .orElse(null);

        double absChange = Math.abs(fromCountry.getAvgYear() - toCountry.getAvgYear());
        double perChange = (toCountry.getAvgYear() - fromCountry.getAvgYear()) / fromCountry.getAvgYear() * 100;


        Change change = new Change(
                country,
                fromCountry.getCode(),
                from,
                to,
                fromCountry.getAvgYear(),
                toCountry.getAvgYear(),
                absChange,
                perChange
        );
        return change;
    }





}
