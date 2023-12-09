package student;
import java.util.ArrayList;
import java.util.Scanner;
public class managementsystem {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <Student> students = new ArrayList<>();

        while (true) {
            System.out.println("Enter 1 to add a student");
            System.out.println("Enter 2 to remove a student");
            System.out.println("Enter 3 to view all students");
            System.out.println("Enter 4 to exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter student name:");
                    String name = scanner.next();
                    System.out.println("Enter student ID:");
                    int id = scanner.nextInt();
                    students.add(new Student(name, id));
                    break;
                case 2:
                    System.out.println("Enter student ID to remove:");
                    int removeId = scanner.nextInt();
                    for (Student student : students) {
                        if (student.getId() == removeId) {
                            students.remove(student);
                            break;
                        }
                    }
                    break;
                case 3:
                    for (Student student : students) {
                        System.out.println(student.getName() + " - " + student.getId());
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}

class Student {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
