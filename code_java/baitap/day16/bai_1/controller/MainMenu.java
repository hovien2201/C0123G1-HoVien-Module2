package day16.bai_1.controller;

import day16.bai_1.service.ProductService;
import day16.bai_1.util.ReadAndWrite;

import java.util.Scanner;

public class MainMenu {
    static ProductService productService = new ProductService();

    static {
        productService.setProductList(ReadAndWrite.readListProduct("day16/bai_1/repository/readAndWriteProduct.dat"));
    }

    public static void mainMenu() {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        do {
            System.out.println("Chọn chức năng theo số (để tiếp tục):\n" +
                    "1. Thêm mới \n" +
                    "2. Hiển thị\n" +
                    "3. Tìm kiếm\n" +
                    "4. Thoát\n" +
                    "Chọn chức năng:");
            int n = Integer.parseInt(scanner.nextLine());
            switch (n) {
                case 1:
                    productService.add();
                    break;
                case 2:
                    productService.display();
                    break;
                case 3:
                    productService.search();
                    break;
                case 4:
                    System.out.println("Bạn đã thoát ");
                    check = false;
                    break;
                default:
                    System.out.println("Bạn đã nhập sai xin mời nhập lại");
            }
        } while (check);
    }
}
