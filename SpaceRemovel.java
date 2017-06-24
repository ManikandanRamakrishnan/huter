package Ninety;

import java.util.Scanner;

public class SpaceRemovel {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String str=" ";
		String sentence=input.nextLine().trim();
		for(int i=0;i<sentence.length();i++){
			int j=i;
			if(sentence.charAt(j)==' '){
				while(sentence.charAt(j)==' '){
					j++;
				}
				i=j-1;
			}
			str+=sentence.charAt(i);
		}
System.out.println(str.trim());
input.close();
	}

}
