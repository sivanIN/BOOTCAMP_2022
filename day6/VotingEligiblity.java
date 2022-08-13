package day6;

import java.util.Scanner;

public class VotingEligiblity {
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		VotingEligiblity votingEligiblity = new VotingEligiblity();
		System.out.println(votingEligiblity.iseligible(age));
		
		
	}
	
	public String iseligible(int age)  {
		
		
			try {
				if(age < 18) {
				throw new AgeException("Not eligible for voting");
				}
				else {
					return "Eligible for voting";
				}
			}
			catch(AgeException e){
				return e +"";
			}
		}
		
	}


