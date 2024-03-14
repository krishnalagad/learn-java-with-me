public class UnnamedPatterns {
    public record Employee(
            Long id,
            String name,
            double salary,
            boolean isActive) {
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(101L, "Krishna", 25000, true);

        // Unnamed pattern: use underscore
        if (emp1 instanceof Employee(Long id, _, _, _)) {
            System.out.println("Name of an employee: " + emp1.name);
        }

        try {
            int num = Integer.parseInt(emp1.name);
            System.out.println(num);
        } catch (Exception _) {
            System.out.println("Error parsing !!");
        }
    }
}
