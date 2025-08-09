package ss3_Method.bai_tap;
import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int N = 5;
        System.out.println("Nhập " + N + " phần tử ban đầu:");
        for (int i = 0; i < N; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Nhập số cần chèn X: ");
        int X = sc.nextInt();

        System.out.print("Nhập vị trí index cần chèn: ");
        int index = sc.nextInt();

        if (index <= -1 || index >= arr.length) {
            System.out.println("Không chèn được phần tử vào mảng.");
        } else {

            for (int i = N; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = X; ;

            System.out.println("Mảng sau khi chèn:");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}
