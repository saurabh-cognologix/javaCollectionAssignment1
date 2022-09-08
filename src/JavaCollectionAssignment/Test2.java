package JavaCollectionAssignment;

import java.util.*;

import static JavaCollectionAssignment.Employe.arrayList;
import static JavaCollectionAssignment.Employe.getEmployeeDetails;

class Employe{
    private int empId;
    private String empName;
    private String empEmail;
    private char empGender;
    private float empSalary;
    static ArrayList<Employe> arrayList = new ArrayList<>();

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public char getEmpGender() {
        return empGender;
    }

    public void setEmpGender(char empGender) {
        this.empGender = empGender;
    }

    public float getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(float empSalary) {
        this.empSalary = empSalary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public Employe(int empId, String empName, String empEmail, char empGender, float empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empEmail = empEmail;
        this.empGender = empGender;
        this.empSalary = empSalary;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empEmail='" + empEmail + '\'' +
                ", empGender=" + empGender +
                ", empSalary=" + empSalary +
                '}';
    }
    public static void getEmployeeDetails(){
        Iterator<Employe> it = arrayList.iterator();
        while (it.hasNext()){
            Employe e = it.next();
            System.out.println(e+" ");
        }
    }
}

class EmployeeDB{

    //adding employee
    boolean addEmployee(int e){
        Iterator<Employe> it = arrayList.iterator();
        boolean check = true;

        while(it.hasNext()){
            Employe emp = it.next();
            if(emp.getEmpId()==e){
                check = false;
            }
        }
        return check;
    }

    //deleting employee
    boolean deleteEmployee(int empId){
        Iterator<Employe> it = arrayList.iterator();
        boolean check = false;
        while (it.hasNext()){
            Employe emp = it.next();
            if(emp.getEmpId()==empId){
                //arrayList.remove(empId);
                check = true;
            }
        }
        return check;
    }


    public void  showPaySlip(int empId){
        Iterator<Employe> it = arrayList.iterator();
        while (it.hasNext()){
            Employe emp = it.next();

            if(emp.getEmpId()==empId){
                System.out.println(emp);
            }
        }

    }


}
class Test2TreeSet {
    static Set<Employe> empTreeSet = new TreeSet<Employe>();

    public boolean addEmployee(Employe e) {
        return empTreeSet.add(e);
    }

    public boolean deleteEmployee(Integer empId) {
        Iterator<Employe> it = empTreeSet.iterator();

        while (it.hasNext()) {
            Employe e = it.next();
            if (e.getEmpId() == empId) {
                return empTreeSet.remove(e);
            }
        }
        return false;
    }

    public String showPaySlip(Integer empId) {
        Iterator<Employe> it = empTreeSet.iterator();
        String paySlip;
        while (it.hasNext()) {
            Employe e = it.next();
            if (e.getEmpId() == empId) {
                paySlip = "Name: " + e.getEmpName() + "\nEmail: " + e.getEmpEmail() + "\nGender: " + e.getEmpGender()
                        + "\nSalary: " + e.getEmpSalary();
                return paySlip;
            }
        }
        return null;
    }

    Employee[] listAll() {
        int index = 0;
        Employee[] emp = new Employee[empTreeSet.size()];
        Iterator it = empTreeSet.iterator();
        while (it.hasNext()) {
            Employee e = (Employee) it.next();
            emp[index++] = e;
        }
        return emp;
    }
}

public class Test2 {
    public static void main(String[] args) {
        EmployeeDB objDB = new EmployeeDB();
//        Employe obj = new Employe();
        Scanner sc = new Scanner(System.in);
        int option;
//        ArrayList<Employe> arrayList = new ArrayList<>();
        arrayList.add(new Employe(0,"Niku","niku@gmail.com",'M',20000));
        arrayList.add(new Employe(1,"Miku","miku@gmail.com",'M',30000));
        arrayList.add(new Employe(2,"Riku","riku@gmail.com",'M',40000));
        arrayList.add(new Employe(3,"Siku","siku@gmail.com",'M',50000));

        //getEmployeeDetails();
        do {
            System.out.println("1: Add Employee");
            System.out.println("2: Delete Employee");
            System.out.println("3: Show All Employee");
            System.out.println("4: PaySlip Operation");
            System.out.println("0: Exit");
            System.out.println();
            System.out.println("------------------------------------------------------");
            System.out.println("Please enter option : ------ Please press 0 to exit-------");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter Id, Name, Email, Gender, Salary :");
                    int id = sc.nextInt();
                    String name = sc.next();
                    String email = sc.next();
                    char gender= sc.next().charAt(0);
                    double salary = sc.nextDouble();
                    boolean result = objDB.addEmployee(id);
                    if(result){
                        arrayList.add(new Employe(id,name,email,gender, (float) salary));
                        System.out.println("Employee is Added");
                    }else{
                        System.out.println("Employee is already exist");
                    }
                    break;

                case 2:
                    System.out.println("Enter employee ID to delete :");
                    int del_id = sc.nextInt();
                    boolean deletedEmp = objDB.deleteEmployee(del_id);
                    if(deletedEmp){
                        arrayList.remove(del_id);
                    }
                    System.out.println("Employee is Deleted");
                    break;

                case 3:
                    System.out.println("All Employee Details : ");
                    getEmployeeDetails();
                    break;

                case 4:
                    System.out.println("Enter employee id to check details : ");
                    int employee_id = sc.nextInt();
                    objDB.showPaySlip(employee_id);

                case 0:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Please enter correct option");

            }
        }while (option != 0);
    }
}
