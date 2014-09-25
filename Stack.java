import java.util.ArrayList;

import javax.lang.model.element.Element;




public class Stack<T> {

	/**
	 * @param args
	 */
	int capacity = 100;
	private Object[] stack = new Object[capacity];
	public int size = 0;
	public boolean add(T a){

		if(size >= capacity){
			System.out.println("stack is full");
			return false;
		}
		stack[size] = a;
		size++;
		return true;
		
	}
	public T pop(){
		if(size <=0 ){
			System.out.println("NO element");
			return null;
		}else{
			size--;
			return (T)stack[size];
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<String>();
		stack.add("SD");
		stack.add("SD");
		stack.add("SD");
		stack.add("SD");
		System.out.println(stack.pop()+"size"+stack.size);
		System.out.println(stack.pop()+ "size"+stack.size);
		System.out.println(stack.pop()+"size"+stack.size);
		System.out.println(stack.pop()+"size"+stack.size);

	}
	

}
