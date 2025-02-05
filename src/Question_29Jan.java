import java.util.Scanner;

public class Question_29Jan {
    private String name;
    private int age;
    private double id;
    private String designation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getid() {
        return  id;
    }

    public void setid(double salary) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the employee id");
        double id = sc.nextDouble();
        System.out.println("Enter the Employee name:");
        String name = sc.next();
        System.out.println("Enter the Employee age:");
        int age = sc.nextInt();
        System.out.println("Enter the Employee designation:");
        String designation = sc.next();

        Question_29Jan e = new Question_29Jan();
        e.setid(id);
        e.setName(name);
        e.setAge(age);
        e.setDesignation(designation);

        System.out.println("The Employee id is"+e.getid());
        System.out.println("The Employee name is :"+e.getName());
        System.out.println("The Employee age is :"+e.getAge());
        System.out.println("The Employee designation is :"+e.getDesignation());
    }
}
