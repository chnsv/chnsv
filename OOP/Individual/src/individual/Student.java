package individual;
import java.util.*;

class Student 
{
    String name;
    int year;
    String teacher;

    Student(String name, int year, String teacher)
    {
        this.name = name;
        this.year = year;
        this.teacher = teacher;
    }
    public String toString()
    {
        return "Name: " + name + "\n Year: " + year + "\n Teacher: " + teacher;
    }
    String getName() { return name; }
    int getYear() { return year; }
    String getTeacher() { return teacher; }

    void setName(String name) { this.name = name; }
    void setYear(int year) { this.year = year; }
    void setTeacher(String teacher) { this.teacher = teacher; }
}
