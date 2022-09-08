package JavaCollectionAssignment;

import java.util.LinkedList;
import java.util.Vector;

public class Test7 {
    static Vector<Integer> v = new Vector<Integer>();
    public static Vector<Integer> saveEvenNumber(int N){
        for(int i=2;i<N;i++){
            if(i%2==0){
                v.add(i);
            }
        }
        return v;
    }
    public static Vector<Integer> printEvenNumbers() {
        Vector<Integer> v2 = new Vector<>();
        for (int item : v) {
            v2.add(item * 2);
            System.out.print(item * 2+" ");
        }

        return v2;
    }
    public static void main(String[] args) {
        System.out.println("Vector implementation: ");
        saveEvenNumber(50);
        printEvenNumbers();
    }
}
