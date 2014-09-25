
public class Solution66 {

	/**
	 * 66.颠倒栈（栈）。
     *题目：用递归颠倒一个栈。例如输入栈{1, 2, 3, 4, 5}，1 在栈顶。
     *颠倒之后的栈为{5, 4, 3, 2, 1}，5 处在栈顶。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<String>();
		stack.add("11");
		stack.add("22");
		stack.add("33");
		stack.add("44");
		stack.add("55");

		reverse(stack);
		while (stack.size != 0) {
			System.out.println(stack.pop());			
		}
		
	}
	public static void reverse(Stack<String> stack){
		if(stack.size != 0){
			String temp = stack.pop();
			reverse(stack);
			putToBottom(stack,temp);
		}
	}
	private static void putToBottom(Stack<String> stack, String temp) {
		
		String oString = null;
		if(stack.size == 0){
			stack.add(temp);
		}else{
			oString = stack.pop();
			putToBottom(stack, temp);
			stack.add(oString);
		}
		// TODO Auto-generated method stub
		
	}

}
