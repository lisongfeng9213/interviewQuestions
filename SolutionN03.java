import java.util.Vector;

public class SolutionN03 {

	/**
	 * : There is a binary tree of size N. All nodes are numbered between
	 * 1-N(inclusive). There is a N*N integer matrix Arr[N][N], all elements are
	 * initialized to zero. So for all the nodes A and B, put Arr[A][B] = 1 if A
	 * is an ancestor of B (NOT just the immediate ancestor).
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node node1 = new Node(1,null,null);
		Node node2 = new Node(1,null,null);
		Node node3 = new Node(1,null,null);
		Node node4 = new Node(1,null,null);
		Node node5 = new Node(1,null,null);
		Node node6 = new Node(1,null,null);
		Node rootaNode = new Node(1,null,null);

		int[][] matrix = new int[10][10];
		Vector<Integer> vector = new Vector<Integer>();
		vector.add(rootaNode.data);
		storeTree(rootaNode, matrix, vector);

	}

	public static void storeTree(Node root, int[][] matrix,
			Vector<Integer> vector) {//Vector:�Ѿ���������Ԫ�أ�����ӽڵ�A->B->C,Ҫ���AC = 1
		int a = root.data;
		Node leftNode = root.left;
		Node rightNode = root.right;
		if (leftNode != null) {
			matrix[a][leftNode.data] = 1;
			for(int i = 0;i<vector.size();i++){//��vector�Ѿ��е�Ԫ�ؾ��ı���
				int temp = vector.get(i);
				matrix[temp][leftNode.data] = 1;				
			}
			vector.add(leftNode.data);//��ΪҪ����left���ӽڵ㣬����Ҫ�ɵ�ǰ�ڵ����vector��
			storeTree(leftNode, matrix, vector);
			vector.removeElementAt(vector.size() - 1);//���ݹ���
		}
		if (rightNode != null) {
			matrix[a][rightNode.data] = 1;
			for(int i = 0;i<vector.size();i++){
				int temp = vector.get(i);
				matrix[temp][rightNode.data] = 1;				
			}
			vector.add(rightNode.data);
			storeTree(rightNode, matrix, vector);
			vector.removeElementAt(vector.size() - 1);
		}

	}
}
