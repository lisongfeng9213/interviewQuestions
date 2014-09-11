import java.util.Stack;
import java.util.Vector;


public class Solution103 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char[] lisognfeng = {'l','i','s','o',};
		Stack<String> stack = new Stack<String>();
 		printChars(lisognfeng,stack);

	}
	public static void printChars(char[] charArray,Stack<String> vChar){
		
		if(charArray.length == 1){
			for(int i = 0;i<vChar.size();i++){
				System.out.print(vChar.get(i));
			}
			System.out.print(charArray[0]);
			System.out.println();
		}else {
			for(int i = 0;i<charArray.length;i++){
				vChar.add((charArray[i] + "_"));
				char[] temp = new char[charArray.length - 1];
				int tag = 0;
				for(int j = 0;j<charArray.length;j++){
					if(i != j){
						temp[tag] = charArray[j];
						tag++;
					}
					
				}				
				printChars(temp,vChar);
				vChar.pop();
				
			}
		}

	}

}
