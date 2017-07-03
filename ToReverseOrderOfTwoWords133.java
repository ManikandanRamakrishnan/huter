package GUVI;

import java.util.Scanner;

public class ToReverseOrderOfTwoWords133 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
       String str1[]=input.nextLine().split(" ");
       System.out.println(str1[1]+" "+str1[0]);
       input.close();

	}

}
