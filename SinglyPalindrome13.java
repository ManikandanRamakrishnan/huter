package GUVI;

import java.util.Scanner;

public class SinglyPalindrome13 {
	static Node head=null;
	static class Node{
		char data;
		Node next;
	}
	Node add(char data){
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
			System.out.println(temp.data);
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
	boolean compare(Node head,Node reverse){
		while(head!=null){
			if(head.data!=reverse.data){
				return false;
			}
			head=head.next;
			reverse=reverse.next;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		SinglyPalindrome13 List=new SinglyPalindrome13();
		System.out.println("Enter number of characters");
		int n=input.nextInt();
		for(int i=0;i<n;i++){
			List.add(input.next().charAt(0));
		}
		//List.display(head);
	    Node reverse= List.reverse(head);
	    //List.display(reverse); 
	    if(List.compare(head,reverse)){
	    	System.out.println("Palindrome");
	    }
	    else{
	    	System.out.println("Not a Palindrome");

	    }
	    input.close();
	}

}
