// -------------------------------------------------------
// PoS Project
// Written by: Mohamed Mahmoud
// --------------------------------------------------------
// --------------------------------------------------------

// Date of submission: Tuesday, 5 December 2023

// Class: Sales


/*
 * The main function of the Sales class is to keep track of the number of sales sold on-demand which include 5 attributes: junior, teen
 * medium,big and family. Each having an assigned price, the Sales class also has different methods with different uses: a method to 
 * increase the number of each meal category, a method that return the total sales value, a method that return the breakdown of each 
 * meal in a form of a string and a method that compares two Sales class and return true if they have the same breakdown of meal 
 * category and false otherwise.
 */

public class Sales {
	
	/// Attributes
	private int junior, teen, medium,big, family;
	
	// Default Constructor
	public Sales(){}
	
	// Constructor with the attributes as parameters
	public Sales(int junior, int teen, int medium, int big, int family){
		this.junior=junior;
		this.teen=teen;
		this.medium=medium;
		this.big=big;
		this.family=family;
	}
	
	// Copy Constructor
	public Sales(Sales other){
		this.junior=other.junior;
		this.teen=other.teen;
		this.medium=other.medium;
		this.big=other.big;
		this.family=other.family;
	}
	
	
	
	
	// Accessors methods
	
	public int getJunior() {
		return junior;
		
	}
	
	public int getTeen() {
		return teen;
		
	}
	
	public int getMedium() {
		return medium;
		
	}
	
	public int getBig() {
		return big;
		
	}
	
	public int getFamily() {
		return family;
		
	}
	
	
	// Mutators methods
	
	public void setJunior(int junior) {
		this.junior=junior;
		
	}
	
	public void setTeen(int teen) {
		this.teen=teen;
		
	}
	
	public void setMedium(int medium) {
		this.medium= medium;
		
	}
	
	public void setBig(int big) {
		this.big= big;
		
	}
	
	public void setFamily(int family) {
		this.family= family;
		
	}
	
    // Static constants for the values of each sale type
	
    public static final int juniorPrice = 5;
    public static final int teenPrice = 10;
    public static final int mediumPrice = 12;
    public static final int bigPrice = 15;
    public static final int familyPrice = 20;
	
    
    
	// Main methods
	
	// A method with 5 integer parameters that allows to increase the number of each meal category by the indicated number
    
	void addSales(int junior, int teen, int medium, int big, int family){
		this.junior+=junior;
		this.teen+=teen;
		this.medium+=medium;
		this.big+=big;
		this.family+=family;}
	
	
	// A method which returns an integer indicating the total value of the sales in PoS
	public int salesTotal() {
		
		return junior*juniorPrice+teen*teenPrice+medium*mediumPrice+big*15+family*familyPrice;
	}
	
	
	// A method which return a string indicating the count of each meal in the till
	
	public String toString() {
		return (+ junior + " x $5 + " + teen + 
				" x $10 +  " + medium + " x $12 + " + big + " x $15 + " + family + " x $20");
	}
	
	
	// A method which will return true if the two objects of type Sales being compared have the same breakdown of meal category
	// and false otherwise
	
	public boolean equals(Object obj) {
		Sales s = (Sales) obj;
		
		if (this.getJunior()!=s.getJunior())
			return false;
		
		if (this.getTeen()!=s.getTeen())
			return false;
		
		if (this.getMedium()!=s.getMedium())
			return false;
		
		if (this.getBig()!=s.getBig())
			return false;
		
		if (this.getFamily()!=s.getFamily())
			return false;
		
		
		return true;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}