package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatServiceTest {
    @Test
    public void sum() {
        StatsService service = new StatsService();
        int[] monthSale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int sum = service.saleAmount(monthSale);
        int expected = 180;
        Assertions.assertEquals(expected, sum);
    }

    @Test
    public void average() {
        StatsService service = new StatsService();
        int[] monthSale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int average = service.averageSaleAmount(monthSale);
        int expected = 15;
        Assertions.assertEquals(expected, average);
    }

    @Test
    public void maxMonth() {
        StatsService service = new StatsService();
        int[] monthSale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int maxMonth = service.maxMonthSale(monthSale);
        int expected = 8;
        Assertions.assertEquals(expected, maxMonth);
    }

    @Test
    public void minMonth() {
        StatsService service = new StatsService();
        int[] monthSale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int minMonth = service.minMonthSale(monthSale);
        int expected = 9;
        Assertions.assertEquals(expected, minMonth);
    }

    @Test
    public void averageMin() {
        StatsService service = new StatsService();
        int[] monthSale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int averageMin = service.averageMin(monthSale);
        int expected = 5;
        Assertions.assertEquals(expected, averageMin);
    }

    @Test
    public void averageMax() {
        StatsService service = new StatsService();
        int[] monthSale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int averageMax = service.averageMax(monthSale);
        int expected = 5;
        Assertions.assertEquals(expected, averageMax);
    }
}

