package ss4_OOP.bai_tap.Xay_dung_lop_Fan;

import java.util.Random;

public class TestStopWatch {
    public static void main(String[] args) {

        int size = 100000;
        int[] arr = new int[size];
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(1000000);
        }

        StopWatch stopwatch = new StopWatch();
        stopwatch.start();

        selectionSort(arr);

        stopwatch.stop();
        System.out.println("Thời gian thực thi Selection Sort: "
                + stopwatch.getElapsedTime() + " ms");
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
