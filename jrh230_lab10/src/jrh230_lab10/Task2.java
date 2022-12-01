package jrh230_lab10;

public class Task2 {

	public static void main(String[] args) {
		int[] a = {1, 3, 5, 7, 9};
		int size = a.length;
		printArrayElements(a, size - 1);


	}
	
	static void printArrayElements(int a[], int index) {
		if (index != -1){
			printArrayElements(a, index - 1);
			System.out.println(a[index] + " ");
		}
	}

}
