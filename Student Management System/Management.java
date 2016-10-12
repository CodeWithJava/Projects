import java.util.*;
public class Management
{
	Scanner input=new Scanner(System.in);
	String title="\nSN\tName\tAge\tJava\tTOEFL\tMath\tSQL\tSum\tAverage";
	Student t=new Student();
	public void output(Student stu_array[])
	{
		System.out.println(title);
		for(int i=0;i<stu_array.length;i++)
		{
			if(stu_array[i]!=null)
			{
				stu_array[i].setSum();
				stu_array[i].setAvg();
				System.out.println(stu_array[i]);
			}
		}
		System.out.println();
	}
	public int orderconfirm(Student stu_array[])
	{
		for(int i=0;i<stu_array.length;i++)
		{
			if(stu_array[i]==null)
			{
				return i;
			}		
		}
		return 128;
	}
	public boolean confirm(int sn,Student anyone)
	{
		if(anyone!=null)
		{
			if(anyone.getSn()==sn)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		return false;
	}
	public void setScore(int i,Student stu_array[])
	{
		System.out.println("Please input the Serial Number of "+stu_array[i].getName());
		int sn=input.nextInt();
		stu_array[i].setSn(sn);
		System.out.println("Please input the score of Java of "+stu_array[i].getName());
		int s_java=input.nextInt();
		stu_array[i].setS_java(s_java);
		System.out.println("Please input the score of TOEFL of "+stu_array[i].getName());
		int s_toefl=input.nextInt();
		stu_array[i].setS_toefl(s_toefl);
		System.out.println("Please input the score of Math of "+stu_array[i].getName());
		int s_math=input.nextInt();
		stu_array[i].setS_math(s_math);
		System.out.println("Please input the score of SQL of "+stu_array[i].getName());
		int s_SQL=input.nextInt();
		stu_array[i].setS_SQL(s_SQL);
	}
	public void creation(String name,int age,Student stu_array[])
	{
		Student one=new Student();
		one.setName(name);
		one.setAge(age);
		int i=this.orderconfirm(stu_array);
		if(i==128)
		{
			System.out.println("the number of student is over.");
		}
		else
		{
			stu_array[i]=one;
			this.setScore(i, stu_array);
		}
	}
	public void find(int sn,Student stu_array[])
	{
		System.out.println(title);
		for(int i=0;i<stu_array.length;i++)
		{
			if(confirm(sn,stu_array[i]))
			{
				System.out.println(stu_array[i]+"\n");
			}
		}
		this.output(stu_array);
	}
	public void delete(int sn,Student stu_array[])
	{
		for(int i=0;i<stu_array.length;i++)
		{
			if(confirm(sn,stu_array[i]))
			{
				stu_array[i]=null;
			}
		}
		this.output(stu_array);
	}
	public void update(int sn,Student stu_array[])
	{
		for(int i=0;i<stu_array.length;i++)
		{
			if(confirm(sn,stu_array[i]))
			{
				System.out.println("Please update the name of student:");
				String name=input.next();
				stu_array[i].setName(name);
				System.out.println("Please update the age of student:");
				int age=input.nextInt();
				stu_array[i].setAge(age);
				System.out.println("Please update the Serial Number of student:");
				int re_sn=input.nextInt();
				stu_array[i].setSn(re_sn);
				System.out.println("Please input the score of Java of "+stu_array[i].getName());
				int s_java=input.nextInt();
				stu_array[i].setS_java(s_java);
				System.out.println("Please input the score of TOEFL of "+stu_array[i].getName());
				int s_toefl=input.nextInt();
				stu_array[i].setS_toefl(s_toefl);
				System.out.println("Please input the score of Math of "+stu_array[i].getName());
				int s_math=input.nextInt();
				stu_array[i].setS_math(s_math);
				System.out.println("Please input the score of SQL of "+stu_array[i].getName());
				int s_SQL=input.nextInt();
				stu_array[i].setS_SQL(s_SQL);
			}
		}
		this.output(stu_array);
	}
	public void subject_s(Student stu_array[])
	{
		System.out.println("Please input the code of the option:");
		System.out.println("A.Java B.TOEFL C.Math D.SQL");
		String option=input.next();
		System.out.println("Please input the code of the option:");
		System.out.println("A.Ascending Order B.Descending Order");
		String choice=input.next();
		if(option.equals("A")||option.equals("a"))
		{
			if(choice.equals("A")||choice.equals("a"))
			{
				for(int i=0;i<stu_array.length-1;i++)
				{
					for(int j=i+1;j<stu_array.length;j++)
					{
						if(stu_array[i].getS_java()>stu_array[j].getS_java())
						{
							t=stu_array[i];
							stu_array[i]=stu_array[j];
							stu_array[j]=t;
						}
					}
				}
			}
			else if(choice.equals("B")||choice.equals("b"))
			{
				for(int i=0;i<stu_array.length-1;i++)
				{
					for(int j=i+1;j<stu_array.length;j++)
					{
						if(stu_array[i].getS_java()<stu_array[j].getS_java())
						{
							t=stu_array[i];
							stu_array[i]=stu_array[j];
							stu_array[j]=t;
						}
					}
				}
			}
		}
		else if(option.equals("B")||option.equals("b"))
		{
			if(choice.equals("A")||choice.equals("a"))
			{
				for(int i=0;i<stu_array.length-1;i++)
				{
					for(int j=i+1;j<stu_array.length;j++)
					{
						if(stu_array[i].getS_toefl()>stu_array[j].getS_toefl())
						{
							t=stu_array[i];
							stu_array[i]=stu_array[j];
							stu_array[j]=t;
						}
					}
				}
			}
			else if(choice.equals("B")||choice.equals("b"))
			{
				for(int i=0;i<stu_array.length-1;i++)
				{
					for(int j=i+1;j<stu_array.length;j++)
					{
						if(stu_array[i].getS_toefl()<stu_array[j].getS_toefl())
						{
							t=stu_array[i];
							stu_array[i]=stu_array[j];
							stu_array[j]=t;
						}
					}
				}
			}
		}
		else if(option.equals("C")||option.equals("c"))
		{
			if(choice.equals("A")||choice.equals("a"))
			{
				for(int i=0;i<stu_array.length-1;i++)
				{
					for(int j=i+1;j<stu_array.length;j++)
					{
						if(stu_array[i].getS_math()>stu_array[j].getS_math())
						{
							t=stu_array[i];
							stu_array[i]=stu_array[j];
							stu_array[j]=t;
						}
					}
				}
			}
			else if(choice.equals("B")||choice.equals("b"))
			{
				for(int i=0;i<stu_array.length-1;i++)
				{
					for(int j=i+1;j<stu_array.length;j++)
					{
						if(stu_array[i].getS_math()<stu_array[j].getS_math())
						{
							t=stu_array[i];
							stu_array[i]=stu_array[j];
							stu_array[j]=t;
						}
					}
				}
			}
		}
		else if(option.equals("D")||option.equals("d"))
		{
			if(choice.equals("A")||choice.equals("a"))
			{
				for(int i=0;i<stu_array.length-1;i++)
				{
					for(int j=i+1;j<stu_array.length;j++)
					{
						if(stu_array[i].getS_SQL()>stu_array[j].getS_SQL())
						{
							t=stu_array[i];
							stu_array[i]=stu_array[j];
							stu_array[j]=t;
						}
					}
				}
			}
			else if(choice.equals("B")||choice.equals("b"))
			{
				for(int i=0;i<stu_array.length-1;i++)
				{
					for(int j=i+1;j<stu_array.length;j++)
					{
						if(stu_array[i].getS_SQL()<stu_array[j].getS_SQL())
						{
							t=stu_array[i];
							stu_array[i]=stu_array[j];
							stu_array[j]=t;
						}
					}
				}
			}
		}
		else
		{
			System.out.println("Please input correct code.");
		}
		this.output(stu_array);
	}
	public void sum_s(Student stu_array[])
	{
		System.out.println("Please input the code of the option:");
		System.out.println("A.Ascending Order B.Descending Order");
		String choice=input.next();
		if(choice.equals("A")||choice.equals("a"))
		{
			for(int i=0;i<stu_array.length-1;i++)
			{
				for(int j=i+1;j<stu_array.length;j++)
				{
					if(stu_array[i].getSum()>stu_array[j].getSum())
					{
						t=stu_array[i];
						stu_array[i]=stu_array[j];
						stu_array[j]=t;
					}
				}
			}
		}
		else if(choice.equals("B")||choice.equals("b"))
		{
			for(int i=0;i<stu_array.length-1;i++)
			{
				for(int j=i+1;j<stu_array.length;j++)
				{
					if(stu_array[i].getSum()<stu_array[j].getSum())
					{
						t=stu_array[i];
						stu_array[i]=stu_array[j];
						stu_array[j]=t;
					}
				}
			}
		}
		this.output(stu_array);
	}
}
