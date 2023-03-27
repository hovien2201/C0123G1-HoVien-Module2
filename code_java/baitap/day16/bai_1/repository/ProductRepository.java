package day16.bai_1.repository;

import day16.bai_1.model.Product;
import day16.bai_1.util.ReadAndWrite;

import java.util.List;

public class ProductRepository implements IProductRepository {
    final String PATH = "day16\\bai_1\\repository\\readAndWriteProduct.dat";

    @Override
    public List<Product> display() {
        List<Product> list = ReadAndWrite.readListProduct(PATH);
        return list;

    }

    @Override
    public void add(List<Product> product) {
        ReadAndWrite.writeListProduct(PATH, product);
    }

    @Override
    public void search(int id) {
        List<Product> list = ReadAndWrite.readListProduct(PATH);
        boolean flag = true;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                System.out.println(list.get(i));
                flag = false;
            }
        }
        if (flag) {
            System.out.println("K co trong file");
        }
    }
}
