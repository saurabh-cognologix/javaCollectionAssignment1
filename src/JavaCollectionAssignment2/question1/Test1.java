package JavaCollectionAssignment2.question1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> inputData = new ArrayList<>();
        try{
            File file1 = new File("src/JavaCollectionAssignment2/question1/input1.txt");
            BufferedReader br = new BufferedReader(new FileReader(file1));
            String st;
            while ((st = br.readLine()) != null){
                // Print the string
                //System.out.println(st);
                inputData.add(st);
            }
            System.out.println(inputData);
        }catch (IOException exc){
            System.out.println("File not found");
        }
    }
}
