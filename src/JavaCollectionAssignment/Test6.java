package JavaCollectionAssignment;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test6 {
    static LinkedList<Integer> ll = new LinkedList<Integer>();
    public static  LinkedList<Integer> saveEvenNumber(int N){
        for(int i=2;i<N;i++){
            if(i%2==0){
                ll.add(i);
            }
        }
        return ll;
    }
    public static LinkedList<Integer> printEvenNumbers() {
        LinkedList<Integer> list2 = new LinkedList<>();
        for (int item : ll) {
            list2.add(item * 2);
            System.out.println(item * 2);
        }

        return list2;
    }

    public static void main(String[] args) {
        System.out.println("Hey Linked List");
        saveEvenNumber(10);
        printEvenNumbers();
    }
}
