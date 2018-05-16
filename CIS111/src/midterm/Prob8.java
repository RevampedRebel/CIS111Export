package midterm;

import java.util.Scanner;

public class Prob8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		System.out.println();
		*/
		
		int vow=0,x=0, i;
		String in;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a phrase:");
		in = input.nextLine();
		
		
		for(i=0;i<in.length();i++){
			// Validation
			System.out.println("Character Number " + (i+1) + ": " + (in.charAt(i)));
			
			if(in.charAt(i) == 'a' || in.charAt(i) == 'e' || in.charAt(i) == 'i' || in.charAt(i) == 'o' || in.charAt(i) == 'u') {
				vow++;
				System.out.println("This is a vowel.");

			}
			System.out.println();
		}
		System.out.println("Total Vowels: " + vow);
		System.out.println("Total Consonants: " + (in.length()-vow));
		
	}

}
