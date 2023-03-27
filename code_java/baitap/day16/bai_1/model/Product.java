package day16.bai_1.model;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    private int price;
    private String manufactured;
    private String describe;

    public Product() {
    }

    public Product(int id, String name, int price, String manufactured, String describe) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.manufactured = manufactured;
        this.describe = describe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getManufactured() {
        return manufactured;
    }

    public void setManufactured(String manufactured) {
        this.manufactured = manufactured;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", manufactured='" + manufactured + '\'' +
                ", describe='" + describe + '\'' +
                '}';
    }
}
