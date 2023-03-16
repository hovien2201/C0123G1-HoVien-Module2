package day9.array_list;

import java.util.Arrays;
import java.util.TreeSet;

public class MyListTest {
    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.add("hello", 0);
        myList.add("Say hi", 1);
        myList.add("bb", 2);
        myList.add("Are you handsome", 3);
        myList.add(1, 5);
        System.out.println(Arrays.toString(myList.clone()));
        myList.add("No", 4);
        System.out.println(Arrays.toString(myList.clone()));
        myList.add("Why");
        myList.add("I am bad boy");
        System.out.println(Arrays.toString(myList.clone()));
        myList.remove(1);
        myList.add("may la ai", 1);
        System.out.println(Arrays.toString(myList.clone()));
        System.out.println(myList.get(2));
        System.out.println(myList.contains("bb"));
        System.out.println(myList.indexOf("bb"));
        System.out.println(myList.indexOf("bbb"));
        myList.clear();
        System.out.println(Arrays.toString(myList.clone()));
    }
}
