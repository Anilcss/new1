
public class sample2 {

	public static void main(String[] args) {
		
		System.out.println("Main starts ****************");
		int[] a= {22,4,343,352,34};
		System.out.println(a.length);
		try {
		System.out.println(a[10]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Handled");
		}
		System.out.println("main ends *************");

	}

}
