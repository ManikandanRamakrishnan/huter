package workout;

import java.util.Scanner;

public class Flames {
	public static void main(String[] args){
		int count=0;
		String flame="flames";
		Scanner in = new Scanner(System.in);
		StringBuffer name1=new StringBuffer(in.next().toLowerCase());
		StringBuffer name2=new StringBuffer(in.next().toLowerCase());
		for(int i=0;i<name1.length();i++){
			for(int j=0;j<name2.length();j++){
				if(name1.charAt(i)==name2.charAt(j)){
					name1.deleteCharAt(i--);
					name2.deleteCharAt(j);
					break;
				}
			}
		}
		count=6//name1.length()+name2.length();
		int len=6;
		int count1=count;
		try{
		while(flame.length()!=1){
			if(count1>len){
				count=count1%len;
			
			}
			if(count==0){
				flame=flame.substring(0,len-1);
			}
			else{
			flame=flame.substring(count)+flame.substring(0,count-1);
			}
			len--;
		}
		}catch(Exception e){
			System.out.println(e);
		}
		switch(flame.charAt(0)){
		case 'f':
			System.out.println("Friends");
		    break;
		case 'l':
			System.out.println("Love");
		    break;
		case 'a':
			System.out.println("Affection");
		    break;
		case 'm':
			System.out.println("Marriage");
		    break;
		case 'e':
			System.out.println("Enemy");
		    break;
		case 's':
			System.out.println("Sister");
		    break;
		}
		in.close();
		}
}
