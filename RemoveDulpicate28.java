package GUVI;

import java.util.HashSet;
import java.util.Scanner;
public class RemoveDulpicate28 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		HashSet<Character> uniqueString=new HashSet<Character>();
		for(int i=0;i<str.length();i++){
			if(uniqueString.add(str.charAt(i))){
				System.out.print(str.charAt(i));
			}
		}
input.close();
	}

}
