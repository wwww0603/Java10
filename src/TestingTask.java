public class TestingTask extends Task {

    public TestingTask(String name) {
        super(name);
    }

    @Override
    public void execute() {
        System.out.println("Testing task: " + name); // Executes testing task
    }
}