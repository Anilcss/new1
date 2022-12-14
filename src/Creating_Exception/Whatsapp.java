package Creating_Exception;

public class Whatsapp {
	static void upload() throws Video_UploadException
	{
		int time=52;
		if(time<=45)
		{
			System.out.println("Video Uploaded");
		}
		else
		{
			throw new Video_UploadException("Upload time is more");
		}
	}

	public static void main(String[] args) 
	{
		try {
			upload();
		} catch (Video_UploadException e) {
			System.out.println(e.msg());
		}
	}

}
class Video_UploadException extends Exception
{
	String msg;
	Video_UploadException(String msg) 
	{
		this.msg=msg;
	}
	public String msg()
	{
		return msg;
	}

}