public class Employer implements Person
{
    private final int AGE;
    private final String NAME;
    private final String USERNAME;

    public Employer(int age, String name, String username) {
        AGE = age;
        NAME = name;
        USERNAME = username;
    }

    @Override
    public void getInfo() {
        System.out.println("Name: " + NAME);
        System.out.println("Age: " + (62-AGE));
        System.out.println("Surname: " + USERNAME);
    }
}
