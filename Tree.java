import java.util.Stack;


public class Tree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node rootNode = new Node(1);
		Node b = new Node(2);
		rootNode.left  = b;
		Node c = new Node(3);
		rootNode.right = c;
		b.left = new Node(4);
		b.right = new Node(5);
		
		c.left = new Node(6);
		postOrder(rootNode);
		
	}
	
	static void postOrder(Node root){
		Stack<Node> sTravel = new Stack<Node>();
		Stack<Node> sVisit  = new Stack<Node>();
		
		sTravel.push(root);
		while (!sTravel.empty()) {
			Node pNode = sTravel.pop();
			sVisit.push(pNode);
			if(pNode.left != null){
				sTravel.push(pNode.left);
			}
			if(pNode.right != null){
				sTravel.push(pNode.right);
			}			
			
		}
		
		while (!sVisit.empty()) {
			System.out.println(sVisit.pop().data);
			
		}
		
	}

}
