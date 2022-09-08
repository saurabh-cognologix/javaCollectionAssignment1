package JavaCollectionAssignment;

import java.util.Iterator;
import java.util.Vector;

class Emp{
    private int id;
    private String name;
    private String address;
    private Double salary;

    public Emp(int id, String name, String address, Double salary) {
        super();
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
    }
}
public class Test8 {
    public static void main(String[] args) {
        Vector<Employee> list = new Vector<>();

        list.add(new Employee(101, "Nomu", "wha", 20000.0F));
        list.add(new Employee(102, "Comu", "yha", 30000.0F));
        list.add(new Employee(103, "Somu", "shi hai", 25000.0F));
        list.add(new Employee(104, "Romu", "okay", 40000.0F));

        Iterator<Employee> it = list.iterator();
        while (it.hasNext())
            System.out.println(it.next());


    }
}
