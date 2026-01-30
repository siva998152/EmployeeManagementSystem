

import java.util.Scanner;

public class EmployeeMain {

    public static void main(String[] args) {

        EmployeeService service = new EmployeeService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1.Add 2.View 3.Search 4.Update Salary 5.Delete 6.Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    System.out.print("Name: ");
                    String name = sc.next();
                    System.out.print("Department: ");
                    String dept = sc.next();
                    System.out.print("Salary: ");
                    double sal = sc.nextDouble();
                    service.add(new EmployeeDTO(id, name, dept, sal));
                    break;

                case 2:
                    service.showAll();
                    break;

                case 3:
                    System.out.print("Enter ID: ");
                    service.search(sc.nextInt());
                    break;

                case 4:
                    System.out.print("ID: ");
                    int eid = sc.nextInt();
                    System.out.print("New Salary: ");
                    service.update(eid, sc.nextDouble());
                    break;

                case 5:
                    System.out.print("ID: ");
                    service.delete(sc.nextInt());
                    break;

                case 6:
                    System.exit(0);
            }
        }
    }
}
