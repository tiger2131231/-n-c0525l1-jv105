package ss3_Method.bai_tap;
import java.util.Scanner;
public class DeleteElementFromArray {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập số phần tử của mảng N: ");
            int N = sc.nextInt();
            int[] arr = new int[N];
            System.out.println("Nhập các phần tử của mảng:");
            for (int i = 0; i < N; i++) {
                System.out.print("arr[" + i + "] = ");
                arr[i] = sc.nextInt();
            }
            System.out.print("Nhập phần tử cần xoá X: ");
            int X = sc.nextInt();
            int index_del = -1;
            for (int i = 0; i < N; i++) {
                if (arr[i] == X) {
                    index_del = i;
                    break;
                }
            }
            if (index_del == -1) {
                System.out.println("Không tìm thấy phần tử " + X + " trong mảng.");
            } else {
                for (int i = index_del; i < N - 1; i++) {
                    arr[i] = arr[i + 1];
                }
                N--;
                System.out.println("Mảng sau khi xoá phần tử " + X + ":");
                for (int i = 0; i < N; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
            sc.close();
        }
}
