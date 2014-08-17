import java.io.PushbackInputStream;
import java.util.Stack;

public class Solution29 {

	/*题目：输入两个整数序列。其中一个序列表示栈的 push 顺序，
判断另一个序列有没有可能是对应的 pop 顺序。
为了简单起见，我们假设 push 序列的任意两个整数都是不相等的。 
比如输入的 push 序列是 1、2、3、4、5，那么 4、5、3、2、1 就有可能是一个 pop 系列。
因为可以有如下的 push 和 pop 序列：
push 1，push 2，push 3，push 4，pop，push 5，pop，pop，pop，pop，
这样得到的 pop 序列就是 4、5、3、2、1。
但序列 4、3、5、1、2 就不可能是 push 序列 1、2、3、4、5 的 pop 序列。
	 */


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] push = { 1, 2, 3, 4, 5 };
		int[] pop = { 4, 3, 5, 2, 1};
		
		verifyPopPush(push,pop);
	}

	public static void verifyPopPush(int[] push, int[] pop) {
		Stack<Integer> stack = new Stack<Integer>();
		int tagPush = 0;
		int tagPop = 0;
		
		stack.push(push[tagPush]);
		tagPush++;
		
		while(true){
			if(tagPush==push.length && tagPop==pop.length){
				System.out.println("RIGHT");
				return;
			}
			if(stack.peek() != pop[tagPop] && tagPush == push.length){
				System.out.println("WRONG");
				return;
			}
			if(stack.peek() == pop[tagPop]){
				stack.pop();
				tagPop++;
			}
			else{
				stack.push(push[tagPush]);
				tagPush++;
			}
		}

	}
}
