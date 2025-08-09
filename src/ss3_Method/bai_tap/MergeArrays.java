package ss3_Method.bai_tap;
import java.util.Scanner;

public class MergeArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Nhập kích thước mảng 1: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];

        System.out.print("Nhập kích thước mảng 2: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];

        System.out.println("Nhập phần tử mảng 1:");
        for (int i = 0; i < n1; i++) {
            System.out.print("arr1[" + i + "] = ");
            arr1[i] = sc.nextInt();
        }

        System.out.println("Nhập phần tử mảng 2:");
        for (int i = 0; i < n2; i++) {
            System.out.print("arr2[" + i + "] = ");
            arr2[i] = sc.nextInt();
        }

        int[] arr3 = new int[n1 + n2];

        for (int i = 0; i < n1; i++) {
            arr3[i] = arr1[i];
        }

        for (int i = 0; i < n2; i++) {
            arr3[n1 + i] = arr2[i];
        }

        System.out.println("Mảng sau khi gộp:");
        for (int value : arr3) {
            System.out.print(value + " ");
        }

        sc.close();
    }
}
