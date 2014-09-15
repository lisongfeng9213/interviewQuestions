import java.util.Arrays;


public class SolutionN02 {

	/**
	 * һ���������У�Ԫ��ȡֵ������ 1~N ��N ��һ���ϴ�����������е�����һ��������ͬ��ֵ�����ظ����֡�
���һ���㷨���ҳ������з������������Եĸ��������������������ĺ͵��� N+1��
���Ӷ������ O(n)������� O(n2)�򲻵÷�
	 * Another methods:
	 * ���԰����ǰ���n/2 ���л��֡�С�ڵĴ���һ�����ϣ����ڵĴ�����һ�����ϡ������Ļ��Ϳ��Խ����ж�
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,3,4,7,8,9,10}; 
		int n = 11;
		System.out.println(solutionN02(a,n));
	}
	
	public static int solutionN02(int []a,int sum){
		Arrays.sort(a);
		int[]b = new int[a.length];		
		for(int i = 0;i< a.length;i++){
			b[i] = sum - a[i];
		}
		
		int num = 0;
		
		int begin = 0,end = a.length - 1;
		
		while(begin < end){
			if(a[begin] == b[end]){
				num ++;
				begin++;
				end--;
				}
			else if(a[begin] > b[end]){
				end--;
			}else{
				begin++;
			}
		}
		return num;
	}

}
