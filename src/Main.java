import java.util.*;

public class Main {
    public static void main(String[] args) {

        // ===== Exercise 1 & 2 =====
        List<Workable> workers = new ArrayList<>();

        workers.add(new Developer("Anna", 8));
        workers.add(new Tester("Bob", 6));
        workers.add(new Manager("Alice", 10));

        System.out.println("=== Work Output ===");
        for (Workable w : workers) {
            System.out.println(w.work()); // Polymorphic call
        }

        System.out.println("\n=== Salaries ===");
        for (Workable w : workers) {
            // Casting to Payable to access salary calculation
            Payable p = (Payable) w;
            System.out.println(p.calculateSalary());
        }

        // ===== Exercise 3 =====
        System.out.println("\n=== Tasks ===");
        Task t1 = new CodingTask("Feature A");
        Task t2 = new TestingTask("Test B");

        t1.execute();
        t2.execute();

        // ===== Exercise 4 =====
        System.out.println("\n=== Manager Test ===");
        Manager m = new Manager("Eve", 7);
        System.out.println(m.work());
        System.out.println(m.calculateSalary());
    }
}