package ru.netology.stats;

public class StatsService {
    public int saleAmount(int[] monthSale) {
        int sum = 0;
        for (int i = 0; i < monthSale.length; i++) {
            sum = sum + monthSale[i];
        }
        return sum;
    }

    public int averageSaleAmount(int[] monthSale) {
        int sum = saleAmount(monthSale);
        int average = sum / monthSale.length;
        return average;
    }

    public int maxMonthSale(int[] monthSale) {
        int maxMonthSale = 0;

        for (int i = 0; i < monthSale.length; i++) {
            if (monthSale[i] >= monthSale[maxMonthSale]) {
                maxMonthSale = i;
            }
        }
        return maxMonthSale + 1;
    }

    public int minMonthSale(int[] monthSale) {
        int minMonthSale = 0;

        for (int i = 0; i < monthSale.length; i++) {
            if (monthSale[i] <= monthSale[minMonthSale]) {
                minMonthSale = i;
            }
        }
        return minMonthSale + 1;
    }

    public int averageMin(int[] monthSale) {
        int average = averageSaleAmount(monthSale);
        int averagemin = 0;
        for (int i = 0; i < monthSale.length; i++) {
            if (monthSale[i] < average) {
                averagemin++;
            }
        }
        return averagemin;
    }

    public int averageMax(int[] monthSale) {
        int average = averageSaleAmount(monthSale);
        int averagemax = 0;
        for (int i = 0; i < monthSale.length; i++) {
            if (monthSale[i] > average) {
                averagemax++;
            }
        }
        return averagemax;
    }

}

