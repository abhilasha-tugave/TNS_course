package assignment4;

public class TicketBooking {
	
	    private String stageEvent;
	    private String customer;
	    private int noOfSeats;

	    // Constructors
	    public TicketBooking() {}

	    public TicketBooking(String stageEvent, String customer, int noOfSeats) {
	        this.stageEvent = stageEvent;
	        this.customer = customer;
	        this.noOfSeats = noOfSeats;
	    }

	    // Getters
	    public String getStageEvent() {
	        return stageEvent;
	    }

	    public String getCustomer() {
	        return customer;
	    }

	    public int getNoOfSeats() {
	        return noOfSeats;
	    }

	    // Setters
	    public void setStageEvent(String stageEvent) {
	        this.stageEvent = stageEvent;
	    }

	    public void setCustomer(String customer) {
	        this.customer = customer;
	    }

	    public void setNoOfSeats(int noOfSeats) {
	        this.noOfSeats = noOfSeats;
	    }

	    
	    public void makePayment(double amount) {
	    	System.out.println("Stage event:" + stageEvent);
	        System.out.println("Customer:" + customer);
	        System.out.println("Number of seats:" + noOfSeats);
	        System.out.println("Amount " +amount+ " paid in cash");
	    }

	    public void makePayment(String walletNumber, double amount) {
	    	System.out.println("Stage event:" + stageEvent);
	        System.out.println("Customer:" + customer);
	        System.out.println("Number of seats:" + noOfSeats);
	        System.out.println("Amount " +amount+ "paid using wallet number " + walletNumber);

	    }

		public void makePayment(String creditCard, String ccv, double amount) {
	        
	        System.out.println("Stage event:" + stageEvent);
	        System.out.println("Customer:" + customer);
	        System.out.println("Number of seats:" + noOfSeats);
	        System.out.println("Holder name:" + customer);
	        System.out.println("Amount " +amount+ "paid using Master card\\n");
	        System.out.println("CCV:" + ccv);
	    }
	}


