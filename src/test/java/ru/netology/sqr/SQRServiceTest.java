package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/java/Resources/Sqrt.csv")

    public void shouldCalculateTheBoundariesOfSquares(int expected, int minNumber, int maxNumber) {
        SQRService service = new SQRService();

        int actual = service.calculateSQR(minNumber, maxNumber);

        Assertions.assertEquals(expected, actual);
    }
}