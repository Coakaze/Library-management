package Classes;

public class Manager extends Person {
    private int salary;

    public Manager(String firstName, String secondName, int salary) {
        super(firstName, secondName);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
