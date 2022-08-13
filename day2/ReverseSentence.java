package day2;

import java.util.Scanner;

public class ReverseSentence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(("Enter the sentence to reverse: "));
		String sentence = sc.nextLine();
		ReverseSentence reverseSentence = new ReverseSentence();
		System.out.println(reverseSentence.reverseWord(sentence)); 
	}

	public String reverseWord(String sentence) {

		String splitSentence[] = sentence.split("\\s+");
		String reverseSentence = "";

		for(int i = 0; i< splitSentence.length ; i++) {
			StringBuilder sb=new StringBuilder(splitSentence[i]); 
			reverseSentence += sb.reverse() + " ";

		}

		return reverseSentence.trim();

	}

}
