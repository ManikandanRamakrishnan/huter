package GUVI;

import java.util.Scanner;

public class PrisonCell30 {
	
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter Number of cells");
	int cells=input.nextInt();
	int[] cell=new int[cells];
	System.out.println("Enter Number of prisoners to be released");
	int noOfPrisoners=input.nextInt();
	while(noOfPrisoners>0){
		System.out.println("Enter prisoner that need to be released");
    int release=input.nextInt()-1;
    int count=0;
    cell[release]=1;
    int i=release-1;
    int j=release+1;
    while(i>=0&&cell[i]!=1){
    	count++;
    	i--;
    }
    while(j<cells&&cell[j]!=1){
    	count++;
    	j++;
    }
    System.out.printf("Release prisoner %d: %d gold coins\n",release+1,count);
    noOfPrisoners--;
	}
    input.close();
	}
}
