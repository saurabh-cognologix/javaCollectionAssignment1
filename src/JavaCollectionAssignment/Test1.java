package JavaCollectionAssignment;

import java.util.ArrayList;


public class Test1 {
    static ArrayList<Integer> arrList = new ArrayList<Integer>();
    public static  ArrayList<Integer> saveEvenNumber(int N){

        for(int i=2;i<N;i++){
            if(i%2==0){
                arrList.add(i);
            }
        }

       return arrList;
    }



    public static ArrayList<Integer> printEvenNumbers() {
        ArrayList<Integer> arrList2 = new ArrayList<Integer>();

        for (int item : arrList) {
            arrList2.add(item * 2);
            System.out.println(item * 2);
        }

        return arrList2;
    }

    public static void main(String[] args) {
        System.out.println("Hey Everyone");
        saveEvenNumber(10);
        printEvenNumbers();
    }
}
