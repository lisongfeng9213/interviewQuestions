public class Solution28 {

	/**
	 *��Ŀ������һ����������������Ķ����Ʊ�����ж��ٸ� 1��
         *�������� 10������������Ʊ�ʾΪ 1010�������� 1��������
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numberOfInt(3));
	}

	public static int numberOfInt(int n) {
		int num = 0;
		while (n != 0){
			if(n%2 == 1){
				num++;
			}
			n = n/2;			
			
		}
		return num;

	}

}
