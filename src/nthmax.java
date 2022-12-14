import java.util.Arrays;
import java.util.Scanner;
public class nthmax {
	public static void main(String[] args) {
		int arr[]= {65,45,68,98,44,35,21};
		Arrays.sort(arr);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Nth number");
		int n=sc.nextInt();
		System.out.println(arr[arr.length-n]);
	}

}
