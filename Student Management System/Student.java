import java.util.*;
public class Student
{
	private int sn;
	private String name;
	private int age;
	private int s_java;
	private int s_toefl;
	private int s_math;
	private int s_SQL;
	private int sum;
	private double avg;
	public int getSn()
	{
		return this.sn;
	}
	public void setSn(int sn)
	{
		this.sn=sn;
	}
	public String getName()
	{
		return this.name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getAge()
	{
		return this.age;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getS_java()
	{
		return this.s_java;
	}
	public void setS_java(int s_java)
	{
		this.s_java=s_java;
	}
	public int getS_toefl()
	{
		return this.s_toefl;
	}
	public void setS_toefl(int s_toefl)
	{
		this.s_toefl=s_toefl;
	}
	public int getS_math(){
		return this.s_math;
	}
	public void setS_math(int s_math)
	{
		this.s_math=s_math;
	}
	public int getS_SQL()
	{
		return this.s_SQL;
	}
	public void setS_SQL(int s_SQL)
	{
		this.s_SQL=s_SQL;
	}
	public int getSum()
	{
		return this.sum;
	}
	public void setSum()
	{
		this.sum=s_java+s_toefl+s_math+s_SQL;
	}
	public double getAvg()
	{
		return this.avg;
	}
	public void setAvg()
	{
		this.avg=(double)(sum)/4;
	}
	public String toString()
	{
		String output=this.sn+"\t"+this.name+"\t"+this.age+"\t"+this.s_java+"\t"+this.s_toefl+"\t"+this.s_math+"\t"+this.s_SQL+"\t"+this.sum+"\t"+this.avg;
		return output;
	}
}
