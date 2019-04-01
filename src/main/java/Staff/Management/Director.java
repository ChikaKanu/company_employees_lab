package Staff.Management;

public class Director extends Manager{

    private double budget;
    private double salary;

    public Director(double budget, String name, int niNumber, double salary, String deptName) {
        super(name, niNumber, salary, deptName);
        this.budget = budget;
        this.salary = salary;
    }

    public double getBudget() {
        return this.budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public double payBonus() {
        double employeeSalary = this.salary;
        return employeeSalary * 0.02;
    }

}
