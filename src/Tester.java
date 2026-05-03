public class Tester extends Employee {

    public Tester(String name, int skill) {
        super(name, skill);
    }

    @Override
    public int work() {
        return skill; // Tester productivity
    }

    @Override
    public double calculateSalary() {
        return skill * 800; // Salary formula for testers
    }
}