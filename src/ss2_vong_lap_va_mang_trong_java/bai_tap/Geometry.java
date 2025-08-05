package ss2_vong_lap_va_mang_trong_java.bai_tap;

public class Geometry {
    public static void main(String[] args) {
        //hinh chu nhat
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 7; j++) {
//                System.out.print("*");
//            }
//            System.out.println("*");
//        }
        //hinh tam giac vuong co goc  vuong o botten left
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println("*");
//        }
        // hinh tam giac vuong co goc vuong o top left
//        for(int i=5;i>=1;i--){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        // hinh tam giac can
        for (int i=1; i<=5; i++) {

            for (int j = 1; j <= 5- i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
