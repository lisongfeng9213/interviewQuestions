public class Solution62 {

	/**
	 * @param args
	 *�ҵ�����1,2 �ĳ��ȣ����ܹ��ҵ�ͬ���Ľڵ㣨���k��
	 *����ĳ�̽ڵ㿪ʼ���ܹ�ͬ�����ʵ�ĩ�ڵ㣩
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
		/* temp1����Ƚϳ����Ǹ� */
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
