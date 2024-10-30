import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;

public class Main
{
    public static void main(String args[])
    {
        Student student = new Student(12345, 10, "Ivan", "Swing");
        student.getInfo();
        System.out.println("\n\n");
        Employer employer = new Employer(20, "Oliver", "Ling");
        employer.getInfo();
    }
}
