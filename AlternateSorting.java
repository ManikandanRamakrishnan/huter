package GUVI;

import java.util.Arrays;
import java.util.Scanner;

public class AlternateSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int[] number=new int[n];
	for(i=0;i<n;i++){
		number[i]=input.nextInt();
	}
	Arrays.sort(number);
	int j=n-1;
	System.out.println("Output : ");
	for( i=0;i<n/2;i++,j--){
		System.out.print(number[j]+" "+number[i]+" ");
	}
	if(n%2==1){
    System.out.println(number[i]);
	}
	input.close();
	}

}
