package week3;

import java.util.Arrays;
import java.util.Scanner;

public class Week3 {

	public static void main(String[] args) {
		// Q1. Create an array of int called ages that contains the following values: 3,
		// 9, 23, 64, 2, 8, 28, 93.
		int[] ages = new int[9];
		ages[0] = 3;
		ages[1] = 9;
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5] = 8;
		ages[6] = 28;
		ages[7] = 93;
		ages[8] = 1;
//		// Q1a. Programmatically subtract the value of the first element in the array
//		// from the value in the last element of the array (i.e. do not use ages[7] in
//		// your
//		// code). Print the result to the console.
		int sub = ages[7] - ages[0];
		System.out.println(sub);
//		// Q1b.Add a new age to your array and repeat the step above to ensure it is
//		// dynamic (works for arrays of different lengths).
		int sub2 = ages[8] - ages[0];
		System.out.println(sub2);
//		// Q1c.Use a loop to iterate through the array and calculate the average age.
//		// Print the result to the console.
		System.out.println(calculateAverage(ages));
//		// Q2.Create an array of String called names that contains the following values:
//		// “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		String[] names = new String[6];
		names[0] = "Sam";
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Sally";
		names[4] = "Buck";
		names[5] = "Bob";
//		// Q2a.Use a loop to iterate through the array and calculate the average number
//		// of letters per name. Print the result to the console.
		System.out.println(avgName(names));
//		// Q2b.Use a loop to iterate through the array again and concatenate all the
//		// names together, separated by spaces, and print the result to the console.
		System.out.println(String.join(" ", names));
//		// Q3.How do you access the last element of any array?
		System.out.println(names.length - 1);
		System.out.println(names[5]);
//		// Q4.How do you access the first element of any array?
		System.out.println(names[0]);
//		// Q5.Create a new array of int called nameLengths.
//		// Write a loop to iterate over
//		// the previously created names array and add the length of each name to the
//		// nameLengths array.
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		System.out.println(Arrays.toString(nameLengths));
//		// Q6. Write a loop to iterate over the nameLengths array and calculate the sum
//		// of all the elements in the array. Print the result to the console.
		System.out.println(sumNameData(nameLengths));
		// Q7. Write a method that takes a String, word, and an int, n, as arguments and
		// returns the word concatenated to itself n number of times.
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a word");
		String word = in.nextLine();
		System.out.println("Enter a number 1-9");
		int n = in.nextInt();
		System.out.println(multiplyString(word, n));
		// Q8. Write a method that takes two Strings, firstName and lastName, and
//				// returns a full name
		Scanner in1 = new Scanner(System.in);
		System.out.println("Enter your first name");
		String firstName = in1.nextLine();
		System.out.println("Enter your last name");
		String lastName = in1.nextLine();
		System.out.println(fullName(firstName, lastName));
		// Q9. Write a method that takes an array of int and returns true if the sum of
		// all the ints in the array is greater than 100.
		int y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of ints you want to store:");
		y = sc.nextInt();
		int[] userArray = new int[y];
		System.out.println("Enter " + y + " elements:");
		for (int i = 0; i < y; i++) {
			userArray[i] = sc.nextInt();
		}
		System.out.println("Your array elements are: ");
		for (int i = 0; i < y; i++) {
			System.out.println(userArray[i]);
		}

		System.out.println(trueSumArray(userArray) + ": The sum of the array is greater than 100");
		// Q10. Write a method that takes an array of double and returns the average of
		// all the elements in the array.
		double x;
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the number of doubles you want to store:");
		x = sc1.nextDouble();
		double[] userDoubleArray = new double[(int) x];
		System.out.println("Enter " + x + " doubles:");
		for (int i = 0; i < x; i++) {
			userDoubleArray[i] = sc1.nextDouble();
		}
		System.out.println("Your array elements are: ");
		for (int i = 0; i < x; i++) {
			System.out.println(userDoubleArray[i]);
		}
		System.out.println("The average of your doubles is " + averageDouble(userDoubleArray));
		// Q11.
		double z;
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter the number of doubles you want to store in the second array:");
		z = sc2.nextDouble();
		double[] userDoubleArray2 = new double[(int) z];
		System.out.println("Enter " + z + " doubles:");
		for (int i = 0; i < z; i++) {
			userDoubleArray2[i] = sc2.nextDouble();
		}
		System.out.println("Your 2nd array elements are: ");
		for (int i = 0; i < z; i++) {
			System.out.println(userDoubleArray2[i]);
		}
		System.out.println("The average of your doubles is " + averageDouble2(userDoubleArray2));
		// Q11a.
		System.out.println(compareDoubleArrays(userDoubleArray, userDoubleArray2)
				+ ": The average of the first array is greater than average of the second");
		// Q12. Write a method called willBuyDrink that takes a boolean isHotOutside,
		// and a double moneyInPocket, and returns true if it is hot outside and if
		// moneyInPocket is greater than 10.50.
		System.out.println("Is it hot outside? True or False?");
		Scanner sc3 = new Scanner(System.in);
		boolean isHotOutside = sc3.nextBoolean();
		if (isHotOutside == true) {
			System.out.println("It is HotOutside!");
		} else if (isHotOutside == false) {
			System.out.println("Put on a jacket!");
		}
		System.out.println("HOw much money do you have in your pocket?");
		Scanner sc4 = new Scanner(System.in);
		double moneyInPocket = sc4.nextDouble();
		System.out.println("You have " + moneyInPocket + " in your pocket!");
		System.out.println("Will you buy a drink today?: " + willBuyDrink(moneyInPocket, isHotOutside));
		//Q13. 
		double sodaCost = 1.99;
		double myCash = 29.00;
		int sodaBought = 0;
		double cashSpent = 0.0;
		itemBoughtCashSpent(sodaCost, myCash, sodaBought, cashSpent);
	}

	// Q1c.
	private static int calculateAverage(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum / numbers.length;
	}

	// Q2a.
	private static int avgName(String[] names) {
		int sum = 0;
		for (String n : names) {
			sum += n.length();
		}
		return sum / names.length;
	}

	// Q6.
	private static int sumNameData(int[] nameLengths) {
		int sum = 0;
		int i;
		for (i = 0; i < nameLengths.length; i++)
			sum += nameLengths[i];
		return sum;
	}

	// Q7.
	private static String multiplyString(String word, int n) {
		String result = "";
		for (int i = 0; i < n; i++) {
			result += word;
		}
		return result;
	}

	// Q8.
	private static String fullName(String firstName, String lastName) {
		String result = firstName + " " + lastName;
		return result;
	}

	// Q9.
	private static boolean trueSumArray(int[] userArray) {
		int sum = 0;
		for (int value : userArray) {
			sum += value;
		}
		if (sum > 100) {
			return true;
		}
		return false;
	}

	// Q10.
	private static double averageDouble(double[] userDoubleArray) {
		double sum = 0.0;
		for (double element : userDoubleArray) {
			sum += element;
		}
		return sum / userDoubleArray.length;
	}

	// Q11.
	private static double averageDouble2(double[] userDoubleArray2) {
		double sum = 0.0;
		for (double element : userDoubleArray2) {
			sum += element;
		}
		return sum / userDoubleArray2.length;
	}

	// Q11a.
	private static boolean compareDoubleArrays(double[] userDoubleArray, double[] userDoubleArray2) {
		return averageDouble(userDoubleArray) > averageDouble2(userDoubleArray2);
	}

	// Q12.
	private static boolean willBuyDrink(double moneyInPocket, boolean isHotOutside) {
		if ((isHotOutside) && (moneyInPocket > 10.50)) {
	}
		return isHotOutside; 

	}
	//Q13. 
	private static void itemBoughtCashSpent(double sodaCost, double myCash, int sodaBought, double cashSpent) {
		while (myCash >= sodaCost) {
			sodaBought += 1;
			cashSpent += sodaCost;
			myCash -= sodaCost;
		}
		String spent = String.format("%.2f", cashSpent);
		String cash = String.format("%.2f", myCash);
		System.out.println("I bought " + sodaBought + " soda(s) for $" + spent + ". I have $" + cash + " eft in my wallet");
	}
	}
