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

}