package Pro;

import java.util.Scanner;

public class CostSplit {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int k=input.nextInt();
		int[] price=new int[n];
		int sum=0;
        for(int i=0;i<n;i++){
        	price[i]=input.nextInt();
        	sum+=price[i];
        }
        int annacost=input.nextInt();
        if(annacost==(sum/2)-(price[k]/2)){
        	System.out.println("Bon Appetit");
        }
        else{
        	System.out.println(annacost-(annacost-(price[k]/2)));
        }
        input.close();

	}

}
