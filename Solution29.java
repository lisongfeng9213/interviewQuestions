import java.io.PushbackInputStream;
import java.util.Stack;

public class Solution29 {

	/*��Ŀ�����������������С�����һ�����б�ʾջ�� push ˳��
�ж���һ��������û�п����Ƕ�Ӧ�� pop ˳��
Ϊ�˼���������Ǽ��� push ���е����������������ǲ���ȵġ� 
��������� push ������ 1��2��3��4��5����ô 4��5��3��2��1 ���п�����һ�� pop ϵ�С�
��Ϊ���������µ� push �� pop ���У�
push 1��push 2��push 3��push 4��pop��push 5��pop��pop��pop��pop��
�����õ��� pop ���о��� 4��5��3��2��1��
������ 4��3��5��1��2 �Ͳ������� push ���� 1��2��3��4��5 �� pop ���С�
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
