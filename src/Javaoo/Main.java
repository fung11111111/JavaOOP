package Javaoo;

public class Main {
    public static void main(String[] args){
        Student s1 = new Student("David", 16, 'M', "Y20123");
        System.out.println("Name: " +s1.getNames());
        System.out.println("Age: " +s1.getAge());
        System.out.println("Gneder: " +s1.getGender());
        System.out.println("ID: " +s1.getIdNum());

    }
}
