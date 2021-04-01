package Classes;

public class Person {
    private final String firstName;
    private final String secondName;

    public Person(String firstName,String secondName)
    {
        this.firstName = firstName;
        this.secondName = secondName;
    }
    public String getNumePersoana() {
        return firstName + " " + secondName;
    }

}