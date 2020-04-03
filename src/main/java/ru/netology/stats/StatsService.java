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
        StatsService service = new StatsService();
        long sumSales = service.sumAllMonths(incomes);
        long average;
        average = sumSales / monthsCount;
        return average;
    }


    public long findMaxMonth(long[] incomes) {
        long current_max_index;
        long current_max = incomes[0];
        long index = 0;

        for (long income : incomes)
            if (current_max <= income) {
                current_max = income;
                index = 0;
            } else index += 1;
            current_max_index = incomes.length - index;


            return current_max_index;
    }


    public long findMinMonth(long[] incomes) {
        long current_min_index;
        long current_min = incomes[0];
        long index = 0;

        for (long income : incomes)
            if (current_min >= income) {
                current_min = income;
                index = 0;
            } else index += 1;
        current_min_index = incomes.length - index;


        return current_min_index;
    }

    public long underAverageSales(long[] incomes) {
        long monthsCounter = 0;
        StatsService service = new StatsService();
        long average = service.averageSales(incomes);
        for (long income : incomes)
            if (income < average) {
                monthsCounter += 1;
            }
            else monthsCounter += 0;;
        return monthsCounter;
    }

    public long aboveAverageSales(long[] incomes) {
        long monthsCounter = 0;
        StatsService service = new StatsService();
        long average = service.averageSales(incomes);
        for (long income : incomes)
            if (income > average) {
                monthsCounter += 1;
            }
            else monthsCounter += 0;;
        return monthsCounter;
    }
}
