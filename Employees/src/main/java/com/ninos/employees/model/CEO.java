package com.ninos.employees.model;

import com.ninos.employees.interfaces.Employee;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CEO implements Employee {
//    Daniel, Moshi, 4/4/1915, CEO, {avgStockPrice=300}
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private int avgStockPrice = 0;

    private final String peopleRegex = "(?<firstName>\\w+),\\s*(?<lastName>\\w+),\\s*(?<dob>\\d{1,2}/\\d{1,2}/\\d{4}),\\s*(?<role>\\w+)(?:,\\s*\\{(?<details>.*)\\})?\\n";
    private final Pattern peoplePat = Pattern.compile(peopleRegex);

    private final String ceoRegex = "\\w+\\=(?<avgStockPrice>\\w+)";
    private final Pattern ceoPat = Pattern.compile(ceoRegex);

    private final NumberFormat moneyFormat = NumberFormat.getCurrencyInstance();
    DateTimeFormatter dtformatter = DateTimeFormatter.ofPattern("M/d/yyyy");


    public CEO(String peopleText) {
        Matcher peopleMat = peoplePat.matcher(peopleText);
        if (peopleMat.find()){
            this.firstName = peopleMat.group("firstName");
            this.lastName = peopleMat.group("lastName");
            this.dob = LocalDate.from(dtformatter.parse(peopleMat.group("dob")));
            Matcher ceoMat = ceoPat.matcher(peopleMat.group("details"));
            if (ceoMat.find()){
                this.avgStockPrice = Integer.parseInt(ceoMat.group("avgStockPrice"));
            }
        }
    }


    public int getSalary(){
        return 6000 + avgStockPrice;
    }

    @Override
    public String toString() {
        return String.format("%s, %s: %s",firstName,lastName,moneyFormat.format(getSalary()));
    }



}
