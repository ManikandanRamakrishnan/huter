package Ninety;

import java.util.Scanner;

public class SentenceWithoutChangingThePositionOfWords {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String sentence=input.nextLine().trim();
		String str[]=sentence.split(" ");
		int i=0;
		for( i=0;i<str.length;i++){
			StringBuffer rev=new StringBuffer(str[i]);
			rev=rev.reverse();
			for(int j=0;j<str[i].length();j++){
			if(Character.isUpperCase(str[i].charAt(j))){
				rev.setCharAt(j,Character.toUpperCase(rev.charAt(j)));
			}
			else{
				rev.setCharAt(j,Character.toLowerCase(rev.charAt(j)));
			}
			}
			str[i]=rev.toString();
		}
		for(i=0;i<str.length-1;i++){
			System.out.print(str[i]+" ");
		}
		System.out.print(str[i]);
input.close();
	}

}
