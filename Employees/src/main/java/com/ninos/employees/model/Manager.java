package com.ninos.employees.model;

import com.ninos.employees.interfaces.Employee;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Manager implements Employee {
//    Nahrain1, Koka1, 2/2/1905, Manager, {orgSize=300,dr=10}

    private String firstName;
    private String lastName;
    private LocalDate dob;
    private int orgSize = 0;
    private int directorReport = 0;

    private final String peopleRegex = "(?<firstName>\\w+),\\s*(?<lastName>\\w+),\\s*(?<dob>\\d{1,2}/\\d{1,2}/\\d{4}),\\s*(?<role>\\w+)(?:,\\s*\\{(?<details>.*)\\})?\\n";
    private final Pattern peoplePat = Pattern.compile(peopleRegex);

    private final String managerRegex = "\\w+\\=(?<orgSize>\\w+),\\w+\\=(?<dr>\\w+)";
    private final Pattern managerPat = Pattern.compile(managerRegex);

    private final NumberFormat moneyFormat = NumberFormat.getCurrencyInstance();
    DateTimeFormatter dtformatter = DateTimeFormatter.ofPattern("M/d/yyyy");


    public Manager(String peopleText) {
        Matcher peopleMat = peoplePat.matcher(peopleText);
        if (peopleMat.find()){
            this.firstName = peopleMat.group("firstName");
            this.lastName = peopleMat.group("lastName");
            this.dob = LocalDate.from(dtformatter.parse(peopleMat.group("dob")));
            Matcher managerMat = managerPat.matcher(peopleMat.group("details"));
            if (managerMat.find()){
                this.orgSize = Integer.parseInt(managerMat.group("orgSize"));
                this.directorReport = Integer.parseInt(managerMat.group("dr"));
            }
        }
    }


    public int getSalary(){
        return 4000 + orgSize + directorReport;
    }

    @Override
    public String toString() {
        return String.format("%s, %s: %s",firstName,lastName,moneyFormat.format(getSalary()));
    }



}
