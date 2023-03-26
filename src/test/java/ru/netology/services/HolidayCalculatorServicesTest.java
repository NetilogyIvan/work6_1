package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class HolidayCalculatorServicesTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/data.csv")
    public void OneOption(int income, int expenses, int threshold, int expected) {
        HolidayCalculatorServices services = new HolidayCalculatorServices();

        //int income = 10_000;
        //int expenses = 3_000;
        //int threshold = 20_000;
        //int expected = 3;

        int actual = services.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
    //@Test
    // public void TwoOption() {
    //HolidayCalculatorServices services= new HolidayCalculatorServices();

    // int income = 100_000;
    // int expenses = 60_000;
    //int threshold = 150_000;
    // int expected = 2;

    //int actual = services.calculate(income,expenses,threshold);
    //Assertions.assertEquals(expected,actual);
//}

}
