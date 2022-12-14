package Creating_Exception;

public class Facebook 
{
	static void Password() throws VerPass
	{
		String pwd="ASIDJOSKakfm";
				if(pwd.length()>=8)
				{
					System.out.println("VAlid Password");
				}
				else
				{
					throw new VerPass("Invalid Password");
				}
	}
	
	
	public static void main(String[] args) 
	{
		try {
		Password();
		}
		catch(VerPass e)
		{
			System.out.println(e.getmsg());
		}
	}
}
class VerPass extends Exception
{
	 String msg;
	 VerPass(String msg)
	 {
		 this.msg=msg;
	 }
	 public String getmsg()
	 {
		 return msg;
	 }
	 

}
