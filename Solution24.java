import java.lang.reflect.WildcardType;

import org.w3c.dom.ls.LSException;


public class Solution24 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr = {1,2,3,4,5,6,7,89};
		Node headNode = linkedList(arr);
		
		
		headNode = reverseNode(headNode);
		
		while(headNode != null){
			System.out.println(headNode.data);
			headNode = headNode.nextNode;
		}
	}
	
	public static Node reverseNode(Node head){
		
		Node newHead = head;
		while(newHead.nextNode != null){
			newHead = newHead.nextNode;
		}		
		while(head != newHead){
			Node tempNode;/*保存下一个节点*/
			tempNode = newHead.nextNode;
			newHead.nextNode = head;
			head = head.nextNode;
			newHead.nextNode.nextNode = tempNode;			
		}
		
		return newHead;
		
	}
	public static Node linkedList(int []arr){
		if(arr.length == 0){
			return null;
		}
		
		Node headNode = new Node(arr[0]);
		Node temp = headNode;
		for(int i = 1;i < arr.length;i++ ){
			Node nextNode = new Node(arr[i]);
			nextNode.nextNode = null;
			temp.nextNode = nextNode;
			temp = nextNode;
		}
		
		
		return headNode;
	}

}
