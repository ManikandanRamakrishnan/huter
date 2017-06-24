package GUVI;

import java.util.Scanner;

public class NumberOfCuts {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
		int M=input.nextInt();
		int N=input.nextInt();
		int cuts=(N<=0||M<=0)?0:(M*N)-1;
		System.out.println("Minimum number of cuts = "+cuts);
	input.close();
	}

}
