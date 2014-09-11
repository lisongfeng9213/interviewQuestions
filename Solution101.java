
public class Solution101 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int minMinus(int []a,int begin,int end){
		
		
		//方法4：遍历一遍数据，找出最大值Max和最小值Min，然后把整个数据进行划分，step=(Max-Min)/n.然后遍历这n个桶，相邻元素的最大值一定是某个桶i中的最大值和桶(i+1)中的最小值的差值。具体如何证明可以自己想想一下。

		//		(
		//		假如这个相邻元素的最大间距不是某个桶i中的最大值和桶(i+1)中的最小值的差值，即最大间距的两个元素位于同一个桶中，即最大间距小于step，所以Min+n*step<Maxd的。因此矛盾。所以最大元素肯定是位于不同桶中的。
		//		)
		return 0;
		
	}

}
