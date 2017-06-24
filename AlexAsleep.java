package Pro;

import java.util.Scanner;

public class AlexAsleep {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int k=input.nextInt();
		String mode=input.next();
		int[] friends=new int[n];
		for(int i=0;i<k;i++){
			friends[i]=input.nextInt();
		}
		for(int i=0;i<k;i++){
			if(mode.charAt(friends[i]-1)=='0'){
				System.out.println("YES");
				System.exit(0);
			}
		}
		System.out.println("NO");
		input.close();

	}

}
