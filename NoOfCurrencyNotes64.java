package GUVI;

import java.util.Scanner;

public class NoOfCurrencyNotes64 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int amount=input.nextInt();
		int countCurrency=0;
		countCurrency+=amount/500;
		amount%=500;
		countCurrency+=amount/100;
		amount%=100;
		countCurrency+=amount/50;
		amount%=50;
		countCurrency+=amount/10;
		amount%=10;
		countCurrency+=amount/1;
		System.out.println(countCurrency+" Currency Notes");
		input.close();
	}

}
