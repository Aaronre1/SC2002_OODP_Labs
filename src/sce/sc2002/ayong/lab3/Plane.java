package sce.sc2002.ayong.lab3;

import java.util.Arrays;
import java.util.Comparator;

public class Plane {
    private PlaneSeat[] Seats;
    private int NumEmptySeats;

    public Plane() {
        NumEmptySeats = 12;
        Seats = new PlaneSeat[NumEmptySeats];
        for (int i = 0; i < NumEmptySeats; i++) {
            Seats[i] = new PlaneSeat(i + 1);
        }
    }

    public PlaneSeat[] sortSeats() {
        PlaneSeat[] seats = Seats.clone();
        Arrays.sort(seats, Comparator.comparing(i -> i.getCustomerId()));
        return seats;
    }

    public void showNumEmptySeats() {
        System.out.println(NumEmptySeats);
    }

    public void showEmptySeats() {
        for (PlaneSeat s : Seats) {
            if (!s.isOccupied()) {
                System.out.println("SeatID " + s.getSeatID());
            }
        }
    }

    public void showAssignedSeats(boolean bySeatId) {
        PlaneSeat[] seats;
        if (bySeatId) {
            seats = Seats.clone();
            Arrays.sort(seats, Comparator.comparing(i -> i.getSeatID())); //TODO: Comparator
        } else {
            seats = sortSeats();
        }

        for (PlaneSeat seat : seats) {
            if (seat.isOccupied()) {
                System.out.println("Seat ID: " + seat.getSeatID() + " Customer ID: " + seat.getCustomerId());
            }
        }
    }

    public void assignSeat(int seatId, int custId) {
        // TODO: search with .filter() .findAny() .orElse()
        PlaneSeat seat = Arrays.stream(Seats)
                .filter(i -> i.getSeatID() == seatId)
                .findAny()
                .orElse(new PlaneSeat(seatId));

        if (seat.isOccupied()) {
            System.out.println("Seat already assigned to a customer.");
        } else {
            NumEmptySeats--;
            seat.assign(custId);
        }

    }

    public boolean unassignSeat(int seatId) {
        PlaneSeat seat = Arrays.stream(Seats)
                .filter(i -> i.getSeatID() == seatId)
                .findAny()
                .orElse(null);
        if (seat != null) {
            seat.unAssign();
            NumEmptySeats++;
            return true;
        }
        return false;
    }

}
