package Creating_Exception;

public class Google 
{
	static void Net() throws SearchException
	{
	String str="ofline";
	String str2="online";
	if(str==str2)
	{
		System.out.println("Enter somthing to search");
	}
	else
	{
		throw new SearchException("You are Offile pls connect to internet");
	}
	}
	public static void main(String[] args) 
	{
		try 
		{
		Net();
		}
		catch(SearchException e)
		{
			System.out.println(e.getmsg());
		}
		
	}

}
class SearchException extends Exception
{
	String msg;
	SearchException(String msg)
	{
		this.msg=msg;
	}
	public String getmsg()
	{
		return msg;
	}

}
