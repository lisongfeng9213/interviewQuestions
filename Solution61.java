import java.util.Vector;
class Pair{
	int x;
	int y;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		System.out.println("x:"+x+"\n"+"y:"+y);;
		return null;
	}
}

public class Solution61 {

	/**
	 * @param args
	 * �����������������м��㣻
	 * ��������������a = Ϊ������ͬ�������
	 * ����ͨ�����ֵ����������л��֡�������a�ĵ�һ����Ϊ0��������Ϊλ��λ����
	 * ���������ǽ��л��֣����԰�������ͬ�����ֻ��ֿ�����
	 */

	public static void main(String[] args) {
		int[]arr = {1,2,1,2,3,4,3,4,5,6,5,6,7,9};
		Pair pair = new Pair();
		findTwodistint(arr, pair).toString();
		
	}
	
	public static Pair findTwodistint(int[]arr,Pair pair){
		int a = 0;
		for (int i = 0;i< arr.length;i++){
			a = arr[i]^a;
		}
		System.out.println(a);
		int len = 0;
		while(a%2 != 1){
			len++;
			a = a>>1;
		}
		System.out.println(len);
		
		Vector<Integer> s1 = new Vector<Integer>();
		Vector<Integer> s2 = new Vector<Integer>();
		
		for(int i = 0;i<arr.length;i++){
			if((arr[i] >> len)%2 == 1){
				s1.add(arr[i]);
			}else{
				s2.add(arr[i]);
			}
		}
		
		int tempX = pair.x;
		int tempY = pair.y;
		
		for(Integer i:s1){
			tempX = tempX^i;
		}
		for(Integer i:s2){
			tempY = tempY^i;
		}
		pair.x = tempX;
		pair.y = tempY;
		
		return pair;
	}

}
