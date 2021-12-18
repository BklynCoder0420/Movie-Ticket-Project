//Raymond Cai
public class Selection {
	private int adult;
	private int child;
	private int senior;
	private int total;
	private int[] seats;
	
	public Selection() {
		this.adult += 1;
	}
	
	public Selection(int adultSeats, int childSeats, int seniorSeats) {
		this.adult = adultSeats;
		this.child = childSeats;
		this.senior = seniorSeats;
		this.seats = new int[getTotalSeats()];
	}
	
	
	public int getAdultSeats() {
		return this.adult;
	}
	public void setAdultSeats(int adult) {
		this.adult = adult;
		this.seats = new int[getTotalSeats()];
	}
	
	
	public int getChildSeats() {
		return this.child;
	}
	public void setChildSeats(int child) {
		this.child = child;
		this.seats = new int[getTotalSeats()];
	}
	
	
	public int getSeniorSeats() {
		return this.senior;
	}	
	public void setSeniorSeats(int senior) {
		this.senior = senior;
		this.seats = new int[getTotalSeats()];
	}

	public int getTotalSeats() {
		return this.total = adult + child + senior;
	}
	
	
	public String getSeatPosition() {
		String seatsOrdered = "";
		for(int i = 0; i < this.seats.length; i++)
		{
			seatsOrdered += this.seats[i] + ", ";
		}
		return seatsOrdered;
	}
	public void setSeatPosition(int seats) {
		for(int i = 0; i < this.seats.length; i++)
		{
			this.seats[i] = seats+i;
		}
	}

	public static void main(String[] args) {
		Selection select = new Selection(3,2,1);
		select.setAdultSeats(2);
		select.setChildSeats(1);
		select.setSeniorSeats(2);
		select.setSeatPosition(4);
		
		System.out.println("Adults: " + select.getAdultSeats());
		System.out.println("Children: " + select.getChildSeats());
		System.out.println("Seniors: " + select.getSeniorSeats());
		System.out.println("Seats: " + select.getSeatPosition());

	}

}
