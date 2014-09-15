class Solution13{
	public static void  main(String[] args) {
		ListNode a = new ListNode(5,null);
		ListNode b = new ListNode(4,a);
		ListNode c = new ListNode(3,b);
		ListNode d = new ListNode(2,c);
		ListNode e = new ListNode(1,d);
		System.out.println(findKthNode(e,1).value);
		
	}

	public static ListNode findKthNode(ListNode head,int k){
		ListNode next = head;
		ListNode reNode = head;
		int len = 1;/*≥ı º≥§∂»*/
		while(next!= null){
			len++;
			next = next.next;
		}
		if(len < k){
			return null;
		}else{
			for(int i = 0;i < len - k -1;i++){
				reNode = reNode.next;
			}
		}
		return reNode;

	}


	static class ListNode{
		int value;
		ListNode next;
		ListNode(int value1,ListNode next1){
			this.value = value1;
			this.next = next1;
		}

	}
}