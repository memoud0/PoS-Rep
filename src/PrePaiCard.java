// -------------------------------------------------------
// PoS Project
// Written by: Mohamed Mahmoud
// --------------------------------------------------------
// --------------------------------------------------------

// Date of submission: Tuesday, 5 December 2023

// Class: PrePaiCard

/*
 * The PrePaiCard's main function is to keep track of a Prepaid Card's data which includes the type, id, the day
 * and month it expires. Its main methods include returning a string indicating the data of a card and comparing two
 * objects of type PrePaiCard, return true if they are identical and false otherwise.
 */



public class PrePaiCard {
	
	// Attributes
	private String type, message1,message2;
	private int id, day, month;
	
	
	// Default constructor
	public PrePaiCard(){}
	
	
	// Constructor with 4 parameters 
	
	PrePaiCard(String type, int id, int day, int month){
		this.type=type;
		this.id=id;
		this.day=day;
		this.month=month;
		
		// Create an if statement in case the day value is smaller than 1 or bigger than 31, it is set to 0
		
		if (this.day<1 || this.day>31) {
			this.day=0;
		}
		
		
		// Create an if statement in case the month value is smaller than 1 or bigger than 12, it is set to 0
		
		if (this.month<1 || this.month>12) {
			this.month=0;
		}
		
		
	}
	
	// Copy Constructor with parameter of type Prepaid
	
	PrePaiCard(PrePaiCard other){
		this.type=other.type;
		this.id=other.id;
		this.day=other.day;
		this.month=other.month;
	}
	
	
	// Accessor methods
	
	public String getType() {
		return type;
	}
	
	public int getId() {
		return id;
	}
	
	public int getDay() {
		return day;
	}
	
	public int getMonth() {
		return month;
	}
	
	
	
	// Mutator methods for the due date and months
	
	public void setDay(int day) {
		
		// Create an if statement in case the day value is smaller than 1 or bigger than 31, it is set to 0
		if (this.day<1 || this.day>31) {
			day=0;
		}
		
		this.day=day;
	}
	
	public  void setMonth(int month) {
		
		// Create an if statement in case the month value is smaller than 1 or bigger than 12, it is set to 0
		if (month<1 || month>12) {
			month=0;
		}
		
		this.month=month;
	}
	
	
	//  Main  methods
	
	
	// A method which will return a string indicating the due date and the due month in a specific format
	
	public String toString() {
		
		if (day<10) {
			message1=("0" + day);
		}
		else {
			message1=(""+ day);
		}
		
		if (month<10) {
			message2=("0"+ month);
			
		}
		else {
			message2=(""+ month);
		}
		
		return (this.type + " - " + this.id + " - " + message1 + ("/") + message2 + "." + "\n");
	}
	
	
	// A method which returns true if two objects of type PrePaiCard are identical and false otherwise
	
	public  boolean equals(Object obj) {
		PrePaiCard  p = (PrePaiCard) obj;
		
		if (this.type!=p.type) 
			return false;
		
		if (this.id!=p.id)
			return false;
		
		if (this.day!=p.day)
			return false;
		
		if (this.month!=p.month)
			return false;
		
		return  true;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
