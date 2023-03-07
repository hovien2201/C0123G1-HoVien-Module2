import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args){
        double vnd=23000;
        double usd;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhap Dolla:");
        usd=scanner.nextDouble();
        double money= usd*vnd;
        System.out.println("So tien VND tuong ung la:  " + money);
    }
}
