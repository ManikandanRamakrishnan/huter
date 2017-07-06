package GUVI;

import java.util.LinkedHashSet;
import java.util.Scanner;
public class RemoveDulpicate28 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		LinkedHashSet<Character> uniqueString=new LinkedHashSet<Character>();
		for(int i=0;i<str.length();i++){
			if(uniqueString.add(str.charAt(i))){
				System.out.print(str.charAt(i));
			}
		}
input.close();
	}

}
