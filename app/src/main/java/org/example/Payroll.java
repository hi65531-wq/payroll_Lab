package org.example;

public class Payroll {
    private double calculateGrossPay(double hoursWorked) {
        double payRate = 16.78;

        if(hoursWorked <= 40) {
            return hoursWorked * payRate;
        }
        else {
            double regularPay = 40 * payrate;
            double overtimeHours = hoursWorked - 40;
            double overtimeRate = payRate * 1.5;
            double overtimePay = overtimeHours * overtimeRate;
            return regularPay + overtimePay;
        }
    }
    
}
