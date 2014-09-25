import java.util.Arrays;


public class Solution32 {

	/**
	 * http://blog.csdn.net/beiyeqingteng/article/details/6958320
	 * 有两个序列a,b，大小都为n,序列元素的值任意整数，无序.
	//
	//要求：通过交换a,b中的元素，使[序列a元素的和]与[序列b元素的和]之间的差最小。
	//例如:   
	//int[] a = {100,99,98,1,2, 3};
	//int[] b = {1, 2, 3, 4,5,40};
	 * 求解思路：通过交换AB的两个元素，可以使sum（A） - sum(B)改变2|A[i] - B[j]|
	 * 而此时的sum（A） - sum(B) = SUM，目标是使SUM -> 0,
	 * 这样，我们可以通过找到这样的A[i] - B[j],SUM变小。
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

		//可能出现diff为负值。
		//是否出现一个全局最优点。
		int diff = sumLeft - sumRight;
		boolean shiftTag = true;
		int length = leftArr.length;
		while(shiftTag && Math.abs(diff) > 0 ){
			shiftTag = false;
			int a = -1;
			int b = -1;
			int Maxminus = Math.abs(diff);
			/*遍历数组，找到i，j，是满足上边的条件，然后改变数组，更新新的diff*/
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
