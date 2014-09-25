import java.util.PriorityQueue;

public class Solution57 {

	/**
	 * ����ջʵ�ֶ��� ��������ʵ��ջ
	 * ��ÿ��ֱ�Ӳ���stack1��
	 * ��ɾ��ʱ�����stack2�գ���ֱ�Ӱ�1�е�Ԫ�ص������������м��ɣ�������գ�����ֱ��ɾ��stack2Ԫ��
	 */
	Stack<String> stack1 = new Stack<String>();// ��ջ
	Stack<String> stack2 = new Stack<String>();// ��ջ
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
