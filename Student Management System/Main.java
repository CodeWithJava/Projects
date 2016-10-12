import java.util.*;
public class Main
{
	public static void main(String[] rags)
	{
		System.out.println("Welcome to manage the information of your class!");
		System.out.println("Please input the number of students:");
		Scanner input=new Scanner(System.in);
		byte length=input.nextByte();
		Student stu_array[]=new Student[length];
		Management someone=new Management();
		while(true)
		{
			System.out.println("Please input the code of the option:\n");
			System.out.println("A:Create a student's information.");
			System.out.println("B:Find a student's information by Serial Number.");
			System.out.println("C:Delete a student's information by Serial Number.");
			System.out.println("D:Update a student's information by Serial Number.");
			System.out.println("E:Sort the students by the score of any subject.");
			System.out.println("F:Sort the students by the sum of scores.");
			System.out.println("Q:Exit the system.");
			String option=input.next();
			if(option.equals("A")||option.equals("a"))
			{
				for(int i=0;i<stu_array.length;i++)
				{
					System.out.println("Please input No."+(i+1)+" student's name:");
					String name=input.next();
					System.out.println("Please input No."+(i+1)+" student's age:");
					int age=input.nextInt();
					someone.creation(name,age, stu_array);
				}
				someone.output(stu_array);
			}
			else if(option.equals("B")||option.equals("b"))
			{
				System.out.println("Please input the Serial Number of student:");
				int sn=input.nextInt();
				someone.find(sn, stu_array);
			}
			else if(option.equals("C")||option.equals("c"))
			{
				System.out.println("Please input the Serial Number of student:");
				int sn=input.nextInt();
				someone.delete(sn, stu_array);
			}
			else if(option.equals("D")||option.equals("d"))
			{
				System.out.println("Please input the Serial Number of student:");
				int sn=input.nextInt();
				someone.update(sn, stu_array);
			}
			else if(option.equals("E")||option.equals("e"))
			{
				someone.subject_s(stu_array);
			}
			else if(option.equals("F")||option.equals("f"))
			{
				someone.sum_s(stu_array);
			}
			else if(option.equals("Q")||option.equals("q"))
			{
				System.out.println("Thank you for working with the system.");
				System.exit(0);
			}
			else
			{
				System.out.println("Please input correct code.");
			}
		}
	}
}
