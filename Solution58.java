import javax.swing.RootPaneContainer;


public class Solution58 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1);
		root.add(new Node(2)).add(new Node(3)).add(new Node(4)).add(new Node(5));
		reversePrint(root);
	}
	
	public static void reversePrint(Node root){
		if(root == null){
			return ;
		}else {
			reversePrint(root.nextNode);
			System.out.println(root.data);
		}
	}

}
