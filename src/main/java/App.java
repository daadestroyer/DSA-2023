import javax.swing.*;
import java.util.*;
import java.util.stream.Collectors;

class Student {

    int sid;
    String sname;

    public Student(int sid, String sname) {
        this.sid = sid;
        this.sname = sname;
    }

//    @Override
//    public int compareTo(Student o) {
//        return this.sid > o.sid ? -1 : 1;
//    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                '}';
    }
}

public class App {
    public static void main(String[] args) {
//        List<Student> lst = Arrays.asList(new Student(101, "shubham"), new Student(102, "ram"));
//
//        List<Student> lst1 = lst.stream().sorted((s1, s2) -> s2.sname.compareTo(s1.sname)).collect(Collectors.toList());
//
//        for (Student st : lst1) {
//            System.out.println(st);
//        }

        String s1 = new String("shubham");
        String s2 = new String("shubham");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

    }
}
