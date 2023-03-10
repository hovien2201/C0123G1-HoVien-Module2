import java.util.Scanner;

public class UngDungDocSoThanhChu {
    public static void main(String[] args) {
        doc();
    }

    static void doc() {
        int so;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so de doc");
        so = sc.nextInt();
        int du = so % 100;
        int x = so % 10;
        int y = so % 100 - x;
        if (so == 0) {
            System.out.println("Zero");
        } else if (so < 0) {
            System.out.println("out of ability");
        } else if (so > 999) {
            System.out.println("out of ability");
        } else if (du > 9 && du < 20) {
            int v = so - du;
            System.out.println(duoi1000(v) + " " + special(du));
        } else if (so < 10) {
            System.out.println(donVi(so));
        } else if (so < 20) {
            System.out.println(special(so));
        } else if (so < 100) {
            System.out.println(duoi100(y) + " " + donVi(x));
        } else {
            int z = so - (y + x);
            System.out.println(duoi1000(z) + " " + duoi100(y) + " " + donVi(x));
        }
    }

    public static String donVi(int a) {
        String doc = "";
        switch (a) {
            case 1:
                doc = "one";
                break;
            case 2:
                doc = "two";
                break;
            case 3:
                doc = "three";
                break;
            case 4:
                doc = "four";
                break;
            case 5:
                doc = "five";
                break;
            case 6:
                doc = "six";
                break;
            case 7:
                doc = "seven";
                break;
            case 8:
                doc = "eight";
                break;
            case 9:
                doc = "nine";
                break;
        }
        return doc;
    }

    public static String special(int a) {
        String doc = "";
        switch (a) {
            case 10:
                doc = "ten";
                break;
            case 11:
                doc = "eleven";
                break;
            case 12:
                doc = "twelve";
                break;
            case 13:
                doc = "thirteen";
                break;
            case 14:
                doc = "fourteen";
                break;
            case 15:
                doc = "fifteen";
                break;
            case 16:
                doc = "sixteen";
                break;
            case 17:
                doc = "seventeen";
                break;
            case 18:
                doc = "eighteen";
                break;
            case 19:
                doc = "nineteen";
                break;
        }
        return doc;
    }

    public static String duoi100(int a) {

        String doc = "";
        switch (a) {
            case 20:
                doc = "twenty";
                break;
            case 30:
                doc = "thirty";
                break;
            case 40:
                doc = "forty";
                break;
            case 50:
                doc = "fifty";
                break;
            case 60:
                doc = "sixty";
                break;
            case 70:
                doc = "seventy";
                break;
            case 80:
                doc = "eighty";
                break;
            case 90:
                doc = "ninety";
                break;
        }
        return doc;
    }

    public static String duoi1000(int a) {
        String doc = "";
        switch (a) {
            case 100:
                doc = "one hundred";
                break;
            case 200:
                doc = "two hundred";
                break;
            case 300:
                doc = "three hundred";
                break;
            case 400:
                doc = "four hundred";
                break;
            case 500:
                doc = "five hundred";
                break;
            case 600:
                doc = "six hundred";
                break;
            case 700:
                doc = "seven hundred";
                break;
            case 800:
                doc = "eight hundred";
                break;
            case 900:
                doc = "nine hundred";
                break;
        }
        return doc;
    }
}