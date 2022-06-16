package linkedList;

import org.w3c.dom.Node;

public class ElementInserting {
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
	
	//Insert a new node at front of the list
	public void push(int new_data) {
		Node new_node=new Node(new_data);
		Node temp=head;
		head=new_node;
		new_node.next=temp;
	}

	//Insert a node at the given previous node
	public void insertAfter(Node previous_node, int new_data) {
		if(previous_node==null) {
			System.out.println("Given previous element shoud not be exist");
			return;
		}
		Node new_node=new Node(new_data);
		new_node.next=previous_node.next;
		previous_node.next=new_node;
	}
	
	//Append new node at end of the list
	public void append(int new_data) {
		Node new_node=new Node(new_data);
		if(head==null) {
			head=new Node(new_data);
			return;
		}
		new_node.next=null;
		Node last=head;
		while(last!=null) {
			last=last.next;
		}
		last.next=new_node;
		return;
	}
	//Deleting node from listnode
	public void deleteNode(int key) {
		Node temp=head,prev=null;
		if(temp!=null && temp.data==key) {
			head=temp.next;
			return;
		}
		while(temp!=null && temp.data!=key) {
			prev=temp;
			temp=temp.next;
		}
		if(temp==null) {
			return;
		}
		prev.next=temp.next;
		
	}
	public void print() {
		Node n=head;
		while(n!=null) {
			System.out.print(n.data);
			n=n.next;
		}
	}
	
	public static void main(String args []) {
		ElementInserting eI=new ElementInserting();
		eI.append(6);
		//eI.print();
		eI.push(5);
	//	eI.print();
		eI.insertAfter(eI.head.next, 7);
		eI.push(1);
		eI.push(2);
		eI.push(3);
		eI.print();
		System.out.println("_______After deleting 1______________");
		eI.deleteNode(1);
		eI.print();
		
		
	}
}
