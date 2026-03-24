import person.*;
import ticket.*;
import java.util.*;

public class Main {

    static ArrayList<person> persons = new ArrayList<>();
    static ArrayList<ticket> tickets = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n===== CampusCare Menu =====");
            System.out.println("1. Add Person");
            System.out.println("2. Create Ticket");
            System.out.println("3. View Tickets");
            System.out.println("4. Update Ticket Status");
            System.out.println("5. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addPerson();
                    break;
                case 2:
                    createTicket();
                    break;
                case 3:
                    viewTickets();
                    break;
                case 4:
                    updateStatus();
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }

    static void addPerson() {
        System.out.println("1. Student  2. Staff");
        int ch = sc.nextInt();
        sc.nextLine();

        System.out.print("ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        if (ch == 1) {
            System.out.print("Program: ");
            String program = sc.nextLine();
            System.out.print("Semester: ");
            int sem = sc.nextInt();

            persons.add(new student(id, name, email, program, sem));
        } else {
            System.out.print("Department: ");
            String dept = sc.nextLine();

            persons.add(new staff(id, name, email, dept));
        }

        System.out.println("Person added!");
    }

    static void createTicket() {
        System.out.println("1. Maintenance  2. Cleaning");
        int ch = sc.nextInt();
        sc.nextLine();

        System.out.print("Ticket ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Title: ");
        String title = sc.nextLine();

        System.out.print("Description: ");
        String desc = sc.nextLine();

        System.out.print("Location: ");
        String loc = sc.nextLine();

        System.out.print("Type: ");
        String type = sc.nextLine();

        if (ch == 1) {
            tickets.add(new maintenanceTicket(id, title, desc, loc, type));
        } else {
            tickets.add(new CleaningTicket(id, title, desc, loc, type));
        }

        System.out.println("Ticket created!");
    }

    static void viewTickets() {
        for (ticket t : tickets) {
            System.out.println("ID: " + t.getTicketId() +
                    " | Status: " + t.getStatus() +
                    " | Priority: " + t.priorityScore());
        }
    }

    static void updateStatus() {
        System.out.print("Enter Ticket ID: ");
        int id = sc.nextInt();

        for (ticket t : tickets) {
            if (t.getticketId() == id) {
                System.out.println("1.New 2.Assigned 3.Resolved");
                int s = sc.nextInt();

                if (s == 1) t.setStatus("New");
                else if (s == 2) t.setStatus("Assigned");
                else t.setStatus("Resolved");

                System.out.println("Status Updated!");
            }
        }
    }
}