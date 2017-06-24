package GUVI;

import java.util.Scanner;

public class MakeSquareOrNot {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] points=new int[8];
		for(int i=0;i<8;i++){
			points[i]=input.nextInt();
		}
        int a=Math.abs(points[0]-points[4]);
        int b=Math.abs(points[2]-points[6]);
        int c=Math.abs(points[1]-points[3]);
        int d=Math.abs(points[5]-points[7]);
        if(a==b&&a==c&&a==d){
        	System.out.println("Square");
        }
        else{
        	System.out.println("Not a Square");
        }
        input.close();
	}

}
