import java.util.*;
public class RPS
{
	public static void main(String rags[])
	{
		System.out.println("\nLet us play the RPS!");
		System.out.println("Please make your choice.");
		System.out.println("1.Rock 2.Paper 3.Scissors\n");
		Scanner input=new Scanner(System.in);
		int human=input.nextInt();
		Random a=new Random();
		int computer=a.nextInt(3)+1;
		/*
		int computer=(int)(Math.random()*3)+1;
		*/
		String h_option="Rock";
		String c_option="Rock";
		switch(human)
		{
			case 1:
			h_option="Rock";
			break;
			case 2:
			h_option="Paper";
			break;
			case 3:
			h_option="scissor";
			break;
		}
		switch(computer)
		{
			case 1:
			c_option="Rock";
			break;
			case 2:
			c_option="Paper";
			break;
			case 3:
			c_option="scissor";
			break;
		}
		if(human==1&&computer==3||human==2&&computer==1||human==3&&computer==2)
		{
			System.out.println("\nYour choice is "+h_option+".\nAnd computer's choice is "+c_option+".\nSo you are the winner!\nOr you can say you beat computer!");
		}
		else if(human==computer)
		{
			System.out.println("\nYour choice is "+h_option+".\nAnd computer's choice is "+c_option+".\nSo you get a draw!");
		}
		else
		{
			System.out.println("\nYour choice is "+h_option+".\nAnd computer's choice is "+c_option+".\nSo you are the loser!\nOr you can say computer beat you!");
		}

	}
}