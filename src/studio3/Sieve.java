package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Plan: adjust the numbers array that goes from 2 to n so that numbers that are "marked" become 0. 
		//Then you can print everything thats not 0 at the end

		System.out.println("Find all prime numbers up to:");
		Scanner n = new Scanner(System.in);
		int input = n.nextInt();
		int[] allInt = new int[input-1];
		
		for (int i = 0; i < allInt.length; i++) {
			allInt[i] = i+2;
		}
		
		int numberToMark;
		for (int p = 0; p < allInt.length; p++) { //this line needs to be adjusted so that it 
			//doesnt just go to the next number in allInt but instead goes to the smallest number 
			//that isnt 0 and hasnt been used yet
		
			for (int k = 2; k < input; k++) {
			numberToMark = allInt[p]*k; //multiplies next number in allInt by 2 up to by input.
				
				for (int l = 0; l < allInt.length; l++) {
					if (numberToMark == allInt[l]) {
						allInt[l] = 0;
					}
				}
			}
		}
		
		for (int prime : allInt) {
			if (prime > 0) {
				System.out.println(prime);
			}
		}

	}

}
