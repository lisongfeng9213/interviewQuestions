public class Solution62 {

	/**
	 * @param args
	 *找到链表1,2 的长度，就能够找到同步的节点（相差k）
	 *（从某刻节点开始，能够同步访问到末节点）
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static Node findSection(Node head1, Node head2) {
		int len1 = 0;
		int len2 = 0;
		Node temp1 = head1;
		Node temp2 = head2;
		while (head1 != null) {
			len1++;
			temp1 = temp1.nextNode;
		}
		while (head2 != null) {
			len1++;
			temp2 = temp2.nextNode;
		}
		/* temp1代表比较长的那个 */
		if (len1 <= len2) {
			Node tempNode = null;
			tempNode = temp1;
			temp1 = temp2;
			temp2 = tempNode;
		}

		int k = len1 - len2;
		while (k > 0) {
			temp1 = temp1.nextNode;
			k--;
		}
		
		while(temp1 != null){
			if(temp1.hashCode() == temp2.hashCode()){
				return temp1;
			}else {
				temp1 = temp1.nextNode;
				temp2 = temp2.nextNode;
			}
		}

		return temp1;

	}

}
