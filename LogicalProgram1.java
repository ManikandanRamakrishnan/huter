package Logical;

import java.util.Scanner;

public class LogicalProgram1 {
	public static int output1;
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		userMethod(input.nextInt() );
		System.out.println( output1 );
        input.close();
	}
	public static void userMethod( int input1 ) {
		int number=input1;
		int sum=0;
		while(number>0){
			input1=number;
			while(input1>0){
				sum+=input1%10;
				input1/=10;
			}
			number/=10;
			
		}
		output1=sum;
		}

}
