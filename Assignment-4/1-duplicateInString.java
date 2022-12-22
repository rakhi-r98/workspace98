//2. WAP to print Duplicates characters from the String.
import java.util.*;
import java.lang.String;
public class DuplicateInString {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the string: ");
		String val=scan.nextLine();
		
		//Converts given string into character array  
        char string[] = val.toCharArray();  
        
		System.out.println("duplicate elements in string are: ");
		
		for(int i=0;i<string.length;i++) 
		{	
			for(int j=i+1;j<string.length;j++) 
			{
				if(string[i]==string[j]) 
				{ 
					System.out.print(string[j]+ " "); 
					System.out.println();
				} 
			}
		}	
	}

}
