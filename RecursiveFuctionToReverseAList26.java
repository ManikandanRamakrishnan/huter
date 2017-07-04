package GUVI;

import java.util.Scanner;


public class RecursiveFuctionToReverseAList26 {
	static Node head=null;
	static class Node{
		int data;
		Node next;
	}
	Node add(int data){
		Node newNode=new Node();
		newNode.data=data;
		newNode.next=null;
		if(head==null){
			head=newNode;
		}
		else{
			Node temp=head;
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=newNode;
		}
		return head;
	}
	void display(Node head){
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		
	}
	Node reverse(Node head){
		Node newNode;
		if(head==null||head.next==null){
		return head;
		}
		else{
		newNode=reverse(head.next);
		head.next.next=head;
		head.next=null;
		}
		return newNode;	
	}


	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		RecursiveFuctionToReverseAList26 List=new RecursiveFuctionToReverseAList26();
		System.out.println("Enter number of characters");
		int n=input.nextInt();
		for(int i=0;i<n;i++){
			List.add(input.nextInt());
		} System.out.print("Original list :");
		List.display(head);
		System.out.println();
		System.out.print("Reversed list :");
	    Node reverse= List.reverse(head);
	    List.display(reverse); 
	    input.close();
	}


}
