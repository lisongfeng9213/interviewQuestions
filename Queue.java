import javax.print.attribute.Size2DSyntax;


public class Queue<T> {
	
	int capacity = 20;
	private Object[] queue = new Object[capacity];
	int front = 0;
	int rear = 0;
	public int size = 0;
	public static void main(String args[]){
		Queue<String> queue = new Queue<String>();
		queue.add("SD");
		queue.add("SD");
		queue.add("SD");
		queue.add("SD");
		System.out.println(queue.pop()+"size"+queue.size);
		System.out.println(queue.pop()+ "size"+queue.size);
		System.out.println(queue.pop()+"size"+queue.size);
		System.out.println(queue.pop()+"size"+queue.size);
		System.out.println(queue.pop()+ "size"+queue.size);
		System.out.println(queue.pop()+"size"+queue.size);
		System.out.println(queue.pop()+"size"+queue.size);
		System.out.println(queue.pop()+ "size"+queue.size);
		System.out.println(queue.pop()+"size"+queue.size);
	}
	public boolean add(T elem){
		if((front + 1)%capacity == rear ){
			System.out.println("Queue is full");
			return false;
		}else{
			queue[front] = elem;
			front++;
			size = (front  - rear )%capacity;
			return true;
		}
	}
	public T pop(){
		if(front == rear){
			System.out.println("No element");
			return null;
		}else{
			T temp = (T) queue[rear];
			rear = (rear + 1)%capacity;
			size = (front  - rear )%capacity;
			return temp;			
		}
	}

}
