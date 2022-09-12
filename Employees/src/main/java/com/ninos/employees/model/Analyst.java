package com.ninos.employees.model;

import com.ninos.employees.interfaces.Employee;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Analyst implements Employee {
//    Matthew1, Alkatoni1, 3/3/1910, Analyst, {projectCount=5}
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private int projectCount = 0;

    private final String peopleRegex = "(?<firstName>\\w+),\\s*(?<lastName>\\w+),\\s*(?<dob>\\d{1,2}/\\d{1,2}/\\d{4}),\\s*(?<role>\\w+)(?:,\\s*\\{(?<details>.*)\\})?\\n";
    private final Pattern peoplePat = Pattern.compile(peopleRegex);

    private final String analystRegex = "\\w+\\=(?<projectCount>\\w+)";
    private final Pattern analystPat = Pattern.compile(analystRegex);

    private final NumberFormat moneyFormat = NumberFormat.getCurrencyInstance();
    DateTimeFormatter dtformatter = DateTimeFormatter.ofPattern("M/d/yyyy");


    public Analyst(String peopleText) {
        Matcher peopleMat = peoplePat.matcher(peopleText);
        if (peopleMat.find()){
            this.firstName = peopleMat.group("firstName");
            this.lastName = peopleMat.group("lastName");
            this.dob = LocalDate.from(dtformatter.parse(peopleMat.group("dob")));
            Matcher analystMat = analystPat.matcher(peopleMat.group("details"));
            if (analystMat.find()){
                this.projectCount = Integer.parseInt(analystMat.group("projectCount"));
            }
        }
    }


    public int getSalary(){
        return 5000 + projectCount;
    }

    @Override
    public String toString() {
        return String.format("%s, %s: %s",firstName,lastName,moneyFormat.format(getSalary()));
    }



}
