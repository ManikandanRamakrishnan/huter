package GUVI;

import java.util.ArrayList;
import java.util.Scanner;

public class SelectionProcess {

	public static void main(String[] args) {
		 Scanner input=new Scanner(System.in);
	      ArrayList<Integer> list=new ArrayList<Integer>();
	      ArrayList<Integer> even=new ArrayList<Integer>();
	      int n=input.nextInt();
	      for(int i=0;i<n;i++){
	    	  list.add(input.nextInt());
	      }
	      while(list.size()!=1){
	    	  for(int i=0;i<list.size();i++){
	    		  if(i%2!=0){
	    			 even.add(list.get(i));
	    		  }
	    	  }
	    	  list.clear();
	    	  list.addAll(even);
	    	  even.clear();
	    	  for(int j:list){
		    	  System.out.print(j+"  ");
		     }
	      }
	     
	      System.out.println("Output :"+list.get(0));
	      input.close();

	}

}
