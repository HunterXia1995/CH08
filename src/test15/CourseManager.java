package test15;
import java.util.*;
public class CourseManager {
    StudentManager SM=new StudentManager();
    Scanner input=new Scanner(System.in);
    Map<String,Student> stu=new TreeMap<>();
    Map<String,Course> courseMap=new TreeMap<>();
    public Course addCourse(){
        System.out.println("请输入课程编号号：");
        String courseNum=input.next();
        System.out.println("请输入课程名字：");
        String name=input.next();
        do{System.out.println("请选择模式");
            System.out.println("1.添加选择"+name+"课程的学生");
            System.out.println("2."+name+"课程学生添加完成，退出");
            int num=input.nextInt();
                if(num==1){
                    Student s=SM.addStudent();
                    stu.put(s.getStuNo(),s);
                    System.out.println("添加成功");
                }
                else if(num==2){
                    break;
                }
                else{
                    System.out.println("输入错误");
                }
        }while(true);
        Course c=new Course(courseNum,name,stu);
        courseMap.put(courseNum,c);
        return c;
    }
    public  boolean updateCourse(){
            System.out.println("请选择模式");
            System.out.println("1.修改学生系统");
            System.out.println("2.不修改学生系统");
            int num=input.nextInt();
                System.out.println("请输入想修改课程的课程编号：");
                String courseNo = input.next();
                System.out.println("请输入修改后课程的学号：");
                String courseNo1 = input.next();
                 System.out.println("请输入修改课程的名字：");
                String name = input.next();
             if(num==1){
                 stu=SM.updateStudent(stu);
             }
               Course c=new Course(courseNo1,name,stu);
               return  courseMap.replace(courseNo,courseMap.get(courseNo),c);
        }

    public static void main(String[] args) {
        CourseManager CM=new CourseManager();
        CM.addCourse();
    }
}
