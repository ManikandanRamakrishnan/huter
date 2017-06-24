package Eighty;

import java.util.Scanner;

public class NumberOfTwos {
	public static int countTows(int number){
		int countTwo=0;
		for(int i=0;i<=number;i++){
			int value=i;
			while(value>0){
			if(value%10==2){
				countTwo++;
			}
			value/=10;
			}
		}
		return countTwo;
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int number=input.nextInt();
	     System.out.println("OUTPUT :"+countTows(number));
	     input.close();

	}

}
