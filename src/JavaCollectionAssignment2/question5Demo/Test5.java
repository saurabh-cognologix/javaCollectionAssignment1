package JavaCollectionAssignment2.question5Demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Test5 {
    static class Empl{
        long salary;
        String id;

        public Empl(String  salary, String id) {
            this.salary = Long.parseLong(salary.trim());
            this.id = id.trim();
        }

        public  void setEmployeeById(String str[]){
            if(this.salary<Long.parseLong(str[3].trim())){
                this.salary = Long.parseLong(str[3]);
                this.id = str[0].trim();
            }
        }

    }
    static Map<String, Empl> tempMap = new HashMap<>();
    public static void splitEmployeeData(ArrayList<String> arrayList){
            for(String token : arrayList){
                String[] arr = token.split(",");
                // 0 index position --> ID
                // 1 index position --> Name
                // 2 index postion --> Department
                // 3 index position --> Salary
                if( tempMap.containsKey(arr[2].trim())){
                    tempMap.get(arr[2].trim()).setEmployeeById(arr);
                }else{
                    tempMap.put(arr[2].trim(),new Empl(arr[3].trim(),arr[0].trim()));
                }

            }
    }





    public static void main(String[] args) {
        List<String> inputData = new ArrayList<>();
        try{
            File file = new File( "src/JavaCollectionAssignment2/question5Demo/input.txt");
            // Creating an object of BufferedReader class
            BufferedReader br  = new BufferedReader(new FileReader(file));
           // Scanner sc = new Scanner(br);
            String st;
            // Condition holds true til there is character in a string
            while ((st = br.readLine()) != null){
                // Print the string
                 //System.out.println(st);
                inputData.add(st);
            }
        }catch (IOException ex){
            System.out.println("file is not found");
        }
        splitEmployeeData((ArrayList<String>) inputData);
        System.out.println(tempMap.get("Engineering").id);
        System.out.println(tempMap.get("Testing").id);

    }

}
