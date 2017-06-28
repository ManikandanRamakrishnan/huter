package Array;

import java.util.Scanner;

public class CoinGame {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int player1=0;
		int player2=0;
		for(int i=0;i<n;i++){
			int coinsValue=input.nextInt();
			if(i%2==0){
				player1+=coinsValue;
			}
			else{
				player2+=coinsValue;
			}
		}
		if(player1>player2){
			System.out.println("Winner Player1 and Sum="+player1);
		}
		else if(player1<player2){
			System.out.println("Winner Player2 and Sum="+player2);
		}
		else{
			System.out.println("Match tied");
		}
		input.close();

	}

}
