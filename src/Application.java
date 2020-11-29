
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Inside the main method, create one variable for each of the following real-life examples and assign them values
	double cost = 25.97; //Item Price
	double money = 300.00; //Amount of money in wallet
	int friends = 25; //Number of friends
	int age = 43; //Age in years
	String first = "Dave"; //First name
	String last = "Jones"; //Last name
	String middle = "L"; //Middle initial
	
		//Create the following variables by performing operations using the variables from the previous step
	double moneyLeft = money - cost; 
	int friendsPerYear = age / friends;
	String fullName = first + " " + middle + " " + last;
	
	System.out.println ("Amount of money left in my wallet: " + moneyLeft);
	System.out.println("Number of friends made each year: " + friendsPerYear);
	System.out.println("Full Name: " + fullName);	
	
		
	}

}
