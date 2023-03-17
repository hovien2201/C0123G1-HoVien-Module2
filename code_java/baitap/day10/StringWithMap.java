package day10;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class StringWithMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi để kiểm tra");
        String str = scanner.nextLine();
        str = str.toLowerCase();
        str = str.replaceAll(",", "");
        System.out.println(str);
        String[] arr = str.split(" ");
        String key = "";
        Integer value;
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            key = arr[i];
            if (treeMap.containsKey(key)) {
                value = treeMap.get(key);
                treeMap.remove(key);
                treeMap.put(key, value + 1);
            } else {
                treeMap.put(key, 1);
            }
        }
        Set set = treeMap.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            key = (String) iterator.next();
            System.out.println("Từ " + key + " xuất hiện " + treeMap.get(key) + " lần");
        }

    }
}
