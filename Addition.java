import java.util.*;
class Addition 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int start=sc.nextInt();
		int end=sc.nextInt();
		System.out.println(sum(start,end));
	}
	public static int sum(int a,int b)
	{
		int sum1=0;
		for(int i=a;i<=b;i++)
		{
			sum1+=i;
		}
		return sum1;
	}
}
