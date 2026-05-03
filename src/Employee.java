public abstract class Employee implements Workable, Payable {
    protected String name;
    protected int skill;

    public Employee(String name, int skill) {
        this.name = name;
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    // Abstract method: must be implemented by subclasses
    @Override
    public abstract int work();

    // Abstract method: must be implemented by subclasses
    @Override
    public abstract double calculateSalary();
}