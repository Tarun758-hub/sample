import java.util.*;
class Add 
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
		int total=0;
		for(int j=a;j<=b;j++)
		{
			total+=j;
		}
		return total;
	}
}
