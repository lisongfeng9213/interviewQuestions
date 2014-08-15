/*输入两个整数  n  和  m，从数列 1，2，3.......n  中  随意取几个数,
使其和等于  m ,要求将其中所有的可能组合列出来.*/
/*用递归思想:要求的findSum(int m,int n,List<Integer> list)分两种，第一种：findSum(m, n - 1, list)第二种：findSum(m-n, n - 1, list2);*/
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
