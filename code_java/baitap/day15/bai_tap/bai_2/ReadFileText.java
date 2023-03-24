package day15.bai_tap.bai_2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileText {
    public static void main(String[] args) {
        String pathFile = "day15\\bai_tap\\bai_2\\ReadFileText.txt";
        List<ListNation> listNations = readFileText(pathFile);
        for (ListNation s : listNations) {
            System.out.println(s);
        }
    }

    public static List<ListNation> readFileText(String filePath) {
        List<ListNation> stringList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            File file = new File(filePath);
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                stringList.add(new ListNation(Integer.parseInt(data[0]), data[1], data[2]));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return stringList;
    }
}
