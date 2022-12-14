package Creating_Exception;

public class Amazon {
	static void Discount() throws Discount_Exception
	{
		int buy=1800;
		if(buy>=2000)
		{
			System.out.println("20% OFF on PURCHASE");
		}
		else
		{
			throw new Discount_Exception("No offers <2000");
		}
		
		
	}

	public static void main(String[] args)
	{
	
			try {
				Discount();
			} catch (Discount_Exception e) {
				System.out.println(e.Msgoff());
			}
		
	}

}

class Discount_Exception extends Exception
{
	String msg;
	Discount_Exception(String msg)
	{
		this.msg=msg;
	}
	public String Msgoff()
	{
		return msg;
	}
	

}