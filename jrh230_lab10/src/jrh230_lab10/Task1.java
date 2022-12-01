package jrh230_lab10;

public class Task1 {

	public static void main(String[] args) {
		
		int input = 1234;
		int sum = sumOfDigits(input);
		System.out.println(sum);

	}
	
	static int sumOfDigits (int x) {
		
		if (x == 0) {
			return 0;
		}
		
		return (x % 10) + sumOfDigits(x / 10);
	}

}
