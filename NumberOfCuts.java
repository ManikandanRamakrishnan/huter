package GUVI;

import java.util.Scanner;

public class NumberOfCuts {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int n=input.nextInt();//Number of test cases
	for(int i=0;i<n;i++){
		int M=input.nextInt();
		int N=input.nextInt();
		System.out.println("Minimum number of cuts = "+((M*N)-1));
	}
	input.close();
	}

}
