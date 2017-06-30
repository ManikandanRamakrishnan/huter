package GUVI;
import java.util.Scanner;


public class PrimeOneBitSetCount20 {
	static int CountOneBit(int start,int end){
		int primeCount=0;
		for(int i=start;i<=end;i++){
			Boolean ans=true;
			int half=i/2;
		 for(int j=2;j<=half;j++){
			 if(i%j==0){
				 ans=false;
				 break;
			 }
		 }
			if(ans){
				boolean onesCount=false;
				String binary=Integer.toBinaryString(i);
				for(int k=0;k<binary.length()-1;k++){
					if(binary.charAt(k)=='1'&&binary.charAt(k+1)=='1'){
						 onesCount=true;
						break;
					}
				}
				if(onesCount){
					primeCount++;
				}
			}
		}
		return primeCount;
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println(CountOneBit(input.nextInt(),input.nextInt()));
		input.close();

	}

}
