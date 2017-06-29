package GUVI;

import java.util.ArrayList;
import java.util.Scanner;

public class MinimumDistance61 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
			int min=99999999;
			int distance=0;
			int temp=0;
			ArrayList<Integer> array=new ArrayList<Integer>();
			for(int i=0;i<n;i++){
				array.add(input.nextInt());
			}
			int num1=input.nextInt();
			int num2=input.nextInt();
			for(int i=0;i<n;i++){
				if(array.get(i)==num1||array.get(i)==num2){
					temp=array.get(i)==num1?num2:num1;
					int j=i;
					distance=0;
					while(j<n-1&&array.get(j)!=temp){
						distance++;
						j++;
					}
					if(array.get(j)==temp&&distance<min){
						min=distance;
					}
				}
			
			}
			if(min==99999999){
				System.out.println("Invalid Input");
			}
			else{
			System.out.println("Minimum Distance "+min);
			}
			input.close();

	}

}
