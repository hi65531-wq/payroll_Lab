package org.example;

public class Payroll {
    public double calcGrossPay(double hoursWorked) {
        double payRate = 16.78;

        if(hoursWorked <= 40) {
            return hoursWorked * payRate;
        }
        else {
            double regularPay = 40 * payRate;
            double overtimeHours = hoursWorked - 40;
            double overtimeRate = payRate * 1.5;
            double overtimePay = overtimeHours * overtimeRate;
            return regularPay + overtimePay;
        }
    }
    
    public double calcSocialSecurity(double grossPay) {
        return grossPay * 0.06;
    }

    public double calcFederalTax(double grossPay) {
        return grossPay * 0.14;
    }

    public double calcStateTax(double grossPay) {
        return grossPay * 0.05;
    }

    public double calcInsurance(int dependents) {
        if(dependents > 3) {
            return 35.00;
        }
        else {
            return 15.00;
        }
    }

    public double calcNetPay(double grossPay, int dependents) {
    double socialSecurity = calcSocialSecurity(grossPay);
    double federalTax = calcFederalTax(grossPay);
    double stateTax = calcStateTax(grossPay);
    double insurance = calcInsurance(dependents);
    double unionDues = 10.00;

    double totalDeductions = socialSecurity + federalTax + stateTax + unionDues + insurance;
    return grossPay - totalDeductions;
    }


}
