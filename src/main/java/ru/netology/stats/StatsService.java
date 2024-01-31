package ru.netology.stats;

public class StatsService {
    public int sumAll(int[] salesData) {
        int sum = 0;
        for (int currentDaySalesData : salesData) {
            sum += currentDaySalesData;
        }
        return sum;
    }

    public int averageAmount(int[] salesData) {
        int sum = sumAll(salesData);
        int quantity = salesData.length;
        return Math.round(sum / quantity);
    }

    public int maxNumberOfSales(int[] salesData) {
        int maxNumber = 0;
        for (int i = 0; i < salesData.length; i++) {
            if (salesData[i] >= salesData[maxNumber]) {
                maxNumber = i;
            }
        }
        return maxNumber + 1;
    }

    public int minNumberOfSales(int[] salesData) {
        int minNumber = 0;
        for (int i = 0; i < salesData.length; i++) {
            if (salesData[i] <= salesData[minNumber]) {
                minNumber = i;
            }
        }
        return minNumber + 1;
    }

    public int monthBelowAverage(int[] salesData) {
        int counter = 0;
        int average = averageAmount(salesData);
        for (int i = 0; i < salesData.length; i++) {
            if (salesData[i] < average) {
                counter += 1;
            }
        }
        return counter;
    }

    public int monthAboveAverage(int[] salesData) {
        int counter = 0;
        int average = averageAmount(salesData);
        for (int i = 0; i < salesData.length; i++) {
            if (salesData[i] > average) {
                counter += 1;
            }
        }
        return counter;
    }
}
