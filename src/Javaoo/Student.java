package Javaoo;

public class Student {
    private String names;
    private int age;
    private char gender;
    private String idNum;

    public Student(String names, int age, char gender, String idNum) {
        this.names = names;
        this.age = age;
        this.gender = gender;
        this.idNum = idNum;
    }
    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

}
