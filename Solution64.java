public class Solution64 {

	/**
	 * 64. Ѱ�ҳ��������㣩�� ��Ŀ�����ǰ�ֻ�������� 2��3 �� 5 ��������������Ugly Number�������� 6��8 ���ǳ����� �� 14
	 * ���ǣ���Ϊ���������� 7��ϰ�������ǰ� 1 �����ǵ�һ�������� �󰴴�С�����˳��ĵ� 1500 ��������
	 * ����������һ���������Ϲ�Ϊ�����������⣬��˵ google �������ù�����⡣
	 * 
	 * ֻ���ܴ��Ѿ���������Ľ��г˻����õ�������մ�����֪������һ����
	 * ����Ĺ����л��洢�˳˻��Ŀ�ʼ�ڵ㣬�����Ͳ��ôӵ�һλ��ʼ�Ƚ��ˡ�
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a = uglyNum(1300);
		for(int i:a){
			System.out.println(i);
		}
	}

	public static int[] uglyNum(int num) {
		int[] arr = new int[num];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 5;

		int begin2 = 0;//�洢�˻���ʼ
		int begin3 = 0;
		int begin5 = 0;

		int end = 3;

		int num2 = 0;//�洢��֮�����
		int num3 = 0;
		int num5 = 0;
		while (arr[end] * 2 <= num) {
			for (int i = begin2; i < num; i++) {
				if (arr[i] * 2 > arr[end]) {
					begin2 = i;
					num2 = arr[i] * 2;
					break;
				}
			}

			for (int i = begin3; i < num; i++) {
				if (arr[i] * 3 > arr[end]) {
					begin3 = i;
					num3 = arr[i] * 3;
					break;
				}
			}

			for (int i = begin5; i < num; i++) {
				if (arr[i] * 5 > arr[end]) {
					begin5 = i;
					num5 = arr[i] * 5;
					break;
				}
			}
			int min = Math.min(Math.min(num2, num3), num5);
			if(num2 == min){
				begin2++;
				end++;
				arr[end] = num2;
			}else if(num3 == min){
				begin3++;
				end++;
				arr[end] = num3;
			}else if(num5 == min){
				begin5++;
				end++;
				arr[end] = num5;
			}
			
		}

		return arr;
	}

}
