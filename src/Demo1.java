import java.util.Scanner;
public class Demo1 
{
	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter the num");
		int inp=ip.nextInt();
		int sum=0;
		while(inp>9)
		{
			int d=inp%10;
			sum=sum+(d*d);
			inp=inp/10;
		}
		System.out.println(sum);
	}
}
