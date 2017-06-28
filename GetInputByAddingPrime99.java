package GUVI;

import java.util.ArrayList;
import java.util.Scanner;

public class GetInputByAddingPrime99 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
			int input1=input.nextInt(); 
			ArrayList<Integer> list=new ArrayList<Integer>();
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
			for(int i=0;i<list.size();i++){
				for(int j=0;j<temp.size();j++){
				if(list.get(i)+temp.get(j)==input1){
					System.out.println("Two prime numbers are :"+list.get(i)+" and "+temp.get(j));
					ans=false;
					break;
				}
				}
				if(!ans){
					break;
				}
		}
			if(ans){
				System.out.println("Not possible");
			}
input.close();

	}

}
