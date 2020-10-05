package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticServiceTest {
    private int[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    private StatisticService service = new StatisticService();

    @Test
    void shouldSum() {
        int expected = 180;

        int actual = service.sum(array);

        assertEquals(expected, actual);
    }

    @Test
    void shouldAverage() {

        assertEquals(15, service.average(array));
    }

    @Test
    void shouldReturnMonthNumberWithMax() {
        assertEquals(8, service.withMax(array));
    }

    @Test
    void shouldReturnMonthNumberWithMin() {
        assertEquals(9, service.withMin(array));
    }

    @Test
    void shouldReturnMonthCountWithMaxThanAverage() {
        assertEquals(5, service.moreThanAverage(array));
    }

    @Test
    void shouldReturnMonthCountWithMinThanAverage() {
        assertEquals(5, service.lessThanAverage(array));
    }

}