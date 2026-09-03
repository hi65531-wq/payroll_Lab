package org.example;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PayrollTest {

    Payroll payroll;

    @BeforeEach
    void setUp() {
        payroll = new Payroll();
    }

    @Test
    public void test30HoursGrossPay() {
        assertEquals(503.40, payroll.calcGrossPay(30), 0.01);
    }

    @Test
    public void test40HoursGrossPay() {
        assertEquals(671.20, payroll.calcGrossPay(40), 0.01);
    }

    @Test
    public void test45HoursGrossPay() {
        assertEquals(797.05, payroll.calcGrossPay(45), 0.01);
    }

    @Test
    public void testSocialSecurity() {
        assertEquals(30.20, payroll.calcSocialSecurity(503.40), 0.01);
    }

    @Test
    public void testFederalTax() {
        assertEquals(70.48, payroll.calcFederalTax(503.40), 0.01);
    }

    @Test
    public void testStateTax() {
        assertEquals(25.17, payroll.calcStateTax(503.40), 0.01);
    }

    @Test
    public void testInsuranceWithZeroDependents() {
        assertEquals(15.00, payroll.calcInsurance(0), 0.01);
    }

    @Test
    public void testInsuranceWithTwoDependents() {
        assertEquals(15.00, payroll.calcInsurance(2), 0.01);
    }

    @Test
    public void testInsuranceWithThreeDependents() {
        assertEquals(35.00, payroll.calcInsurance(3), 0.01);
    }

    @Test
    public void testInsuranceWithFourDependents() {
        assertEquals(35.00, payroll.calcInsurance(4), 0.01);
    }

    @Test
    public void testNetPay() {
        double grossPay = payroll.calcGrossPay(30);
        assertEquals(332.55, payroll.calcNetPay(grossPay, 4), 0.01);
    }
}
