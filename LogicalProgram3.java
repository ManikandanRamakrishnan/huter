package Logical;

import java.util.Scanner;

public class LogicalProgram3 {
	public static int output1;
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		userMethod(input.nextInt() );
		System.out.println( output1 );
		input.close();

	}
	public static void userMethod( int input1 ) {
		int sum=0;
		int count=0;
		int number=input1;
		while(input1>0){
			count++;
			input1/=10;
		}
		while(number>0){
			int mod=number%10;
			int power=1;
			for(int i=0;i<count;i++){
				power=power*mod;
			}
			sum+=power;
			number/=10;	
		}
		output1=sum;
		}

}
