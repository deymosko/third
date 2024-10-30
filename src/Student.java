public class Student implements Person{
    private final int STUDENT_ID;
    private final int AGE;
    private final String NAME;
    private final String USERNAME;

    public Student(int studentId, int age, String name, String username) {
        STUDENT_ID = studentId;
        AGE = age;
        NAME = String.valueOf(name);
        USERNAME = username;
    }

    @Override
    public void getInfo()
    {
        System.out.println("Student ID: " + STUDENT_ID);
        System.out.println("Age: " + AGE);
        System.out.println("Name: " + NAME);
        System.out.println("Surname: " + USERNAME);
    }
}
