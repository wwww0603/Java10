public abstract class Task {
    protected String name;

    public Task(String name) {
        this.name = name;
    }

    // Abstract method: defines execution behavior
    public abstract void execute();
}