package sce.sc2002.ayong.lab3;

import sce.sc2002.ayong.common.IUserInput;
import sce.sc2002.ayong.common.UserInput;

public class PlaneApp {
    private static Plane plane = new Plane();
    private static IUserInput sc;

    public PlaneApp(IUserInput input) {
        sc = input;
    }

    public static void main(String[] args) {
        if (sc == null) {
            sc = new UserInput();
        }
        int choice;
        PrintOptions();
        do {
            Print("\nEnter the number of your choice: ");
            choice = sc.nextInt();
            Run(choice);
        } while (choice != 7);
        sc.close();
    }

    public static void Run(int choice) {
        switch (choice) {
            case 1:
                Print("Number of empty seats: ");
                plane.showNumEmptySeats();
                break;
            case 2:
                Println("Empty seats: ");
                plane.showEmptySeats();
                break;
            case 3:
                Println("Assigned seats by seat ID: ");
                plane.showAssignedSeats(true);
                break;
            case 4:
                Println("Assigned seats by customer ID: ");
                plane.showAssignedSeats(false);
                break;
            case 5:
                Println("Assigning seat... ");
                Print("Seat ID: ");
                int seatId = sc.nextInt();
                Print("Customer ID:");
                int custId = sc.nextInt();
                plane.assignSeat(seatId, custId);
                break;
            case 6:
                Println("Unassigning seat... ");
                Print("Seat ID: ");
                if (plane.unassignSeat(sc.nextInt())){
                    Println("Seat Unassigned!");
                }
                break;
            case 7:
                Println("Program terminating ....");
                break;
        }
    }


    private static void PrintOptions() {
        Println("Perform the following methods:");
        Println("1: Show the number of empty seats");
        Println("2: Show the list of empty seats");
        Println("3: Show the list of customer together with their seat numbers in the order of the seat numbers");
        Println("4: Show the list of customer together with their seat numbers in the order of the customer ID");
        Println("5: Assign a customer to a seat");
        Println("6: Remove a seat assignment");
        Println("7: quit");
    }

    private static void Print(String value) {
        System.out.print(value);
    }

    private static void Println(String value) {
        System.out.println(value);
    }
}
