package com.ninos.employees;

import com.ninos.employees.interfaces.Employee;
import com.ninos.employees.model.Analyst;
import com.ninos.employees.model.CEO;
import com.ninos.employees.model.Manager;
import com.ninos.employees.model.Programmer;

import java.text.NumberFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String people = """
            Ninoos1, Moshi1, 1/1/1900, Programmer, {locpd=2000,yoe=10,iq=140}
            Ninoos2, Moshi2, 1/1/1900, Programmer, {locpd=1000,yoe=14,iq=120}
            Ninoos3, Moshi3, 1/1/1900, Programmer, {locpd=500,yoe=12,iq=110}
            Ninoos4, Moshi4, 1/1/1900, Programmer, {locpd=3000,yoe=15,iq=100}
            Nahrain1, Koka1, 2/2/1905, Manager, {orgSize=300,dr=10}
            Nahrain2, Koka2, 2/2/1905, Manager, {orgSize=200,dr=11}
            Nahrain3, Koka3, 2/2/1905, Manager, {orgSize=400,dr=15}
            Nahrain4, Koka4, 2/2/1905, Manager, {orgSize=600,dr=12}
            Matthew1, Alkatoni1, 3/3/1910, Analyst, {projectCount=5}
            Matthew2, Alkatoni2, 3/3/1910, Analyst, {projectCount=2}
            Matthew2, Alkatoni3, 3/3/1910, Analyst, {projectCount=3}
            Daniel, Moshi, 4/4/1915, CEO, {avgStockPrice=300}
            """;

        String peopleRegex = "(?<firstName>\\w+),\\s*(?<lastName>\\w+),\\s*(?<dob>\\d{1,2}/\\d{1,2}/\\d{4}),\\s*(?<role>\\w+)(?:,\\s*\\{(?<details>.*)\\})?\\n";
        Pattern peoplePat = Pattern.compile(peopleRegex);
        Matcher peopleMat = peoplePat.matcher(people);


//        String progRegex = "\\w+=(?<locpd>\\w+),\\w+=(?<yoe>\\w+),\\w+=(?<iq>\\w+)";
//        Pattern coderPat = Pattern.compile(progRegex);
//
//        String managerRegex = "\\w+\\=(?<orgSize>\\w+),\\w+\\=(?<dr>\\w+)";
//        Pattern managerPat = Pattern.compile(managerRegex);
//
//        String analystRegex = "\\w+\\=(?<projectCount>\\w+)";
//        Pattern analystPat = Pattern.compile(analystRegex);
//
//        String ceoRegex = "\\w+\\=(?<avgStockPrice>\\w+)";
//        Pattern ceoPat = Pattern.compile(ceoRegex);

        int totalPayoutSalaries = 0;
        while (peopleMat.find()) {

            totalPayoutSalaries+= switch (peopleMat.group("role")){
              case "Programmer" -> {
                  Employee programmer = new Programmer(peopleMat.group());
//                  String details = peopleMat.group("details");
//                  Matcher coderMat = coderPat.matcher(details);
//                  int salary = 0;
//                  if (coderMat.find()){
//                      int locpd = Integer.parseInt(coderMat.group("locpd"));
//                      int yoe = Integer.parseInt(coderMat.group("yoe"));
//                      int iq = Integer.parseInt(coderMat.group("iq"));
////                      System.out.printf("Programmer locpd: %s yoe: %s iq: %s%n", locpd, yoe, iq);
//                      salary = 3000 + locpd + yoe + iq;
//                  }else {
//                      salary = 3000;
//                  }
//                  yield salary;
                  System.out.println(programmer.toString());
                    yield programmer.getSalary();
              }
                case "Manager" -> {
                    Employee manager = new Manager(peopleMat.group());
//                    String details = peopleMat.group("details");
//                    Matcher managerMat = managerPat.matcher(details);
//                    int salary = 0;
//                    if (managerMat.find()){
//                        int orgSize = Integer.parseInt(managerMat.group("orgSize"));
//                        int directReport = Integer.parseInt(managerMat.group("dr"));
////                        System.out.printf("Manager orgSize: %s dr: %s%n", orgSize, directReport);
//                        salary = 4000 + orgSize + directReport;
//                    }else {
//                         salary = 4000;
//                    }
//                    yield salary;
                    System.out.println(manager.toString());
                    yield manager.getSalary();
              }
              case "Analyst" -> {
                  Employee analyst = new Analyst(peopleMat.group());
//                  String details = peopleMat.group("details");
//                  Matcher analystMat = analystPat.matcher(details);
//                  int salary=0;
//                  if (analystMat.find()){
//                      int projectCountTemp = Integer.parseInt(analystMat.group("projectCount"));
//                      System.out.printf("Analyst of project count: %s%n", projectCountTemp);
//                      salary = 5000 + projectCountTemp;
//                  }else {
//                      salary = 5000;
//                  }
//                  yield salary;
                  System.out.println(analyst.toString());
                  yield analyst.getSalary();
              }
              case "CEO" -> {
                  Employee ceo = new CEO(peopleMat.group());
//                  String details = peopleMat.group("details");
//                  Matcher ceoMat = ceoPat.matcher(details);
//                  int salary = 0;
//                  if (ceoMat.find()){
//                      int ceoCountTemp = Integer.parseInt(ceoMat.group("avgStockPrice"));
//                      System.out.printf("CEO of avgStockPrice: %s%n", ceoCountTemp);
//                      salary = 6000 + ceoCountTemp;
//                  }else {
//                      salary = 6000;
//                  }
//                  yield salary;
                  System.out.println(ceo.toString());
                  yield ceo.getSalary();
              }
               default -> 0;
           };
        }
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        System.out.printf("The Total of Salaries %s%n", currencyInstance.format(totalPayoutSalaries));
    }

}
