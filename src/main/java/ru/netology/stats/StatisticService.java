package ru.netology.stats;

public class StatisticService {
    public int sum(int [] array) {
        int result = 0;
        for (int elem : array) {
            result += elem;
        }
        return result;
    }
}
