package Logical;

import java.util.Scanner;

public class EmailValidation69 {

	private static String validateEmail(String string) {
		String answer="Invalid";
		int countAt=0;
		int countDot=0;
		int length=string.length();
		if(length>12){
		for(int i=0;i<length;i++){
			if(string.charAt(i)=='@'||string.charAt(i)=='.'){
				int count=string.charAt(i)=='@'?countAt++:countDot++;	
			}
		}
			if(countAt==1&&countDot==1){
			try{
				int betweenAtanDot=string.substring(string.indexOf('@')+1,string.indexOf('.')).length();
				int beforeAt=string.substring(0,string.indexOf('@')).length();
			if(betweenAtanDot>3&&beforeAt>2&&string.substring(length-4,length).equals(".com")){
				answer="Valid";
			}
				}
				catch(IndexOutOfBoundsException e){
					System.out.println("Invalid");
					System.exit(0);
					
				}
				
			}
		}
		return answer;

	}


	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
	System.out.println(validateEmail(input.next()));
	input.close();
    
	}

}
