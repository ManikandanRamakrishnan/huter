package GUVI;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumCoins {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int countCoin=0;
		int[] coin=new int[n];
		for(int i=0;i<n;i++){
			coin[i]=input.nextInt();
		}
		int sum=input.nextInt();
		Arrays.sort(coin);
		for(int i=n-1;i>=0;i--){
			countCoin+=sum/coin[i];
				sum=sum%coin[i];
			}
		if(sum==0){
			System.out.println(countCoin);
		}
		else{
			System.out.println("Not possible");
		}
		input.close();
		}

	}


