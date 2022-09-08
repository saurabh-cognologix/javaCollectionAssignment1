package JavaCollectionAssignment;

import java.util.ArrayList;
import java.util.Iterator;

class Employee{
    private int id;
    private String name;
    private String address;
    private float sal;

    public int getId() {
        return id;
    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public float getSal() {
//        return sal;
//    }
//
//    public void setSal(float sal) {
//        this.sal = sal;
//    }

    //default constructor
    public Employee() {
        super();
    }

    //Paremterised constructor
    public Employee(int id, String name, String address, float sal) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", sal=" + sal +
                '}';
    }
}
public class Test5 {
    public static void main(String[] args) {
        ArrayList<Employee> arrayList = new ArrayList<>();
        arrayList.add(new Employee(101, "Manjula", "kothrud", 20000.0F));
        arrayList.add(new Employee(102, "Niketan", "katraj", 30000.0F));
        arrayList.add(new Employee(103, "Poorva", "Pune", 25000.0F));
        arrayList.add(new Employee(104, "Onkar", "Gokhle Nagar", 40000.0F));

        Iterator<Employee> it = arrayList.iterator();
        int searchId = 102;
        while (it.hasNext()) {
            Employee emp = it.next();
            if (emp.getId() == searchId)
                System.out.println(emp);
        }
    }
}
