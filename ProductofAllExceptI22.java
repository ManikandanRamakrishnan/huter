package GUVI;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductofAllExceptI22 {

	public static void main(String[] args) {
		int product=1;
		Scanner input=new Scanner(System.in);
		ArrayList<Integer> arr=new ArrayList<Integer>();
		ArrayList<Integer> out=new ArrayList<Integer>();
		System.out.println("Enter N value");
		int n=input.nextInt();
		for(int i=0;i<n;i++){
			arr.add(input.nextInt());
		}
		arr.remove(input.nextInt());
		for(int i:arr){
			product*=i;
			out.add(product);
		}
		for(int i:out){
			System.out.println(i);
		}
		input.close();

	}

}
