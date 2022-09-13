package JavaCollectionAssignment2.question2;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test2 {

    static class Employee2{
        int price;
        String customerName;

        public Employee2(int price, String customerName) {
            this.price = price;
            this.customerName = customerName.trim();
        }
        //price  --> 4
        //customer name : ---> 0
        public void setEmployeeByName(String str[]){
            if(this.price > Integer.parseInt(str[4].trim())){
                this.price = Integer.parseInt(str[4].trim());
                this.customerName = str[0].trim();
            }
        }
    }

    static Map<String, Employee2> tempMap = new HashMap<>();
    public  static  void splitEmployeeData(ArrayList<String> arrayList){
        for(String token : arrayList){
           // System.out.println(token);
            String[] str = token.split(",");
            // index position :  3 ---> product Name
            if (tempMap.containsKey(str[3])){
                tempMap.get(str[3].trim()).setEmployeeByName(str);
            }else{
                // 4 ---> price
                // 0 ----> customerName
                tempMap.put(str[3].trim(),new Employee2(Integer.parseInt(str[4].trim()),str[0].trim()));
            }
        }
    }

    public static void main(String[] args) {
        List<String> inputData = new ArrayList<>();
        try{
           File file2 = new File("src/JavaCollectionAssignment2/question2/input2.txt");
            BufferedReader br = new BufferedReader(new FileReader(file2));
            String str;
            while((str = br.readLine()) != null){
                inputData.add(str);
            }


        }catch (IOException exc){
            System.out.println("File not Found");
        }
        splitEmployeeData((ArrayList<String>) inputData);
        System.out.println(tempMap.get("Samsung Battery").customerName);

    }
}
