package day11.ArrayList_LinkedList_in_Java_Collection_Framework.service;

import day11.ArrayList_LinkedList_in_Java_Collection_Framework.model.Product;

import java.util.*;

public class ProductManager implements IProductmanager {
    Scanner scanner = new Scanner(System.in);
    static LinkedList<Product> linkedList = new LinkedList<Product>();

    static {
        linkedList.add(new Product(1, "Kẹo", 2));
        linkedList.add(new Product(2, "Sách", 10));
    }

    @Override
    public void add() {
        System.out.println("Nhập id sản phẩm");
        int id1 = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < linkedList.size(); i++) {
            if (id1 == linkedList.get(i).getId()) {
                System.out.println("id sản phẩm này có rồi nếu muốn sủa sản phẩm bạn chọn vào sửa");
                return;
            } else {
                System.out.println("Nhập tên sản phẩm:");
                String name1 = scanner.nextLine();
                System.out.println("Nhập giá sản phẩm(Nghìn VND):");
                int price1 = Integer.parseInt(scanner.nextLine());
                linkedList.add(new Product(id1, name1, price1));
                System.out.println("Thêm sản phẩm thành công");
            }
        }
    }

    @Override
    public void edit() {
        System.out.println("Nhập id sản phẩm bạn muốn sửa:");
        int id2 = Integer.parseInt(scanner.nextLine());
        int dem = 0;
        for (int i = 0; i < linkedList.size(); i++) {
            if (id2 == linkedList.get(i).getId()) {
                boolean check = true;
                do {
                    System.out.println("Bạn muốn sửa sản phẩm :" + linkedList.get(i).getName() + " không\n" +
                            "1.Có\n" +
                            "2.Không");
                    int n = Integer.parseInt(scanner.nextLine());
                    if (n == 1) {
                        System.out.println("Nhập tên sản phẩm:");
                        String name2 = scanner.nextLine();
                        System.out.println("Nhập giá sản phẩm(Nghìn VND):");
                        int price2 = Integer.parseInt(scanner.nextLine());
                        linkedList.set(i, new Product(id2, name2, price2));
                        System.out.println("Sửa thành công");
                        check = false;
                    } else if (n == 2) {
                        System.out.println("Bạn đã không sửa nữa");
                        check = false;
                    } else {
                        System.out.println("Bạn đã nhập sai mời nhập lại");
                    }
                } while (check);
            } else {
                dem++;
            }
        }
        if (dem == linkedList.size()) {
            System.out.println("Sản phẩm bạn muốn sửa không có trong danh sách ");
        }

    }

    @Override
    public void delete() {
        System.out.println("Nhập id sản phẩm muốn xóa");
        int id3 = Integer.parseInt(scanner.nextLine());
        int dem1 = 0;
        for (int i = 0; i < linkedList.size(); i++) {
            if (id3 == linkedList.get(i).getId()) {
                boolean check = true;
                do {
                    System.out.println("Bạn muốn xóa sản phẩm :" + linkedList.get(i).getName() + " không\n" +
                            "1.Có\n" +
                            "2.Không");
                    int n = Integer.parseInt(scanner.nextLine());
                    if (n == 1) {
                        linkedList.remove(i);
                        System.out.println("Xóa thành công");
                        check = false;
                    } else if (n == 2) {
                        System.out.println("Bạn đã không xóa nữa");
                        check = false;
                    } else {
                        System.out.println("Bạn đã nhập sai mời nhập lại");
                    }
                } while (check);

            } else {
                dem1++;
            }
        }
        if (dem1 == linkedList.size()) {
            System.out.println("Sản phẩm bạn muốn xóa không có trong danh sách ");
        }
    }

    @Override
    public void display() {
        System.out.println("Danh sách sản phẩm :");
        for (Product s : linkedList) {
            System.out.println(s);
        }
    }

    @Override
    public void search() {
        System.out.println("Nhập tên sản phẩm bạn muốn tìm kiếm");
        String name3 = "";
        name3 = scanner.nextLine();
        int dem2 = 0;
        for (int i = 0; i < linkedList.size(); i++) {
            if (name3.equals(linkedList.get(i).getName())) {
                System.out.println("Sản phẩm bạn muốn tìm là:\n" + linkedList.get(i));
            } else {
                dem2++;
            }
        }
        if (dem2 == linkedList.size()) {
            System.out.println("Sản phẩm bạn muốn tìm không có trong danh sách ");
        }
    }

    @Override
    public void arrange() {
        System.out.println("Bạn muốn sắp xếp :\n" +
                "1. Tăng dần.\n" +
                "2. Giảm dần.");
        boolean check = true;
        do {
            int n = Integer.parseInt(scanner.nextLine());
            switch (n) {
                case 1:
                    Collections.sort(linkedList, new Comparator<Product>() {
                        @Override
                        public int compare(Product o1, Product o2) {
                            return o1.getPrice() - o2.getPrice();
                        }
                    });
                    System.out.println("Bạn đã sắp xếp danh sách theo thứ tự tăng dần");
                    check = false;
                    break;
                case 2:
                    Collections.sort(linkedList, new Comparator<Product>() {
                        @Override
                        public int compare(Product o1, Product o2) {
                            return o2.getPrice() - o1.getPrice();
                        }
                    });
                    System.out.println("Bạn đã sắp xếp danh sách theo thứ tự giảm dần");
                    check = false;
                    break;
                default:
                    System.out.println("Bạn nhập sai xin mời nhập lại");
            }
        } while (check);
    }
}
