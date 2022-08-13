package day3assignment4;

import java.util.Arrays;
import java.util.Scanner;

public class MissingWords {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the full sentence: ");
		String originalSentence = scanner.nextLine();
		System.out.print("Enter the matching sentence: ");
		String matchingSentence = scanner.nextLine();
		String[] originalSentencearr = originalSentence.split("\\s");
		String[] matchingSentencearr = matchingSentence.split("\\s");
		MissingWords missingWords = new MissingWords();
		System.out.println("Missing String= " + missingWords.missingsentence(originalSentencearr,matchingSentencearr));

	}

	public String missingsentence(String[] originalSentencearr,String[] matchingSentencearr) {

		String missing="";
		for (int i = 0; i < originalSentencearr.length; i++) {
			int flag = 0;
			for (int j = 0; j < matchingSentencearr.length; j++) {
				if (originalSentencearr[i].equals(matchingSentencearr[j]))
					flag = 1;
			}
			if (flag == 0) {
				missing += originalSentencearr[i] + " ";
			}
		}
		return missing.trim();

	}

}
