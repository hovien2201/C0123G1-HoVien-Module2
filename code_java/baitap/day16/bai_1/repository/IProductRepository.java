package day16.bai_1.repository;

import day16.bai_1.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> display();

    void add(List<Product> productList);

    void search(int id);

}
