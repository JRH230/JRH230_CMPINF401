package jrh230_lab5;
import java.util.Scanner;
import java.util.Random;


public class RollDiceLab5 {

	public static void rollDice(int numOfRolls, Random random) {

		int countTwos = 0;
		int countThrees = 0;
		int countFours = 0;
		int countFives = 0;
		int countSixes = 0;
		int countSevens = 0;
		int countEights = 0;
		int countNines = 0;
		int countTens = 0;
		int countElevens = 0;
		int countTwelves = 0;

		for(int i = 0; i < numOfRolls; i++) {

			int rollOne = random.nextInt(6) + 1;
			int rollTwo = random.nextInt(6) + 1;

			int roll = rollOne + rollTwo;

			if (roll == 2) {
				countTwos++;
				System.out.println("The amount of rolls where the total was two was: " + countTwos 
						+ " and the fraction of rolls out of the total rolls that equaled two was: " 
						+ countTwos + "/" + numOfRolls);
			} else if (roll == 3) {
				countThrees++;
				System.out.println("The amount of rolls where the total was three was: " + countThrees 
						+ " and the fraction of rolls out of the total rolls that equaled three was: " 
						+ countThrees + "/" + numOfRolls);
			} else if (roll == 4) {
				countFours++;
				System.out.println("The amount of rolls where the total was four was: " + countFours 
						+ " and the fraction of rolls out of the total rolls that equaled four was: " 
						+ countFours + "/" + numOfRolls);
			} else if (roll == 5) {
				countFives++;
				System.out.println("The amount of rolls where the total was fives was: " + countFives 
						+ " and the fraction of rolls out of the total rolls that equaled fives was: " 
						+ countFives + "/" + numOfRolls);
			} else if (roll == 6) {
				countSixes++;
				System.out.println("The amount of rolls where the total was sixes was: " + countSixes 
						+ " and the fraction of rolls out of the total rolls that equaled sixes was: " 
						+ countSixes + "/" + numOfRolls);
			} else if (roll == 7) {
				countSevens++;
				System.out.println("The amount of rolls where the total was seven was: " + countSevens 
						+ " and the fraction of rolls out of the total rolls that equaled seven was: " 
						+ countSevens + "/" + numOfRolls);
			} else if (roll == 8) {
				countEights++;
				System.out.println("The amount of rolls where the total was eight was: " + countEights 
						+ " and the fraction of rolls out of the total rolls that equaled eight was: " 
						+ countEights + "/" + numOfRolls);
			} else if (roll == 9) {
				countNines ++;
				System.out.println("The amount of rolls where the total was nine was: " + countNines 
						+ " and the fraction of rolls out of the total rolls that equaled nine was: " 
						+ countNines + "/" + numOfRolls);
			} else if (roll == 10) {
				countTens++;
				System.out.println("The amount of rolls where the total was ten was: " + countTens 
						+ " and the fraction of rolls out of the total rolls that equaled ten was: " 
						+ countTens + "/" + numOfRolls);
			} else if (roll == 11) {
				countElevens++;
				System.out.println("The amount of rolls where the total was eleven was: " + countElevens 
						+ " and the fraction of rolls out of the total rolls that equaled eleven was: " 
						+ countElevens + "/" + numOfRolls);
			} else if (roll == 12) {
				countTwelves++;
				System.out.println("The amount of rolls where the total was twelve was: " + countTwelves 
						+ " and the fraction of rolls out of the total rolls that equaled twelve was: " 
						+ countTwelves + "/" + numOfRolls);
			}
		}
		/* System.out.println("The amount of rolls where the total was two was: " + countTwos 
				+ " and the fraction of rolls out of the total rolls that equaled two was: " 
				+ countTwos + "/" + numOfRolls);
		System.out.println("The amount of rolls where the total was three was: " + countThrees 
				+ " and the fraction of rolls out of the total rolls that equaled three was: " 
				+ countThrees + "/" + numOfRolls);
		System.out.println("The amount of rolls where the total was four was: " + countFours 
				+ " and the fraction of rolls out of the total rolls that equaled four was: " 
				+ countFours + "/" + numOfRolls);
		System.out.println("The amount of rolls where the total was fives was: " + countFives 
				+ " and the fraction of rolls out of the total rolls that equaled fives was: " 
				+ countFives + "/" + numOfRolls);
		System.out.println("The amount of rolls where the total was sixes was: " + countSixes 
				+ " and the fraction of rolls out of the total rolls that equaled sixes was: " 
				+ countSixes + "/" + numOfRolls);
		System.out.println("The amount of rolls where the total was seven was: " + countSevens 
				+ " and the fraction of rolls out of the total rolls that equaled seven was: " 
				+ countSevens + "/" + numOfRolls);
		System.out.println("The amount of rolls where the total was eight was: " + countEights 
				+ " and the fraction of rolls out of the total rolls that equaled eight was: " 
				+ countEights + "/" + numOfRolls);
		System.out.println("The amount of rolls where the total was nine was: " + countNines 
				+ " and the fraction of rolls out of the total rolls that equaled nine was: " 
				+ countNines + "/" + numOfRolls);
		System.out.println("The amount of rolls where the total was ten was: " + countTens 
				+ " and the fraction of rolls out of the total rolls that equaled ten was: " 
				+ countTens + "/" + numOfRolls);
		System.out.println("The amount of rolls where the total was eleven was: " + countElevens 
				+ " and the fraction of rolls out of the total rolls that equaled eleven was: " 
				+ countElevens + "/" + numOfRolls);
		System.out.println("The amount of rolls where the total was twelve was: " + countTwelves 
				+ " and the fraction of rolls out of the total rolls that equaled twelve was: " 
				+ countTwelves + "/" + numOfRolls);
	*/
	}


	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		String discontinued = userInput.nextLine(); 
		int continuing = userInput.nextInt();
		int counterr = 0;
		while (!discontinued.equals("Quit")) {
			if (discontinued.equals("Quit)") ) {
				System.out.println("The program is done running.");
			} else {
				rollDice(continuing, new Random());
				counterr++;
			}
		if (counterr >= continuing) {
		break;
		}
	}
		userInput.close();
	}

}
