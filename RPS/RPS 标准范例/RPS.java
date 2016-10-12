import java.util.*;
public class RPS
{
	public static void main(String[] rags)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Let us play the RPS! 1:Rock 2:Paper 3:Scissors");
		int human=input.nextInt();
		/*
		int computer=(int)(Math.random()*3)+1;
		*/
		Random number = new Random();
		int computer = number.nextInt(3)+1;

		String h_result = "Rock";
		String c_result = "Rock";

		switch(human)
		{
			case 1:
				h_result = "Rock";
			break;
			case 2:
				h_result = "Paper";
			break;
			case 3:
				h_result = "Scissors";
			break;
		}

		switch(computer)
		{
			case 1:
				c_result = "Rock";
			break;
			case 2:
				c_result = "Paper";
			break;
			case 3:
				c_result = "Scissors";
			break;
		}

		if(human==1&&computer==3||human==2&&computer==1||human==3&&computer==2)
		{
			System.out.println("you choose "+h_result+" computer choose "+c_result+" so you are the winner!");
		}
		else if(human==computer)
		{
			System.out.println("you choose "+h_result+" computer choose "+c_result+" so you get a draw!");
		}
		else
		{
			System.out.println("you choose "+h_result+" computer choose "+c_result+" so you are the loser!");
		}
	}
}