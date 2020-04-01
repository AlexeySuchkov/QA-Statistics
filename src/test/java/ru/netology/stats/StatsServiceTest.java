package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

    @Test
    void findMax() {
        StatsService service = new StatsService();

        long[] incomes = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 85;

        long actual = service.sumAllMonths(incomes);

        assertEquals(expected, actual);
    }

    @Test
    void findAverage() {
        StatsService service = new StatsService();

        long[] incomes = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 7;

        long actual = service.averageSales(incomes);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxMonth() {
        StatsService service = new StatsService();

        long[] incomes = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 11;

        long actual = service.findMaxMonth(incomes);

        assertEquals(expected, actual);
    }

    @Test
    void findMinMonth() {
        StatsService service = new StatsService();

        long[] incomes = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 6;

        long actual = service.findMinMonth(incomes);

        assertEquals(expected, actual);
    }

    @Test
    void underAverageSales() {
        StatsService service = new StatsService();

        long[] incomes = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 5;

        long actual = service.underAverageSales(incomes);

        assertEquals(expected, actual);
    }

    @Test
    void aboveAverageSales() {
        StatsService service = new StatsService();

        long[] incomes = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 6;

        long actual = service.aboveAverageSales(incomes);

        assertEquals(expected, actual);
    }

}