//Erick Humala
import java.util.Scanner;
import java.util.Date;

public class Menu {
	final static Scanner input = new Scanner(System.in);
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Movie spider = new Movie("SPIDER-MAN: NO WAY HOME",new Date(2021,11,17), 9.5, 2.30);
		Movie eternal = new Movie("ETERNALS",new Date(2021,10,5), 7.5, 2.40);
		Movie dune = new Movie("DUNE",new Date(2021,9,22), 9.5, 2.30);
		Movie house = new Movie("HOUSE OF GUCCI",new Date(2021,10,24), 7.5, 2.40);
		Movie encanto = new Movie("ENCANTO",new Date(2021,10,24), 8.5, 1.50);
		Movie matrix = new Movie("THE MATRIX RESURRECTIONS",new Date(2021,11,22), 8.5, 2.30);
		Movie king = new Movie("KING'S MAN",new Date(2021,11,22), 7.5, 2.10);
		
		
		while(true) {
			options();
			System.out.println("Please select a movie: ");
			int choice = input.nextInt();
			
			if(choice==0) 
			{
				options();
				System.out.println("Please choose a movie: ");
				choice = input.nextInt();	
			}	
			movieDetails(choice,spider,eternal,dune,house,encanto,matrix,king);
		}

	}
	
	public static void movieDetails(int choice, Movie spider, Movie eternal, Movie dune, Movie house ,Movie encanto, Movie matrix, Movie king) {	
		int th,at;

		switch(choice) {
		case 1:
			System.out.println(spider.toString());
			theaters();
			System.out.println("Please select a theater:");
			th = input.nextInt();
			if(th==0) {
				options();
				break;
			}
			avaliableTime();
			System.out.println("Select a Time:");
			at = input.nextInt();
			if(at==0) {
				theaters();
				break;
			}
			select();
			break;
		case 2:
			System.out.println(eternal.toString());
			theaters();
			System.out.println("Please select a theater:");
			th = input.nextInt();
			if(th==0) {
				options();
				break;
			}
			avaliableTime();
			System.out.println("Select a Time:");
			at = input.nextInt();
			if(at==0) {
				theaters();
				break;
			}
			select();			
			break;
		case 3:
			System.out.println(dune.toString());
			theaters();
			System.out.println("Please select a theater:");
			th = input.nextInt();
			if(th==0) {
				options();
				break;
			}
			avaliableTime();
			System.out.println("Select a Time:");
			at = input.nextInt();
			if(at==0) {
				theaters();
				break;
			}
			select();
			break;
		case 4:
			System.out.println(house.toString());
			theaters();
			System.out.println("Please select a theater:");
			th = input.nextInt();
			if(th==0) {
				options();
				break;
			}
			avaliableTime();
			System.out.println("Select a Time:");
			at = input.nextInt();
			if(at==0) {
				theaters();
				break;
			}
			select();
			break;
		case 5:
			System.out.println(encanto.toString());
			theaters();
			System.out.println("Please select a theater:");
			th = input.nextInt();
			if(th==0) {
				options();
				break;
			}
			avaliableTime();
			System.out.println("Select a Time:");
			at = input.nextInt();
			if(at==0) {
				theaters();
				break;
			}
			select();
			break;
		case 6:
			System.out.println(matrix.toString());
			theaters();
			System.out.println("Please select a theater:");
			th = input.nextInt();
			if(th==0) {
				options();
				break;
			}
			avaliableTime();
			System.out.println("Select a Time:");
			at = input.nextInt();
			if(at==0) {
				theaters();
				break;
			}
			select();
			break;
		case 7:
			System.out.println(king.toString());
			theaters();
			System.out.println("Please select a theater:");
			th = input.nextInt();
			if(th==0) {
				options();
				break;
			}
			avaliableTime();
			System.out.println("Select a Time:");
			at = input.nextInt();
			if(at==0) {
				theaters();
				break;
			}
			select();
			break;
		}
	}
	
	public static void options() 
	{
		System.out.println("\n"+"Now playing");
		System.out.println("1: SPIDER-MAN: NO WAY HOME");
		System.out.println("2: ETERNALS");
		System.out.println("3: DUNE");
		System.out.println("4: HOUSE OF GUCCI");
		System.out.println("5: ENCANTO");
		System.out.println("6: THE MATRIX RESURRECTIONS");
		System.out.println("7: KING'S MAN");
		System.out.println("0: MAIN MENU");

	}
	
	public static void theaters() {
		System.out.println("Avaliable Theaters:");
		System.out.println("1:REGAL");
		System.out.println("2:AMC");
		System.out.println("3:HBO LOUNGE");
		System.out.println("0:MAIN MENU");

	}
	
	public static void avaliableTime() {
		System.out.println("Avaliable times:");
		System.out.println("1:9:30 am");
		System.out.println("2:5:30 pm");
		System.out.println("3:7:00 pm");		
		System.out.println("0:MAIN MENU");
	}
	
	public static void select() {
		System.out.println("\n"+"How many adult tickets would you like?: ");
		System.out.println("How many child tickets would you like?: ");
		System.out.println("How many senior tickets would you like?: ");
		int adult = input.nextInt();
		int child = input.nextInt();
		int senior = input.nextInt();
		Selection select = new Selection(adult,child,senior);	
		System.out.println("Enter the seat number where you would like to sit: ");
		int seat = input.nextInt();
		select.setSeatPosition(seat);
		System.out.println("Your seats are: " + select.getSeatPosition());
		tic(adult, child, senior);
	}
	
	public static void tic(int a, int c, int s) {
		Ticket tc = new Ticket(a, c, s);
		System.out.println("\n"+"TICKET");
		System.out.println("Admit: " + tc.getTotalSeats());
		System.out.println("Total Price: " + tc.totalPrice());	
		System.out.println("Points earned: " +tc.membershipPounts());
	}
}

