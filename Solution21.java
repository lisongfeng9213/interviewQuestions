/*������������  n  ��  m�������� 1��2��3.......n  ��  ����ȡ������,
ʹ��͵���  m ,Ҫ���������еĿ�������г���.*/
/*�õݹ�˼��:Ҫ���findSum(int m,int n,List<Integer> list)�����֣���һ�֣�findSum(m, n - 1, list)�ڶ��֣�findSum(m-n, n - 1, list2);*/
import java.util.ArrayList;
import java.util.List;


public class Solution21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		findSum(20, 8, list);
	}
	
	public static void findSum(int m,int n,List<Integer> list){
		if(m == 0){
			for(int i:list){
				System.out.print(i);
			}
			System.out.println();
			return;
		}
		
		if(n == 0|| m < 0){
			return;
		}
		
		findSum(m, n - 1, list);		
		
		List<Integer> list2 = new ArrayList<Integer>(list);
		list2.add(n);
		findSum(m-n, n - 1, list2);
	}

}
