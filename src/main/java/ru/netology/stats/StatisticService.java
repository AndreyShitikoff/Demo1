package ru.netology.stats;

public class StatisticService {
    public int sum(int [] array) {
        int result = 0;
        for (int elem : array) {
            result += elem;
        }
        return result;
    }

    public int average(int[] array) {
        return sum(array) / array.length;
    }

    public int withMax(int[] array) {
        int max = getMax(array);

        int monthCount = 1;
        int monthWithMax = 0;
        for (int elem : array) {
            if (elem == max) {
                monthWithMax = monthCount;
            }
            monthCount++;

        }
        return monthWithMax;
    }

    public int getMax(int[] array) {
        int max = array[0];
        for (int elem : array) {
            if (max < elem) {
                max = elem;
            }
        }
        return max;
    }

    public int withMin(int[] array) {
        int min = getMin(array);

        int monthCount = 1;
        int monthWithMin = 0;
        for (int elem : array) {
            if (elem == min) {
                monthWithMin = monthCount;
            }
            monthCount++;

        }
        return monthWithMin;
    }

    public int getMin(int[] array) {
        int min = array[0];
        for (int elem : array) {
            if (min > elem) {
                min = elem;
            }
        }
        return min;
    }


    public int moreThanAverage(int[] array) {
        int average = average(array);

        int count = 0;

        for (int elem : array) {
            if (elem > average) {
                count++;
            }
        }

        return count;
    }

    public int lessThanAverage(int[] array) {
        int average = average(array);

        int count = 0;

        for (int elem : array) {
            if (elem < average) {
                count++;
            }
        }

        return count;
    }
}
