
public class sample 
{
public static void main(String[] args) {
	System.out.println("Main starts************");
	try {
	int a= 1/0;
	}
	catch(ArithmeticException d){
		System.out.println("0");
	}
	System.out.println("Main ends ******************");
}
}
