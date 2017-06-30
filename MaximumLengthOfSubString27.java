package GUVI;

import java.util.Scanner;

public class MaximumLengthOfSubString27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		StringBuffer rev=new StringBuffer(str);
		if(rev.reverse().toString().equals(str)){
		System.out.println("Maximum substring length :"+(str.length()-1));
		}
		else{
		System.out.println("Maximum substring length :"+str.length());
		}
		input.close();
	}
}
