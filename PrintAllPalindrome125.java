package GUVI;

import java.util.Scanner;

public class PrintAllPalindrome125 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		StringBuffer palindrome=new StringBuffer();
		System.out.println("Enter String");
		boolean notPalindrome=true;
		String str=input.nextLine();
		for(int i=0;i<str.length();i++)
		{
		for(int j=i+1;j<=str.length();j++)
		{
	    String sub=str.substring(i,j);	
	    palindrome=new StringBuffer(sub);
	    String rev=palindrome.reverse().toString();
	    if(sub.equals(rev)&&sub.length()>=2)
	    {
	    	notPalindrome=false;
	    	System.out.println(sub);	
	    }	
		}
		}
		if(notPalindrome){
			System.out.println("palindromes not  found");
		}
		input.close();

	}

}
