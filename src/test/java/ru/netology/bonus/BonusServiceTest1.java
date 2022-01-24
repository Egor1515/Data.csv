package ru.netology.bonus;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest1 {

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv2")
        void shouldCalculate(String testName, boolean registered, int amount, long expected ){

            BonusService service = new BonusService();

            long actual = service.calculate(amount,registered);


            assertEquals(expected,actual);
        }

}