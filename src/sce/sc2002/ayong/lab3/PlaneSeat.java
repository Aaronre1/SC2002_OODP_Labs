package sce.sc2002.ayong.lab3;

public class PlaneSeat {
    private int SeatId;
    private boolean Assigned;
    private int CustomerId;
    
    public PlaneSeat(int seatId){
        this.SeatId = seatId;
    }

    public int getSeatID() {
        return SeatId;
    }
    public int getCustomerId(){
        return CustomerId;
    }
    public boolean isOccupied(){
        return Assigned;
    }
    public void assign(int custId){
        this.CustomerId = custId;
        this.Assigned = true;
    }
    public void unAssign(){
        this.CustomerId = 0;
        this.Assigned = false;
    }
}
