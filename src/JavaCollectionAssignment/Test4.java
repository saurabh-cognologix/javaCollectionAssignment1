package JavaCollectionAssignment;

import java.util.ArrayList;
import java.util.List;

class MyArrayList<E> extends ArrayList<E> {
    @Override
    public boolean add(E e) {
        if (e instanceof Integer || e instanceof Float || e instanceof Double) {
            super.add(e);
            return true;
        } else {
            throw new ClassCastException("Integer,Float and Double are allowed");
        }
    }
}
public class Test4 {
    public static void main(String[] args) {
        List<Object> list = new MyArrayList<>();
        try {
            list.add(1512);
            list.add(11.2F);
            list.add(3.1415D);
            //list.add("Saurabh ");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(list);
    }
}
