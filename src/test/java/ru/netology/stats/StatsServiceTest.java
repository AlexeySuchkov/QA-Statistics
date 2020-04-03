package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

    @Test
    void findMax() {
        StatsService service = new StatsService();

        long[] incomes = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.sumAllMonths(incomes);

        assertEquals(expected, actual);
    }

    @Test
    void findAverage() {
        StatsService service = new StatsService();

        long[] incomes = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        long actual = service.averageSales(incomes);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxMonth() {
        StatsService service = new StatsService();

        long[] incomes = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        long actual = service.findMaxMonth(incomes);

        assertEquals(expected, actual);
    }

    @Test
    void findMinMonth() {
        StatsService service = new StatsService();

        long[] incomes = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        long actual = service.findMinMonth(incomes);

        assertEquals(expected, actual);
    }

    @Test
    void underAverageSales() {
        StatsService service = new StatsService();

        long[] incomes = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.underAverageSales(incomes);

        assertEquals(expected, actual);
    }

    @Test
    void aboveAverageSales() {
        StatsService service = new StatsService();

        long[] incomes = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.aboveAverageSales(incomes);

        assertEquals(expected, actual);
    }

}