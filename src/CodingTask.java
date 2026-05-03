public class CodingTask extends Task {

    public CodingTask(String name) {
        super(name);
    }

    @Override
    public void execute() {
        System.out.println("Coding task: " + name); // Executes coding task
    }
}