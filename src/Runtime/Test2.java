package Runtime;
import java.lang.Exception;
public class Test2
{
	public static void main(String[] args) 
	{
		try {
		int arr[]= {1,6,4,5,46,4,6};
		System.out.println("HEllo");
		System.out.println(arr[555]);
			
		try {
			int i=1/0;
			}
		catch(ArithmeticException e)
		{
			System.out.println("Handled");
		}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Caught123");
		}
	}
}
