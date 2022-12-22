//4. WAP to count the number of consonants, vowels, special characters in a String.

import java.util.Scanner;
public class countstring {

	public static void main(String[] args) {
		
		System.out.print("enter the string: ");
		Scanner sc=new Scanner(System.in);
		String str;
		int consonents=0;
		int vowels=0;
		int spec_char=0;
		int digits=0;
		str=sc.nextLine();
		str=str.toLowerCase();
		for(int i=0;i<=str.length()-1;i++)
		{
			char ch=str.charAt(i);
			if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z')
			{
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
					vowels++;
				}
				else
				{
					consonents++;
				}
			}
			else if(ch>='0'&&ch<='9')
			{
				digits++;
			}
			else
			{
				spec_char++;
			}
		}
		sc.close();
		System.out.println("consonents= "+consonents);
		System.out.println("vowels= "+vowels);
		System.out.println("spec_char= "+spec_char);
		System.out.println("digits= "+digits);

	}
}
