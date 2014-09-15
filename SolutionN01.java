
import java.util.Arrays;

public class SolutionN01 {

	/*
	 * һ���������У�Ԫ��ȡֵ������ 0~65535 �е�����һ��������ͬ��ֵ�����ظ����֡�0 �����⣬���Է������֡�
	 * �����һ���㷨������Ӹ�����������ѡȡ5����ֵ���ж���5����ֵ�Ƿ��������ڡ� ע�⣺ - 5 ����ֵ����������ġ����磺8 7 5 0 6 - 0
	 * ����ͨ��������ֵ�����磺8 7 5 0 6 �е� 0 ����ͨ��� 9 ���� 4 - 0 ���Զ�γ��֡� - ���Ӷ������ O(n2)�򲻵÷�
	 */

	public static void main(String[] args) {
		int []a = {0,1,2,5};
		System.out.println(solution(a));

	}

	public static int solution(int[] a) {

		Arrays.sort(a);
		int numZero = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				numZero++;
			}
		}

		int len = a[a.length - 1] - a[numZero] - 1;
		int len2 = a.length - numZero - 2;

		if (len == numZero + len2) {
			return 1;
		} else {
			return 0;
		}

	}

}
