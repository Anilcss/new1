import java.util.Scanner;
public class demo {

	public static void main(String[] args) 
	{
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Password ");
		String str=ip.nextLine();
		int Ucount=0;
		int Lcount=0;
		int ncount=0;
		int scount=0;
		
		if(str.length()>8)
		{
		
			for(int i=0;i<str.length();i++)
			{
				char ch=str.charAt(i);
				if(ch>='A' && ch<='Z')
				{
				Ucount++;
				}
				else if(ch>='a' && ch<='z')
				{
				Lcount++;
				}
				else if(ch>='0' && ch<='9')
				{
				ncount++;
				}
				else
				{
				scount++;
				}
			}
	
		
		
		
			if(Ucount>=1 && Lcount>=1 && ncount>=1 && scount>=1)
		{
			
			System.out.println("Uppercase\t"+Ucount+"\nlower case\t"+Lcount+"\nNumbers \t"+ncount+"\nSpecial Char\t"+scount);
		}
		else
		{
			System.out.println("Invalid Password");
		}
		}
		else 
		{
			System.out.println("Invalid Password");
		}
	}

}
