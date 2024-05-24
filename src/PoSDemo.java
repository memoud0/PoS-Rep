// -------------------------------------------------------
// PoS Project
// Written by: Mohamed Mahmoud
// --------------------------------------------------------
// --------------------------------------------------------

// Class: PoSDemo (Driver Class)

/*
 * The driver class allows the user to navigate its way through the functionalities of the PoS class wwhich includes
 * the Sales and PrePaiCard classes. The PoS' role is to have a unique instance PoS that is connected to the Sales and PrePaicard
 * classes. PoSDemo connects PoS itself to the user and allow an easy navigation of the program.
 * 
 */


// Import Scanner
import java.util.Scanner;


public class PoSDemo {
	
	
	// 1. Display sale categories and prepaid cards of each PoS
	public static void allPoSsContent(PoS[] PoSs) {
		System.out.println("Content of each PoS:");
		System.out.println("---------------------");
		
		for (int i=0; i<5;i++) {
			System.out.println("PoS #" + i);
			System.out.println(PoSs[i].toString());
		}
		System.out.println("");
		
	}
	
	// 2. Display the content of and display the categories of the sales and the prepaid cards(s) for one PoS
	public static void singlePoSContent (int input2, PoS[] PoSs) {
		switch(input2) {
		
		case(0):
			System.out.println(PoSs[0].toString());
			break;
		case(1):
			System.out.println(PoSs[1].toString());
			break;
		
		case(2):
			System.out.println(PoSs[2].toString());
			break;
		case(3):
			System.out.println(PoSs[3].toString());
			break;
		
		case(4):
			System.out.println(PoSs[4].toString());
			break;
		}
		
		System.out.println("");
		
	}
	
	// 3. Display the pairs of PoS that have the same $ amount of sales
	public static void compareTotalSalesPoSs(PoS[] PoSs) {
		
		System.out.println("List of PoSs with same total $ Sales:\n");
		for (int i=0; i<PoSs.length-1;i++) {
			
			for  (int j=i+1;j<PoSs.length;j++) {
				
					if  (PoSs[i].totalSalesequals(PoSs[j])){
						System.out.println("\tPoSs " + i + " and " + j + " both have " + PoSs[i].totalSale());
			
				}
			}
		}
		
		System.out.println("");
		
	}
	
	// 4. Display the pairs of PoS that have the same $ amount distribution
	
	public static void compareAmountPoSs(PoS[] PoSs) {
		
		System.out.println("\nList of PoSs with same Sales categories");
		for (int i=0; i<PoSs.length-1;i++) {
			
			for  (int j=i+1;j<PoSs.length;j++) {
				
					if  (PoSs[i].numberSalesequals(PoSs[j])){
						System.out.println("\tPoSs " + i + " and " + j + " both have " + PoSs[i].Sales.toString());
			
				}
			}
		}
		
		System.out.println("");
	}
	
	// 5. Display all PoSs pairs that are equal based on the definition of equal in the class PoS
	
	// 5.
	
	public static void equalPairsPoSs(PoS[] PoSs) {
		
		System.out.println("List of PoSs with same $ amount of sales and same number of PrePaiCards: \n");
		
		for (int i=0; i<PoSs.length-1;i++) {
			
			for  (int j=i+1;j<PoSs.length;j++) {
				
					if  (PoSs[i].equals(PoSs[j])){
						System.out.println("\tPoSs " + i + " and " + j);
			
				}
			}
		}
		
		System.out.println("");
	}
	
	
	// 6. Add a prepaid card and its information to a specific PoS
	
	public static void addCardPoSs(PoS[] PoSs, int pos, String addtype, int addId, int addDay, int addMonth) {
	    if (PoSs[pos].PrePaiCards == null) {
	        PoSs[pos].PrePaiCards = new PrePaiCard[1];
	    } 
	    
	    else {	
	    	PoSs[pos].addPrepaidCards();
	    }
	    // Create a new PrePaiCard instance and assign values
	    PoSs[pos].PrePaiCards[PoSs[pos].PrePaiCards.length - 1] = new PrePaiCard(addtype, addId, addDay, addMonth);
	    System.out.println("You now have " + PoSs[pos].PrePaiCards.length + " PrePaiCard");
	}

	
	// 7. Remove a prepaid card from a specific PoS
	
	public static void removeCardPoSs(PoS[] PoSs, int pos, int input) {
		
		PoSs[pos].removePrepaidCard(input);
		
		System.out.println("PrePaiCard was removed successfully");

		
	}
	
	// 8. Update a prepaid card's information from a specific PoS
	
	public static void updateCardPoSs(PoS[ ] PoSs, int pos, int input, int day, int month) {
		
		PoSs[pos].updateDayMonth((PoSs[pos].PrePaiCards[input].getId()), day, month);
		
		System.out.println("Expiry Date updated.");
	}
	
	
	// 9. Add number of each category sales from a PoS's sales 
	
	// 9.
	
	public static void addSalesPoSs(PoS[ ] PoSs, int pos, int junior, int teen, int medium, int big, int family) {
		
		System.out.println("You now have " + "$" + PoSs[pos].addMealsSales(junior, teen, medium, big, family) + ".0");
	}
	
	
	

	public static void main(String[] args) {
		
		// Declare variables
		int input=-1;
		int input2;
		int i=0;
		int j=0;
		
		// Declare the Scanner
		Scanner keyIn=new Scanner(System.in);
		
		// Declare 4 objects from the PoS class
		PoS pos0 = new PoS();
		pos0.Sales= new Sales();
		
		PoS pos1 = new PoS();
		pos1.Sales= new Sales();
		
		PoS pos2 = new PoS();
		pos2.Sales= new Sales();
		
		PoS pos3 = new PoS();
		pos3.Sales= new Sales();
		
		PoS pos4 = new PoS();				
		pos4.Sales= new Sales();
		
		
		// Create an array containing all PoSs
		PoS[] PoSs= {pos0,pos1,pos2,pos3,pos4};
		
		
		
		// Hardcoded part, for test purposes only
		
		// 2 PoS with same sale cat and and sales
		
		PrePaiCard[] prePaiCards0 = new PrePaiCard[]{new PrePaiCard("Vegetarian", 40825164, 25, 12), new PrePaiCard("Carnivore", 21703195, 3, 12)};

		pos0.PrePaiCards= prePaiCards0;
	
		pos0.addMealsSales(2, 1, 0, 4, 1);
		
			
		PrePaiCard[] prePaiCards1 = new PrePaiCard[]{new PrePaiCard("Vigan", 40825164, 7, 12), new PrePaiCard("Vegetarian", 21596387, 24, 8)};
		
		pos1.PrePaiCards= prePaiCards1;
		
		pos1.addMealsSales(2, 1, 0, 4, 1);
		
		
		// 1 PoS with same amount of sale of pos1 and pos2, diff cat and 3 prepaid cards
		
		PrePaiCard[] prePaiCards2 = new PrePaiCard[]{new PrePaiCard("Pescatarian", 95432806, 1, 6), new PrePaiCard("Halal", 42087913, 18, 12),new PrePaiCard("Kosher", 40735421, 5, 4)};
		
		pos2.addMealsSales(0, 1, 5, 2, 0);
		pos2.PrePaiCards= prePaiCards2;
		
		// 2 PoS with same breakdown of sales but different from the other 3 and having no prepaid cards
		
		pos3.addMealsSales(3, 2, 4, 1, 2);
		PrePaiCard[] prePaiCards3 = new PrePaiCard[]{};
		pos3.PrePaiCards= prePaiCards3;
		
		
		pos4.addMealsSales(3, 2, 4, 1, 2);
		PrePaiCard[] prePaiCards4 = new PrePaiCard[]{};
		pos4.PrePaiCards= prePaiCards4;
		
		
		System.out.println(pos0.Sales);
		
		
		
		// Welcome the user
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("| Welcome to Concordia CostLessBites Catering Sales Counter Application |");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		

		
	
		
		// Establish a while loop that only stops when the user enters 0
		while (input!=0) {
			
			// Prompt the user to try again, if the user did not enter a proper input
			if (i>=1) {
				System.out.println("Sorry that is not a valid choice. Try again.");
			}
			
			// Print the program's menu and promp the user to make a choice
			System.out.print("What would you like to do?\n"
					+ "1. See the content of all PoSs\n"
					+ "2. See the content of one PoS\n"
					+ "3. List PoSs with same $ amount of sales\n"
					+ "4. List PoS with same number of Sales categories\n"
					+ "5. List PoSs with same $ amount of Sales and same number of Prepaid cards\n"
					+ "6. Add a Prepaid card to an existing PoS\n"
					+ "7. Remove an existing Prepaid card from a PoS\n"
					+ "8. Update the expiry date of an existing Prepaid card\n"
					+ "9. Add sales to a PoS\n"
					+ "0. To quit\n"
					+ "+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
			System.out.println("");
			System.out.print("Please enter your choice and press <Enter>:");
			
			// Ask the user for their input
			input = keyIn.nextInt();
			
			// If the user entered a value non-listed in the menu, iterate the i value which  will prompt the user to enter
			// a listed value form 0 to 9
			if (input!=1 && input!=2  && input!=3 && input!=4 && input!=5 && input!=6 && input!=7 && input!=8 && input!=9 && input!=0) {
				i++;
			}
			
			// If the user entered a listed value, i is initialized back to 0, which will not print a message letting the user know
			// they entered a non-listed value
			else{
				i=0;
			}
			
		
			// If the user input is 1, display all sale categories of each PoS
			if (input==1) {
				
				allPoSsContent(PoSs);
			
			}
			
			
			// If the user input is 2, display the categories of sales and prepaid cards of a single PoS
			else if (input==2) {
					
				System.out.print("Which PoS you want to see the content of? (Enter number 0 to 4): ");
				input2= keyIn.nextInt();
				
				// If a user asks for a non-existant PoS, prompt the user to enter a listed PoS from 0  to 4
				while(input2!=0 && input2!=1  && input2!=2 && input2!=3 && input2!=4) {
					
					if (j>=0) {
						System.out.println("Sorry but there is no PoS number " + input2);
						System.out.print("--> Try again: (Enter number 0 to 4): ");
						input2= keyIn.nextInt();
						j++;
						}
					}
			
					
				singlePoSContent(input2, PoSs);
				
			}		
			
			// If the user input is 3, compare all PoSs and display pairs that have the same $ amount of sales
			else if (input==3) {
				
				compareTotalSalesPoSs(PoSs);
				
			}
			
			// If the user input is 4, compare all PoSs and display pairs that have the same $ amount distribution
			else if (input==4) {

				compareAmountPoSs(PoSs);

			}
			
			// If the user input is 5, list all equal PoSs pairs
			else if (input==5) {

				equalPairsPoSs(PoSs);
			
			}
			
			// If the user input is 6, add a prepaid card and its information to a specific PoS
			else if (input==6) {
				
				System.out.print("Which PoS to you want to add an PrePaiCard to? (Enter number 0 to 4): ");
				
				int ppos= keyIn.nextInt();
				
				System.out.println("Please enter the following information so that we may complete the PrePaiCard-\r\n"
						+ "--> Type of PrePaiCard (Carnivore, Halal, Kosher, Pescatarian, Vegetarian, Vigan): ");
				
				String addtype= keyIn.next();
				
				System.out.print("--> Id of the prepaid card owner: ");
				
				int addid= keyIn.nextInt();
				
				System.out.print("--> Expiry day number and month (seperate by a space): ");
				
				int addday=keyIn.nextInt();
				int addmonth=keyIn.nextInt();
				
				addCardPoSs(PoSs, ppos, addtype, addid, addday, addmonth);
				
		
			}
			
			
			// If the user input is 7, remove a prepaid card from a specific PoS
			else if (input==7) {
				
				System.out.print("Please enter your choice and press <Enter>:");
				System.out.print("Which PoS you want to remove an PrePaiCard from? (Enter number 0 to 4): ");
				
				int ppos7=keyIn.nextInt();
				
				if (PoSs[ppos7].PrePaiCards.length == 0) {
			        System.out.println("Sorry that PoS has no PrePaiCards");
				}
				
				else {
					
					System.out.println("(Enter number 0 to " + (PoSs[ppos7].PrePaiCards.length-1) +"):");
					int element= keyIn.nextInt();
					removeCardPoSs(PoSs, ppos7, element);
				}
				
				
				
				
				
				
				
					
			}
			
			// If the user input is 8, update a prepaid card's information from a specific PoS
			else if (input==8) {
				
				System.out.print("Which PoS do you want to update an PrePaiCard from? (Enter number 0 to 4): ");
				
				int ppos8=keyIn.nextInt();
				
				if (PoSs[ppos8].PrePaiCards.length == 0) {
			        System.out.println("Sorry that PoS has no PrePaiCards");
				}
				
				else {
				
				System.out.println("Which PrePaiCard do you want to update? (Enter number 0 to " + (PoSs[ppos8].PrePaiCards.length-1)+"): ");
				
				int element8=keyIn.nextInt();
				
				System.out.print("--> Enter new expiry date day number and month (seperate by a space): ");
				
				int day8= keyIn.nextInt();
				
				int month8= keyIn.nextInt();
				
				updateCardPoSs(PoSs, ppos8, element8, day8, month8);
				}
			}
			
			// If the user input is 9, add number of each category sales from a PoS's sales
			else if (input==9) {
				
				System.out.print("Which PoS do you want to add Sales to? (Enter number 0 to 4): ");
				
				int ppos9=keyIn.nextInt();
				
				System.out.println("How many junior, teen ,medium,big and family meal menu do you want to add?");
				
				System.out.print("Enter 5 numbers seperated by a space): ");
				
				int junior9,teen9,medium9,big9,family9;
				
				junior9 = keyIn.nextInt();
				teen9 = keyIn.nextInt();
				medium9 = keyIn.nextInt();
				big9 = keyIn.nextInt();
				family9 = keyIn.nextInt();
				
				addSalesPoSs(PoSs, ppos9, junior9,teen9,medium9,big9,family9);
			}
			
			// If the user input is 0, exit the main menu
			else if (input==0) {
				break;
			}
			
			
		
	
			
			
		}
		
		// Printing an exit message
		System.out.println("Thank you for using Concordia CostLessBites Catering Sales Counter Application!");
		
		
		
		// Close the keyboard
		keyIn.close();
		
	}

}
