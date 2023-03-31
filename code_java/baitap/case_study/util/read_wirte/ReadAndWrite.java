package case_study.util.read_wirte;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static void writeEmployeeOrCustomer(String pathFile , String text,boolean append){
        File file=new File(pathFile);
        FileWriter fileWriter=null;
        BufferedWriter bufferedWriter=null;
        try {
            fileWriter=new FileWriter(file,append);
            bufferedWriter=new BufferedWriter(fileWriter);
            bufferedWriter.write(text);
            bufferedWriter.newLine();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            }catch (IOException o){
                o.printStackTrace();
            }
        }
    }
    public static List<String> readEmployeeOrCustomer(String pathFile){
        List<String> stringList=new ArrayList<>();
        File file=new File(pathFile);
        FileReader fileReader=null;
        BufferedReader bufferedReader=null;
        try {
            fileReader=new FileReader(file);
            bufferedReader=new BufferedReader(fileReader);
            String line=null;
            while ((line=bufferedReader.readLine())!=null){
                stringList.add(line);
            }
            bufferedReader.close();
            fileReader.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException o){
            o.printStackTrace();
        }
        return stringList;
    }
}
