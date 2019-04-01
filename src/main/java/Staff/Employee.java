package Staff;

public class Employee {
    private String name;
    private int niNumber;
    private double salary;


    public Employee(String name, int niNumber, double salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNiNumber() {
        return niNumber;
    }

    public void setNiNumber(int niNumber) {
        this.niNumber = niNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void raiseSalary(double amount) {
        if (amount > 0) {
            double newSalary = this.salary + amount;
            this.salary = newSalary;
        }
    }


    public double payBonus() {
        double employeeSalary = this.salary;
        return employeeSalary * 0.01;
    }

}
