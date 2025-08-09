package ss2_vong_lap_va_mang_trong_java.bai_tap;

public class DisplayPrimeNumbers {
    public class PrimeNumbers {
        public static void main(String[] args) {
            for (int i = 2; i <= 100; i++) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                }
            }
        }

        public static boolean isPrime(int number) {
            if (number < 2) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

}
