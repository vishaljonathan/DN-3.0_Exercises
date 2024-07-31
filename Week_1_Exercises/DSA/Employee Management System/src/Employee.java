import java.util.Scanner;

class Employee {
    int employeeId;
    String name;
    String position;
    double salary;

    public Employee(int employeeId, String name, String position, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee ID: " + employeeId + ", Name: " + name + ", Position: " + position + ", Salary: " + salary;
    }
}

class EmployeeManagementSystem {
    private Employee[] employees;
    private int size;

    public EmployeeManagementSystem(int capacity) {
        employees = new Employee[capacity];
        size = 0;
    }

    public void addEmployee(Employee employee) {
        if (size == employees.length) {
            // Resize the array
            Employee[] newEmployees = new Employee[employees.length * 2];
            System.arraycopy(employees, 0, newEmployees, 0, size);
            employees = newEmployees;
        }
        employees[size++] = employee;
    }

    public Employee searchEmployee(int employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].employeeId == employeeId) {
                return employees[i];
            }
        }
        return null;
    }

    public void traverseEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    public boolean deleteEmployee(int employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].employeeId == employeeId) {
                // Shift elements to the left
                for (int j = i; j < size - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--size] = null; // Optional: to help GC
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeManagementSystem ems = new EmployeeManagementSystem(5);

        while (true) {
            System.out.println("\n1. Add Employee");
            System.out.println("2. Search Employee");
            System.out.println("3. Traverse Employees");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Add Employee
                    System.out.print("Enter Employee ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter Employee Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Employee Position: ");
                    String position = scanner.nextLine();
                    System.out.print("Enter Employee Salary: ");
                    double salary = scanner.nextDouble();
                    ems.addEmployee(new Employee(id, name, position, salary));
                    System.out.println("Employee added successfully.");
                    break;

                case 2:
                    // Search Employee
                    System.out.print("Enter Employee ID to search: ");
                    int searchId = scanner.nextInt();
                    Employee e = ems.searchEmployee(searchId);
                    if (e != null) {
                        System.out.println("Employee found: " + e);
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 3:
                    // Traverse Employees
                    System.out.println("All Employees:");
                    ems.traverseEmployees();
                    break;

                case 4:
                    // Delete Employee
                    System.out.print("Enter Employee ID to delete: ");
                    int deleteId = scanner.nextInt();
                    boolean deleted = ems.deleteEmployee(deleteId);
                    System.out.println(deleted ? "Employee deleted successfully." : "Employee not found.");
                    break;

                case 5:
                    // Exit
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
