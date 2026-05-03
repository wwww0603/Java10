public class Developer extends Employee {

    public Developer(String name, int skill) {
        super(name, skill);
    }

    @Override
    public int work() {
        return skill * 2; // Developer productivity depends on skill
    }

    @Override
    public double calculateSalary() {
        return skill * 1000; // Salary formula for developers
    }
}