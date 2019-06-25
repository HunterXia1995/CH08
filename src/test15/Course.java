package test15;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Course {
private String courseNum;
private String name;
private Map<String,Student> stu;

    public Course(String courseNum, String name) {
        this.courseNum = courseNum;
        this.name = name;
    }

    public Course(String courseNum, String name, Map<String, Student> stu) {
        this.courseNum = courseNum;
        this.name = name;
        this.stu = stu;
    }

    public String getCourseNum() {
        return courseNum;
    }

    public void setCourseNum(String courseNum) {
        this.courseNum = courseNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Student> getStu() {
        return stu;
    }

    public void setStu(Map<String, Student> stu) {
        this.stu = stu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(courseNum, course.courseNum) &&
                Objects.equals(name, course.name) &&
                Objects.equals(stu, course.stu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseNum, name, stu);
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseNum='" + courseNum + '\'' +
                ", name='" + name + '\'' +
                ", stu=" + stu +
                '}';
    }

}
