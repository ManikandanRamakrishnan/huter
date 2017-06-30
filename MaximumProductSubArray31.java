package GUVI;

import java.util.ArrayList;
import java.util.Scanner;

public class MaximumProductSubArray31 {

	public static void main(String[] args) {
		      Scanner input=new Scanner(System.in);
		      ArrayList<Integer> list=new ArrayList<Integer>();
		        int n=input.nextInt();
		    Integer max=new Integer(Integer.MIN_VALUE);
		       int[] arr=new int[n];
		        for(int i=0;i<n;i++){
		            arr[i]=input.nextInt();
		        }
		        for(int i=0;i<n;i++){
		           int prodect=1;
		            for(int j=i;j<n;j++){
		            	prodect*=arr[j];
		   
		                if(prodect>max){
		         
		                    max=prodect;
		                    int k=i;
		                    list.removeAll(list);
		                    while(k<=j){
		                    	list.add(arr[k++]);
		                    }
		                }
		            }
		        }
		        System.out.println("Maximum product subarry is:");
		        for(int i:list){
		        	System.out.print(i+" ");
		        }
		        System.out.println("Length is "+list.size());
		       input.close();
		    }

	}


