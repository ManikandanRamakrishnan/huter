package GUVI;

import java.util.Scanner;

public class SumOfPrimeNumbersEndingWithThree127 {

	static int CountOneBit(int end){
		int sum=0;
		for(int i=2;i<=end;i++){
			Boolean ans=true;
			int half=i/2;
		 for(int j=2;j<=half;j++){
			 if(i%j==0){
				 ans=false;
				 break;
			 }
		 }
			if(ans&&(i%10)==3){
				sum+=i;
				}
			}
		return sum;
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println(CountOneBit(input.nextInt()));
		input.close();

	}
}
