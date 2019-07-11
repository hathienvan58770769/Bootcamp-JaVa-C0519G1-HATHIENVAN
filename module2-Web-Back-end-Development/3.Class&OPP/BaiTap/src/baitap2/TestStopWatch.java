package baitap2;

import java.util.Scanner;

public class TestStopWatch {
    public static void main(String[] args) {
        int[] array;
        array = new int[100000];
    for (int i = 0; i < 100000;i++){
        array[i] = i;
    }
    StopWatch stopWatch = new StopWatch();
    stopWatch.start();
    SelectionSort selectionSort = new SelectionSort();
    selectionSort.sort(array);
    stopWatch.stop();
        System.out.println("Milisects is " + stopWatch.getElapsedTime());
        System.out.println("Sec is " + stopWatch.getElapsedTimeSecs());

    }
}
