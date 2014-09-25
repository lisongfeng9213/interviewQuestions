import java.util.Arrays;


public class Solution32 {

	/**
	 * http://blog.csdn.net/beiyeqingteng/article/details/6958320
	 * ����������a,b����С��Ϊn,����Ԫ�ص�ֵ��������������.
	//
	//Ҫ��ͨ������a,b�е�Ԫ�أ�ʹ[����aԪ�صĺ�]��[����bԪ�صĺ�]֮��Ĳ���С��
	//����:   
	//int[] a = {100,99,98,1,2, 3};
	//int[] b = {1, 2, 3, 4,5,40};
	 * ���˼·��ͨ������AB������Ԫ�أ�����ʹsum��A�� - sum(B)�ı�2|A[i] - B[j]|
	 * ����ʱ��sum��A�� - sum(B) = SUM��Ŀ����ʹSUM -> 0,
	 * ���������ǿ���ͨ���ҵ�������A[i] - B[j],SUM��С��
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int []a = {100,99,98,1,2,3};
		 int []b = {1,2,3,4,5,40};
		 smallMinus(a, b);
		 for(int i:a){
			 System.out.print("_"+i);
		 }
		 System.out.println();
		 for(int i:b){
			 System.out.print("_"+i);
		 }
		 System.out.println();

	}
	public static void smallMinus(int[]leftArr,int []rightArr){
		int sumLeft = 0;
		int sumRight = 0;
		
		sumLeft = sum(leftArr);
		sumRight = sum(rightArr);

		//���ܳ���diffΪ��ֵ��
		//�Ƿ����һ��ȫ�����ŵ㡣
		int diff = sumLeft - sumRight;
		boolean shiftTag = true;
		int length = leftArr.length;
		while(shiftTag && Math.abs(diff) > 0 ){
			shiftTag = false;
			int a = -1;
			int b = -1;
			int Maxminus = Math.abs(diff);
			/*�������飬�ҵ�i��j���������ϱߵ�������Ȼ��ı����飬�����µ�diff*/
			for(int i = 0;i < length; i++){
				for(int j = 0;j < length;j++){
					int newMinus = (diff - 2 * (leftArr[i] - rightArr[j]));
					if(Maxminus > Math.abs(newMinus) ){
						System.out.println("TRUE" + i +'_' + j);
						a = i;
						b = j;
						Maxminus = Math.abs(newMinus);
						shiftTag = true;
					}
				}
			}
			if(shiftTag == true){
				int temp = leftArr[a];
				leftArr[a]= rightArr[b];
				rightArr[b] = temp;
				diff = sum(leftArr) - sum(rightArr);
			}
			for(int i:leftArr){
				 System.out.print("_"+i);
			 }
			 System.out.println();
			 for(int i:rightArr){
				 System.out.print("_"+i);
			 }
			 System.out.println();
		}
		
		
	}
	public static int sum(int []a){
		int sum = 0;
		for(int i:a){
			sum += i;
		}
		return sum;
	}

}
