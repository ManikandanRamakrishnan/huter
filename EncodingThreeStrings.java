package Logical;

public class EncodingThreeStrings {
	public static String output1;
	public static String output2;
	public static String output3;
	public static void main(String [] args) {
		encodeThreeStrings("john", "Johny", "Janardhan");
		System.out.println(output1);
		System.out.println(output2);
		System.out.println(output3);
	}
	 public static void encodeThreeStrings(String input1, String input2, String input3) {
	String[] str=new String[3];
	str[0]=input1;
	str[1]=input2;
	str[2]=input3;
	String[] front=new String[3];
	String[] middle=new String[3];
	String[] end=new String[3];
	for(int i=0;i<3;i++){
		int len=str[i].length();
		int len1=len/3;
		if(len%3==0){
			front[i]=str[i].substring(0,len1);
			middle[i]=str[i].substring(len1,2*len1);
			end[i]=str[i].substring(2*len1,len1*3);	
		}
        if(len%3==1){
        	front[i]=str[i].substring(0,len1);
			middle[i]=str[i].substring(len1,2*len1+1);
			end[i]=str[i].substring(len-len1,len);	
			
		}
        if(len%3==2){
        	front[i]=str[i].substring(0,len1+1);
			middle[i]=str[i].substring(len1+1,2*len1+1);
			end[i]=str[i].substring(len-len1-1,len);	
		}
		
	}
	output1=""+front[0]+middle[1]+end[2];
	output2=""+middle[0]+end[1]+front[2]; 
	output3 =""+end[0]+front[1]+middle[2]; 
	String answer="";
	for(int i=0;i<output3.length();i++){
		if(Character.isUpperCase(output3.charAt(i))){
			answer+=Character.toLowerCase(output3.charAt(i));
		}
		else{
			answer+=Character.toUpperCase(output3.charAt(i));
		}
	}
	output3=answer;
	}

}
