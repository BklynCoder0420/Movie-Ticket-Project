import java.util.*;

public class Ticket extends Selection{

    private int member;
    private int numberOfAdults;
    private int numberOfChildren;
    private int numberOfSeniors;
    private int memberPoints;
    public double adultPrice;

    public Ticket(int adultSeats, int childSeats, int seniorSeats) {
		super(adultSeats, childSeats, seniorSeats);
		// TODO Auto-generated constructor stub
	}

    public double getAdults() {
        numberOfAdults = this.getAdultSeats();
        return numberOfAdults;
    }
    
    public double getChildren() {
        numberOfChildren = this.getChildSeats();
        return numberOfChildren;
    }

    public double getSeniors() {
        numberOfSeniors = this.getSeniorSeats();
        return numberOfSeniors;
    }

    public double getAdultPrice() {
        return getAdults() * 1.25;
    }

    public double getChildrenPrice() {
        return getChildren() * .75;
    }

    public double getSeniorPrice() {
        return getSeniors() * .5;
    }

    public double totalPrice() {
        return getAdultPrice() + getChildrenPrice() + getSeniorPrice(); 
    }

    public int membershipPounts() {
        int Points = (int) Math.round(totalPrice());
        memberPoints += Points;
        return memberPoints;
    }
}
