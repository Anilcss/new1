package Runtime;
import java.lang.Exception;
public class Test 
{
	public static void main(String[] args) 
	{
		try
		{
			int i=10;
			int x=1/0;
			int arr[]= {1,5,3,4,6};
				try {
				System.out.println(arr[i]);
				}
				catch(ArrayIndexOutOfBoundsException e)
				{
					System.out.println("Caught");
				}
		}
		catch(ArithmeticException e)
		{
		System.out.println("Handled");
		}
	}
}
