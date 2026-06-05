package Examples.Serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeExample {

    public static void main(String[] args) {

        try {
            FileInputStream fileIn = new FileInputStream("student.ser");

            ObjectInputStream in = new ObjectInputStream(fileIn);

            Student student = (Student) in.readObject();

            in.close();
            fileIn.close();

            System.out.println(student);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
