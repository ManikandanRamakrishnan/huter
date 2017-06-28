package Logical;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LogicalProgram4 {
	public static int output1;
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		userMethod(input.nextInt());
		input.close();
		System.out.println( output1 );

	}
	public static void userMethod( int input1 ) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		int sum=0;
		int reverse=input1;
		while(input1>0){
			list.add(input1%10);
			reverse=reverse*10+input1%10;
			input1/=10;
		}
		Collections.reverse(list);
		list.add(0);
		list.remove(0);
		int number=reverse;
		int i=0;
		while(number>0){
			if(i<list.size()){
			sum+=Math.pow(number%10,list.get(i));
			}
			number/=10;
			i++;
		}
		
		output1=sum;
		}
}
