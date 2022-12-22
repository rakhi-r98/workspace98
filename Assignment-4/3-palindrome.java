//3. WAP to check if “2552” is palindrome or not.
import java.util.*;
public class palindrome {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter number");
		int num=scan.nextInt();
		int sum=0;
		int temp=num;
		while(num>0)
		{	
			int r=num%10;//101%10=1 remainder
			sum=(sum*10)+r;
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println("number is palindrome");
		}
		else
		{
			System.out.println("number not palindrome");
		}
	}

}
