import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

import javax.swing.RootPaneContainer;


public class Connect_nodes_at_same_level {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connect_nodes_at_same_level cn = new Connect_nodes_at_same_level();
		Node fNode = new Node('F',null,null);
		
		Node dNode = new Node('D',null,null);
		Node eNode = new Node('E',null,null);
		
		Node bNode = new Node('B',dNode,eNode);
		Node cNode = new Node('C',null,fNode);
		
		Node aNode = new Node('A',bNode,cNode);	

		
		cn.solution(aNode);
		Node node = dNode;
		while(node != null){			
			System.out.println(node.data);
			node = node.nextRight;
		}
		
	}

	public void solution(Node rootNode) {
		
		Vector<Node> vector = new Vector<Node>();
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(rootNode);
		while (true) {

			Node aNode = queue.poll();
			if(aNode.left != null){
				vector.add(aNode.left);
			}
			if(aNode.right != null){
				vector.add(aNode.right);
			}
			if (queue.size() == 0) {
				if(vector.size() == 0){
					break;
				}
				Node priNode = vector.get(0);
				queue.add(priNode);
				System.out.print(priNode.data);
				for (int i = 1; i < vector.size(); i++) {
					Node posNode = vector.get(i);
					queue.add(posNode);
					priNode.nextRight = posNode;
					priNode = posNode;
					
					System.out.print(posNode.data);
				}
				priNode.nextRight = null;

				vector.clear();
				System.out.println();

			}

		}

	}

	public static void preOrder() {

	}

}
