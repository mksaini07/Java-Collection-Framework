package List;

import java.util.ArrayList;
import java.util.List;

// COMPARATOR
// Customize sorting and sort in multiple fields
// Natural Sorting Doesn't Ocurrs
public class Student {
private String name;
private double gpa;

public Student(String name , double gpa){
    this.name= name;
    this.gpa=gpa;
}

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice",3.5));
        students.add(new Student("Bob",3.7));
        students.add(new Student("Charlie",3.5));
        students.add(new Student("Akshit",3.9));

        students.sort((o1,o2) ->{ // Lambda expression  
            if(o2.getGpa() - o1.getGpa()>0){
                return 1;
            } else if (o2.getGpa()-o1.getGpa()<0) {
                return -1;
            }else {
                return o2.getName().compareTo(o1.getName()); //Use compareto for big name length first
            }
        });
        for(Student s: students){
            System.out.println(s.getName()+ ":"+ s.getGpa());
        }
    }
}
