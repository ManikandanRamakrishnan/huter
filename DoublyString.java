package GUVI;

import java.util.Scanner;

public class DoublyString {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String str=input.next();
		boolean doubleString=false;
		for(int i=0;i<str.length()&&!doubleString;i++){
			StringBuffer strBuff=new StringBuffer(str);
			strBuff=strBuff.deleteCharAt(i);
			String check=strBuff.toString();
			int n=check.length()/2;
			if((check.substring(0,n).equals(check.substring(n)))){
				doubleString=true;
		     }
		}
		if(doubleString){
			System.out.println("Possible");
		}
		else{
		
			System.out.println("Not Possible");
	}
input.close();
}
}