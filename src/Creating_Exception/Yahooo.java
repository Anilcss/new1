package Creating_Exception;

public class Yahooo {

	static void Search() throws SearchException
	{
		String str1="Online";
		String Str2="Offline";
		if(str1==Str2)
		{
			System.out.println("Enter to Seach");
		}
		else 
		{
			throw new SearchException("OFFLINE");
		}
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) 
	
	{
		try 
		{
			Search();
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
