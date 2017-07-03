package GUVI;


import java.util.Scanner;
public class RemoveDulpicate28 {
	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		for(int i=0;i<str.length();i++){
			boolean unique=true;
			for(int j=0;j<str.length();j++){
				if(i!=j){
					if(str.charAt(i)==str.charAt(j)){
						unique=false;	
					}
				}
			}
			if(unique){
				System.out.print(str.charAt(i));
			}
		}
		input.close();
	}

}
