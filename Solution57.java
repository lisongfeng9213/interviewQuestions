import java.util.PriorityQueue;

public class Solution57 {

	/**
	 * 两个栈实现队列 两个队列实现栈
	 * 当每次直接插入stack1中
	 * 当删除时，如果stack2空，则直接把1中的元素倒过来放入其中即可，如果不空，可以直接删除stack2元素
	 */
	Stack<String> stack1 = new Stack<String>();// 入栈
	Stack<String> stack2 = new Stack<String>();// 出栈
	int size = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution57 queue = new Solution57();
		queue.add("SD1");
		queue.add("SD2");
		queue.add("SD3");
		queue.add("SD4");
		System.out.println(queue.pop()+"size"+queue.size);
		System.out.println(queue.pop()+ "size"+queue.size);
		System.out.println(queue.pop()+"size"+queue.size);
		System.out.println(queue.pop()+"size"+queue.size);
	
	}

	public boolean add(String elem) {
		if (stack1.add(elem)) {
			size++;
			return true;
		} else {
			System.out.println("ADD FALSE");
			return false;
		}
	}

	public String pop(){
		if(stack2.size == 0){
			while(stack1.size != 0){
				String temp = stack1.pop();
				stack2.add(temp);
			}
			return stack2.pop();
		}
		else {
			size --;
			return stack2.pop();
		}
		
	}
}
