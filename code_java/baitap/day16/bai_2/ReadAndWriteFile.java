package day16.bai_2;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ReadAndWriteFile implements Serializable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> stringList = new ArrayList<>();
        final String PATH1 = "day16/bai_2/saveReadFile.dat";
        final String PATH2 = "day16/bai_2/coppyWriteFile.dat";
        System.out.println("Nhap j do de luu");
        String str = scanner.nextLine();
        stringList.add(str);
        writeFile(PATH1, stringList);
        stringList = readFile(PATH1, str);
        writeFile(PATH2, stringList);
    }

    public static List<String> readFile(String pathFile, String str) {
        List<String> stringList = new ArrayList<>();
        File file = new File(pathFile);
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            if (file.length() > 0) {
                fileInputStream = new FileInputStream(file);
                byte[] bytes = str.getBytes();
                if (bytes.length > 0) {
                    System.out.println(Arrays.toString(bytes));
                } else {
                    System.out.println(-1);
                }
                objectInputStream = new ObjectInputStream(fileInputStream);
                stringList = (List<String>) objectInputStream.readObject();
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return stringList;
    }

    public static void writeFile(String pathFile, List<String> stringList) {
        File file = new File(pathFile);
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(stringList);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
