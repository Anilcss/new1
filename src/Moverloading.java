




public class Moverloading
{

void m1(int a)
	{
		System.out.println("Hi there");
	}

void m1(double d)
	{
		System.out.println("Hello");
	}
	
	public static void main(String[] args) 
	{
		Moverloading m=new Moverloading();
		m.m1(5);
		m.m1(5.65);

	}
}
