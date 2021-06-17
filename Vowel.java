package MasterOppCocept;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		int count = 0;
	      System.out.println("Enter a string :");
	      Scanner sc = new Scanner(System.in);
	      String str = sc.nextLine();

	      for (int i=0 ; i<str.length(); i++){
	         if( str.charAt(i) == 'a'|| str.charAt(i) == 'e'|| str.charAt(i) == 'i' ||str.charAt(i) == 'o' ||str.charAt(i) == 'u'){
	            count ++;
	         }
	      }
	      System.out.println("Number of vowels in the given sentence is "+count);
	}
}

