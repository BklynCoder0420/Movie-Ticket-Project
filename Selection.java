public class Selection {
	private int adult;
	private int child;
	private int senior;
	private int total;
	private int[] seats;
	
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

}
