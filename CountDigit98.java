package GUVI;

import java.util.Scanner;

public class CountDigit98 {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int input1=input.nextInt();
	int input2=input.nextInt();
	int input3=input.nextInt();
	int count=0;
	for(int i=input2;i<=input3;i++){
		Boolean ans=true;
	 for(int j=2;j<i;j++){
		 if(i%j==0){
			 ans=false;
			 break;
		 }
	 }
		if(ans){
			int temp=i;
			while(temp>0){
				if(temp%10==input1){
					count++;
				}
				temp/=10;
			}
		}
	}
	System.out.println(count);
	input.close();
	}

}
