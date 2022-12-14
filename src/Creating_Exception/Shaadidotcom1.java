package Creating_Exception;

public class Shaadidotcom1 {
	static void submit() throws MarriegeException1
	{
		int age=15;
		if(age>21)
		{
			System.out.println("Happy life");
		}
		else
		{
			throw new MarriegeException1("Invalid Age");
		}
	}

	public static void main(String[] args)
	{
		try {
			submit();
		} catch (MarriegeException1 e) {
			System.out.println(e.getmsg());
		}

	}

}
class MarriegeException1 extends Exception
{
	String msg;
	MarriegeException1(String msg)
	{
		this.msg=msg;
	}
	public String getmsg()
	{
		return msg;
	}
	
}
