package ss3_Method.bai_tap;
import java.util.Scanner;

public class FindTheSmallestValueInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số phần tử của mảng: ");
        int SIZE = sc.nextInt();
        int[] arr = new int[SIZE];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < SIZE; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }

        int min = arr[0];

        for (int i = 1; i < SIZE; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Giá trị nhỏ nhất trong mảng là: " + min);

        sc.close();
    }
}
