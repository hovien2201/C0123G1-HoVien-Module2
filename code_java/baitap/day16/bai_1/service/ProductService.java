package day16.bai_1.service;

import day16.bai_1.model.Product;
import day16.bai_1.repository.ProductRepository;
import day16.bai_1.util.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
    ProductRepository productRepository = new ProductRepository();
    static List<Product> productList = new ArrayList<>();

    public static void setProductList(List<Product> productLists) {
        productList = productLists;
    }

    Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for (Product s : productList) {
            System.out.println(s);
        }
    }

    @Override
    public void add() {
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập giá");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập hàng sản suất");
        String manufactured = scanner.nextLine();
        System.out.println("Nhập mô tả");
        String describe = scanner.nextLine();
        Product product = new Product(id, name, price, manufactured, describe);
        productList.add(product);
        productRepository.add(productList);
    }

    @Override
    public void search() {
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        productRepository.search(id);
    }
}
