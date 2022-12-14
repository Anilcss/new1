
public class printstacktrace1 
{

	static void disp1()
	{
		int i=1/0;
	}
	static void disp2()
	{
		disp1();
	}
	static void disp3()
	{
		disp2();
	}
	public static void main(String[] args) {
		
		try {
		disp3();
		}
		catch(ArithmeticException e)
		{
			//e.printStackTrace();
			System.out.println("Handled.....");
		}
		

	}

}
