package automation_test.mortgage_calculator;

import automation_test.BaseUIClass;
import org.testng.annotations.Test;
import page_objects.Home;
import utilities.DateUtils;

public class CalculateMortgageRate extends BaseUIClass {
    @Test
    public void calculateMonthlyPayment() {
        String[] date = DateUtils.returnNextMonth();
        new Home(driver)
                .typeHomePrice("300000")
                .clickDownPaymentInDollar()
                .typeDownPayment("60000")
                .typeLoanAmount("240000")
                .typeInterestRate("3")
                .typeLoanTermYears("30")
                .selectMonth(date[0])
                .typeYear(date[1])
                .typePropertyTax("5000")
                .typePMI("0.5")
                .typeHomeOwnerInsurance("1000")
                .typeMonthlyHOA("100")
                .selectLoanType("FHA")
                .selectBuyOrRefinance("Buy")
                .clickOnCalculateButton()
                .validateTotalMonthlyPayment("1,611.85");
    }
}
