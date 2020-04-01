package ru.netology.stats;

public class StatsService {
    public long sumAllMonths(long[] incomes) {

        long sumSales = 0;
        for (long income : incomes)
            sumSales += income;
        return sumSales;
    }

    public long averageSales(long[] incomes) {
        long monthsCount = incomes.length;
        long sumSales = 0;

        for (long income : incomes)
            sumSales += income;
        long average;
        average = sumSales / monthsCount;
        return average;
    }


    public long findMaxMonth(long[] incomes) {
        long current_max_index = 0;
        long index = 0;
        long current_max = incomes[0];
        for (long income : incomes)
            if (income > 0)
            index += 1;
        for (long income : incomes)
            if (current_max < income) {
                current_max_index = index;
            }
        return current_max_index;
    }


    public long findMinMonth(long[] incomes) {
        long monthsCounter = 0;
        long current_min = incomes[0];
        long index = 1;
        for (long income : incomes)
            if (current_min > income)
                monthsCounter = incomes.length;
        index = index + 1;
        return monthsCounter;
    }

    public long underAverageSales(long[] incomes) {
        long monthsCount = incomes.length;
        long monthsCounter = 0;
        long sumSales = 0;

        for (long income : incomes)
            sumSales += income;
        long average;
        average = sumSales / monthsCount;
        for (long income : incomes)
            if (income < average) {
                monthsCounter += 1;
            }
            else monthsCounter += 0;;
        return monthsCounter;
    }

    public long aboveAverageSales(long[] incomes) {
        long monthsCount = incomes.length;
        long monthsCounter = 0;
        long sumSales = 0;

        for (long income : incomes)
            sumSales += income;
        long average;
        average = sumSales / monthsCount;
        for (long income : incomes)
            if (income > average) {
                monthsCounter += 1;
            }
            else monthsCounter += 0;;
        return monthsCounter;
    }
}
