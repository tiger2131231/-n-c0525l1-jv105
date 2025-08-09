package ss3_Method.bai_tap;

public class FindAvailableMatrix {
    public static void main(String[] args) {
        // Khởi tạo nhanh ma trận 2 chiều
        double[][] matrix = {
                {1.2, 3.4, 5.6},
                {7.8, 2.5, 4.4},
                {0.5, 9.1, 8.2}
        };

        // Giả sử phần tử đầu tiên là lớn nhất
        double max = matrix[0][0];
        int maxRow = 0;
        int maxCol = 0;

        // Duyệt ma trận
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        // Kết quả
        System.out.printf("Giá trị lớn nhất là %.2f tại tọa độ (%d, %d)\n", max, maxRow, maxCol);
    }
}
