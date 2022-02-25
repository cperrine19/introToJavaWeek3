package week3;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double itemPrice1 = 10.5;
		double itemPrice2 = 5.5;
		double walletAmount1 = 20;
		double walletAmount2 = 40;
		int numberOfFriendsA = 2;
		int numberOfFriendsB = 4;
		int ageA = 10;
		int ageB = 30;
		String firstName = "Chelsea";
		String lastName = "Perrine";
		char middleInitialA = 'A';
		char middleInitialB = 'B'; 
		
		double remainingWalletAmount = walletAmount1 - itemPrice2;
		int friendsPerYear = (ageA * numberOfFriendsA) / ageA;
		String fullName = (firstName + " " + middleInitialA + " " + lastName);
		
		System.out.println("I have $" + remainingWalletAmount + " left in my wallet");
		System.out.println("I have averaged " + friendsPerYear + " friends per year");
		System.out.println("My name is " + fullName);
	}

}
