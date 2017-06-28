package GUVI;

import java.util.Scanner;

public class MaximumSquareSubmatrix {
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	System.out.println("Enter Number of rows and columns");
		int rows=input.nextInt();
		int columns=input.nextInt();
		int[][] matrix=new int[rows][columns];
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				matrix[i][j]=input.nextInt();
			}
		}
		int onesCount=0;
		int max=0;
		for(int i=0;i<rows-1;i++){
			for(int j=0;j<columns-1;j++){
				int squarer=i+2;
				int squarec=j+2;
	    while(squarer<=rows&&squarec<=columns&&matrix[i][j]!=0){
	    	onesCount=0;
	    	boolean zeros=true;
		for(int m=i;m<squarer;m++){
			for(int n=j;n<squarec;n++){
				if(matrix[m][n]==1){
					onesCount++;
			}
				else{
					zeros=false;
				}
		}
		}
			if(zeros){
				if(onesCount>max){
					max=onesCount;
				}
			}
		squarer++;
		squarec++;
		}
	}
		}
		int k=max%2==0?max/2:max/2-1;
		for(int i=0;i<k;i++){
			for(int j=0;j<k;j++){
				System.out.print("1 ");
			}
			System.out.println();
		}
		if(max==0){
			System.out.println("No square found");
		}
		input.close();
	}				
				
			}
	
	

