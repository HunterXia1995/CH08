package test15;

import java.util.Objects;

public class Student {
    private String name;
    private String stuNo;
    private int age;
    private char sex;

    public Student(String name, String stuNo, int age, char sex) {
        this.name = name;
        this.stuNo = stuNo;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                sex == student.sex &&
                Objects.equals(name, student.name) &&
                Objects.equals(stuNo, student.stuNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, stuNo, age, sex);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", stuNo='" + stuNo + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
