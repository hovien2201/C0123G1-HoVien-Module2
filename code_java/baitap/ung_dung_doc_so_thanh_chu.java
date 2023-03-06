import java.util.Scanner;

public class ung_dung_doc_so_thanh_chu {
    public static void main(String[] args) {
        doc();
    }

    static void doc() {
        int so;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so de doc");
        so = sc.nextInt();
        String str = String.valueOf(so);
        if (so < 0 || so > 999) {
            System.out.println("out of ability");
        }
        for (int i = 0; i < str.length(); i++) {
            if (so > 9 && so < 20) {
                switch (str.charAt(1)) {
                    case '0':
                        System.out.println("teen");
                        break;
                    case '1':
                        System.out.println("oneteen");
                        break;
                    case '2':
                        System.out.println("twoteen");
                        break;
                    case '3':
                        System.out.println("threeteen");
                        break;
                    case '4':
                        System.out.println("forteen");
                        break;
                    case '5':
                        System.out.println("fiveteen");
                        break;
                    case '6':
                        System.out.println("sixteen");
                        break;
                    case '7':
                        System.out.println("seventeen");
                        break;
                    case '8':
                        System.out.println("eighteen");
                        break;
                    case '9':
                        System.out.println("nineteen");
                        break;
                }
                break;
            } else {
                switch (str.charAt(i)) {
                    case '1':
                        System.out.println("one");
                        break;
                    case '2':
                        System.out.println("two");
                        break;
                    case '3':
                        System.out.println("three");
                        break;
                    case '4':
                        System.out.println("for");
                        break;
                    case '5':
                        System.out.println("five");
                        break;
                    case '6':
                        System.out.println("six");
                        break;
                    case '7':
                        System.out.println("seven");
                        break;
                    case '8':
                        System.out.println("eigh");
                        break;
                    case '9':
                        System.out.println("nine");
                        break;

                }
                if (str.length() == 2) {
                    if (i == 0) {
                        System.out.println("ty");
                    }
                }
                if (str.length() == 3) {
                    if (i == 0) {
                        System.out.println("hundred");
                    }
                    if (i == 1) {
                        System.out.println("ty");
                    }
                }
            }
        }
    }
}
