package day2;


public class HienThiSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        int n = 100;
        for (int i = 2; i <= n; i++) {
            if (check(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private static boolean check(int n) {
        if (n <= 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
