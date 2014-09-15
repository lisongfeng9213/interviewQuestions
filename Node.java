
public class Node {
	int data;
	Node left;
	Node right;
	Node nextRight;
	Node(){
		
	}
	Node(int value,Node leNode,Node riNode){
		this.data = value;
		left = leNode;
		right = riNode;
	}
}
