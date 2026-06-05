package Examples.Serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeExample {

    public static void main(String[] args) {

        Student student = new Student("Alice", 20, 4.6);

        try {
            FileOutputStream fileOut = new FileOutputStream("student.ser");

            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(student);

            out.close();
            fileOut.close();

            System.out.println("Object serialized!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
