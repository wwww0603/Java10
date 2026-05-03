public class Manager extends Employee {

    public Manager(String name, int skill) {
        super(name, skill);
    }

    @Override
    public int work() {
        return skill + 5; // Managers contribute with additional coordination effort
    }

    @Override
    public double calculateSalary() {
        return skill * 1500; // Salary formula for managers
    }
}