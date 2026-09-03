package org.example;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    Payroll payroll = new Payroll();

    double payRate = 16.78;
    double unionDues = 10.00;

    System.out.println("Welcome to the Payroll Program!");
    System.out.print("How many hours did you work this week? ");
    double hoursWorked = input.nextDouble();

    System.out.println("How many dependents do you have? ");
    int dependents = input.nextInt();

    double grossPay = payroll.calcGrossPay(hoursWorked);
    double socialSecurity = payroll.calcSocialSecurity(grossPay);
    double federalTax = payroll.calcFederalTax(grossPay);
    double stateTax = payroll.calcStateTax(grossPay);
    double insurance = payroll.calcInsurance(dependents);
    double netPay = payroll.calcNetPay(grossPay, dependents);

    System.out.println();
    System.out.println("Payroll Stub:");
    System.out.printf("Hours:       %.1f%n", hoursWorked);
    System.out.printf("Rate:        $%.2f/hr%n", payRate);
    System.out.printf("Gross Pay:   $%.2f%n", grossPay);
    System.out.printf("SocSec:      $%.2f%n", socialSecurity);
    System.out.printf("FedTax:      $%.2f%n", federalTax);
    System.out.printf("State Tax:   $%.2f%n", stateTax);
    System.out.printf("Union:       $%.2f%n", unionDues);
    System.out.printf("Insurance:   $%.2f%n", insurance);
    System.out.printf("Net Pay:     $%.2f%n", netPay);
    System.out.println();
    System.out.println("Thank you for using the Payroll Program!");

    
    input.close();
  }
}
