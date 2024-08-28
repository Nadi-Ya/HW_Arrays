package ru.netology.stats;

public class StatService {
    public long sumSales(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }

        return totalSale;
    }


    public long averageSale(long[] sales) {
        return sumSales(sales) / sales.length;
    }

    public int calcMonthMaxSale(long[] sales) {
        int monthMax = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] >= sales[monthMax]) {
                monthMax = i;
            }
        }
        return monthMax + 1;
    }
    public int calcMonthsBellowAverage(long[] sales) {
        long average = averageSale(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale < average) {
                counter++;
            }
        }
        return counter;
    }
    public int calcMonthsAboveAverage(long[] sales) {
        long average = averageSale(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > average) {
                count++;
            }
        }
        return count;
    }
    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }
}














