package Creating_Exception;

public class Flipkart 
{
	 void Discount(int price) throws NodsicountException
	{
		
		if(price>=3000)
		{
			System.out.println("Discount applicable");
		}
		else
		{
			throw new NodsicountException("No Discount");
		}
	}
	public static void main(String[] args) 
	{
		try
		{
			Flipkart f1=new Flipkart();
			
			f1.Discount(20);
		}
		catch(NodsicountException e)
		{
			System.out.println(e.GetMSG());
		}
	}

}
class NodsicountException extends Exception
{
	String msg;
	NodsicountException(String msg)
	{
		this.msg=msg;
	}
	public String GetMSG()
	{
		return msg;
	}


}
