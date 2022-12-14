package Creating_Exception;

public class Shaadidotcom 
{
		static void submit() throws MarriegeException
		{
			int age=18;
			if(age>21)
			{
				System.out.println("Happy Life");
			}
			else
			{
				throw new MarriegeException("Inavlid Age");
			}
		}
		public static void main(String[] args) {
			
			try {
				submit();
				
			}
			catch (MarriegeException e)
			{
				System.out.println(e.getmsg());
			}
		}
	
}
class MarriegeException extends Exception
{
	String msg;
	MarriegeException(String msg)
	{
		this.msg=msg;
	}
	public String getmsg()
	{
		return msg;
	}
}
