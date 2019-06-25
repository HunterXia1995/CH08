package test15;

import java.util.Map;
import java.util.TreeMap;
import  java.util.*;
public class StudentManager {
    Map<String,Student> stu=new TreeMap<>();
    Scanner input=new Scanner(System.in);
public Student addStudent(){
    System.out.println("请输入学号：");
    String stuNo=input.next();
    System.out.println("请输入名字：");
    String name=input.next();
    System.out.println("请输入年龄：");
    int age=input.nextInt();
    System.out.println("请输入性别：");
    char sex=input.next().charAt(0);
    Student student1=new Student(name, stuNo,  age,  sex);
   stu.put(stuNo,student1);
    return student1;
}
    public Map<String,Student> updateStudent(Map<String,Student> stu1){
        System.out.println("请输入想修改学生的学号：");
        String stuNo=input.next();
        System.out.println("请输入修改的学号：");
        String stuNo1=input.next();
        System.out.println("请输入修改的名字：");
        String name=input.next();
        System.out.println("请输入修改的年龄：");
        int age=input.nextInt();
        System.out.println("请输入修改的性别：");
        char sex=input.next().charAt(0);
        Student student1=new Student(name, stuNo,  age,  sex);
        stu1.replace(stuNo,stu1.get(stuNo),student1);
        return  stu1;
    }
    public Student delete(){
        System.out.println("请输入将删除学生的学号：");
        String stuNo=input.next();
        return stu.remove(stuNo);
    }
    public Student look(){
        System.out.println("请输入查询学生的学号：");
        String stuNo=input.next();
        return stu.get(stuNo);
    }
    public void querry(){
        Set<String> set=stu.keySet();
        for(String o:set){
            Student s=stu.get(o);
            System.out.println(s);
        }
    }
    public void manager(){
    List<Course> list=new ArrayList<>();
    Course cs=new Course("1222","shu1");
    list.add(cs);
    for(Course o:list){
        System.out.println(o);
    }
    }
    public void exit(){
    System.out.println("退出");
    System.exit(0);
}
}
