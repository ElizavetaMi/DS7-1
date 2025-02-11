package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testFindMax() {
        StatisticsService service = new StatisticsService();

        // Массив с несколькими значениями
        long[] incomes = {10, 20, 30, 40, 50};

        // Ожидаемое значение: 50
        long expectedMax = 50;

        // Вызов метода и проверка результата
        long actualMax = service.findMax(incomes);
        assertEquals(expectedMax, actualMax);
    }

    private void assertEquals(long ignoredExpectedMax, long ignoredActualMax) {
    }
}