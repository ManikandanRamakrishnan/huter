package Pro;

import java.util.Scanner;

public class StrangCounter {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int[] counter=new int[n];
		int start=3;
		int end=3;
		for(int i=0;i<n;i++){
			counter[i]=start;
			if(start==1){
				end*=2;
				start=end+1;
			}
			start--;
		}
		System.out.println(counter[n-1]);
input.close();
	}

}
