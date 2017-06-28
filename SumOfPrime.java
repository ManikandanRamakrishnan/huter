package Tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfPrime {
	public static  int howManyPrimeNumsWillGet(int input1){
		int count=1;
		int sum=input1; 
		ArrayList<Integer> list=new ArrayList<Integer>();
		ArrayList<Integer> addition=new ArrayList<Integer>();
		ArrayList<Integer> temp=new ArrayList<Integer>();
		for(int i=11;i<100;i++){
			Boolean ans=true;
		 for(int j=2;j<i;j++){
			 if(i%j==0){
				 ans=false;
				 break;
			 }
		 }
			if(ans){
				list.add(i);
			}
		}
		temp.addAll(list);
		boolean ans=true;
		while(ans){
			if(temp.get(0)>=sum){
				return 0;
			}
		for(int i=0;i<list.size();i++){
			for(int j=0;j<temp.size();j++){
			if(list.get(i)+temp.get(j)==sum){
				ans=false;
				break;
			}
			else {
				int k=list.get(i)+temp.get(j);
				addition.add(k);
			}
			}
			if(ans){	
			}
			else{
				break;
			}
		}
		count++;
		temp.clear();
		temp.addAll(addition);
		addition.clear();
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println(howManyPrimeNumsWillGet(input.nextInt()));
 input.close();
	}

}
