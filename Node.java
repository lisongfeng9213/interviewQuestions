
public class Node {
	int data;
	Node left;
	Node right;
	Node nextRight;
	Node nextNode;
	Node(){
		
	}
	Node(int value,Node leNode,Node riNode){
		this.data = value;
		left = leNode;
		right = riNode;
	}
	Node(int a){
		data = a;
	}
	Node add(Node b){
		this.nextNode = b;
		b.nextNode = null;
		return b;		
	}
	
}
