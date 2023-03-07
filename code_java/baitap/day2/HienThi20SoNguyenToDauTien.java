package day2;


public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        int n = 20;
        int count = 0;
        int x = 2;
        while (true) {
            if (ShowSoNguyenTo(x)) {
                System.out.print(x + " ");
                count++;
            }
            if (count == n) {
                break;
            }
            if (x == 2) {
                x++;
            } else {
                x += 2;
            }
        }
    }

    public static boolean ShowSoNguyenTo(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
