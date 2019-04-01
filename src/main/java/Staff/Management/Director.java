package Staff.Management;

public class Director extends Manager{

    private double budget;

    public Director(double budget, String name, int niNumber, double salary, String deptName) {
        super(name, niNumber, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return this.budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

}
