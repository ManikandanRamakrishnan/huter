package Pro;

import java.util.Scanner;

public class EncodeString {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String str1=input.next();
		String str2=input.next();
		String answer="";
		for(int i=0;i<str1.length();i++){
			char c=str1.charAt(i);
			int a=(int)c;
			if(c>=97&&c<=112){
			a+=10;	
			}
			else if(a>112&&a<=122){
				a=a+10-122;
				a+=96;
			}
			answer+=(char)a;
		}
		answer+=" ";
		for(int i=0;i<str2.length();i++){
			char c=str2.charAt(i);
			int a=(int)c;
			if(i!=0&&i!=str2.length()-1){
			if(c>=97&&c<=112){
			a+=10;	
			}
			else if(a>112&&a<=122){
				a=a+10-122;
				a+=96;
			}
			}
			answer+=(char)a;
		}
System.out.println(answer);
	}

}
