// -------------------------------------------------------
// PoS Project
// Written by: Mohamed 

// --------------------------------------------------------
// --------------------------------------------------------


// Class: PoS

/*
 * The PoS Class contain the attributes and methods of our Point of Sale's. This class' specific goal is to link the classes
 * Sales and PrePaiCard together in a single class. It links them together and process different methods that allows the user
 * to keep track of the prepaid cards, sales, meals and other functionalities.
 */



public class PoS {
	
	// Attributes
	Sales Sales = new Sales();
	PrePaiCard[] PrePaiCards= {};
	
	
	
	// Default Constructor
	public PoS(){}
	
	// Constructor that uses object of type Sales and an array of Objects of type PrePaiCards
	
	PoS(Sales Sales, PrePaiCard[] PrePaiCards){
		this.Sales=Sales;
		this.PrePaiCards=PrePaiCards;
	}
	
	// Main methods
	
	
	// A method that determines if two PoS objects have the same total sales value
	
	public boolean totalSalesequals(Object obj) {
		PoS o = (PoS) obj;
		
		if (this.Sales.salesTotal()!=o.Sales.salesTotal())
			return false;
		
		return true;
	}
	
	
	// A method that determines if the number of each category of two PoS objects are equal
	
	public boolean numberSalesequals(Object obj) {
		PoS o = (PoS) obj;
		
		return (this.Sales.equals(o.Sales));
			
		}
	
	
	// A method that returns the total sales of a Po

	public int totalSale() {
		return this.Sales.salesTotal();
	}
	
	
	
	// A method that returns the number of prepaid cards in a PoS
	
	public int numberPrepaidCards() {
		return this.PrePaiCards.length;
	}
	

	// A method which will add a new PrePaiCard to the PoS
	
	public int addPrepaidCards() {
	
		PrePaiCard[] copy= new PrePaiCard[PrePaiCards.length+1];
		for (int i=0; i<PrePaiCards.length; i++) {
			copy[i]=PrePaiCards[i];
		}
		this.PrePaiCards=copy;
		
		return PrePaiCards.length;
	
	}
	
	
	// A method which will remove a pre-paid card from the PoS
	
	public boolean removePrepaidCard(int position) {
		if (this.PrePaiCards.length==0) {
			return false;
		}
		
		else {
		PrePaiCard[] copy2= new PrePaiCard[PrePaiCards.length-1];
		int j=0;
		for (int i=0; i<PrePaiCards.length-1; i++) {
			
			if (j!=position) {
				copy2[i]=PrePaiCards[j];
				j++;
			}
			else {
				j++;
				copy2[i]=PrePaiCards[j];
				
				
			}
			
		}
		this.PrePaiCards=copy2;
		return true;
		}
	}
	
	
	// A method which will update the expiry day and month of a prepaid card
	
	public void updateDayMonth(int PrePaiCard, int day, int month) {
		for (int i=0; i<PrePaiCards.length;i++) {
			if (PrePaiCards[i].getId()==PrePaiCard) {
				PrePaiCards[i].setDay(day);
				PrePaiCards[i].setMonth(month);
			}
		}
	}
	
	
	// A method which will add meal sales to the PoS
	
	public int addMealsSales(int junior, int teen, int medium, int big, int family) {
		Sales.addSales(junior, teen, medium, big, family);
		return Sales.salesTotal();
	}
	
	
	// A method which returns true if the total amount sale value and the number of pre-paid card of two
	// objects are equal and false otherwise
	
	public boolean equals(Object obj) {
		PoS s = (PoS) obj;
		
		if (this.Sales.salesTotal()!=s.Sales.salesTotal())
			return false;
		
		if (this.PrePaiCards.length!=s.PrePaiCards.length)
			return false;
	
		return true;
	
	}
	
	
	// A method that returns a string indicating the number of each meal sales category and the details of
	// each pre-paid card of the PoS
	
	public String toString() {
		String m1 = Sales.toString();
		String m2 ="";
		if (PrePaiCards.length==0) {
			m2+="No PrePaiCards";
			return (m1 + "\n" + m2 + "\n" );
		}
		
		else {
			
			for (int i=0;i<PrePaiCards.length;i++) {
				m2+=PrePaiCards[i].toString();
		}
			return (m1+ "\n" + m2);
		
		}
	}
	
	
	// A method which will return a string with the breakdown of sales
	public String breakdowwnSales() {
		return (Sales.toString() + "and the sales total is "+ Sales.salesTotal());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


