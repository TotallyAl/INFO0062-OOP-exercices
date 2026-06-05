package Examples.Serialization;

import java.io.Serializable;

public class Student implements Serializable {

    private static final long serialVersionUID = 2L;

    private String name;
    private int age;
    private transient double gpa;

    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{name='" + this.name + "', age=" + this.age + ", gpa=" + this.gpa + "}";
    }
}
