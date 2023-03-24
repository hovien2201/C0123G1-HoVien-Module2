package day15.bai_tap.bai_1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadAndWriteFileText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pathFileIn = "day15\\bai_tap\\bai_1\\ReadFile.txt";
        List<String> list = readFileText(pathFileIn);
        String pathFileOut = "day15\\bai_tap\\bai_1\\WriteFile.txt";
        System.out.println("Nội dung file đọc là");
        for (String e : list) {
            System.out.println(e);
        }
        System.out.println("Bạn muốn file ghi:\n" +
                "1. Ghi thêm \n" +
                "2. Ghi đè \n" +
                "Số khác: Không ghi vào file ghi ");
        int a = Integer.parseInt(scanner.nextLine());
        if (a == 1) {
            for (String e : list) {
                writeFileText(e, pathFileOut, true);
            }
        } else if (a == 2) {
            for (String e : list) {
                writeFileText(e, pathFileOut, false);
            }
        } else {
            System.out.println("Bạn đã không ghi");
        }
    }

    public static List<String> readFileText(String filePath) {
        List<String> stringList = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi");
        }
        return stringList;
    }

    public static void writeFileText(String note, String filePath, boolean a) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, a));
            bufferedWriter.write(note);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (Exception e) {
            System.out.println("Fie không tồn tại or nội dung có lỗi");
        }
    }
}

