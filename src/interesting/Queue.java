package interesting;

public class Queue {
	private int[] elements;
	private int size=0;
	private static int DEFAULT_CAPACITY=8;
	
	public Queue() {
		elements=new int[DEFAULT_CAPACITY];
	}
	public void enqueue(int value) {
		if(size>=elements.length) {
			int[]temp=new int[elements.length*2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements=temp;
		}
		elements[size]=value;
		size++;		
	}
	public int dequeue() {
		int firstValue=elements[0];
		int[]temp=new int[elements.length];
		System.arraycopy(elements, 1, temp, 0, elements.length-1);
		elements=temp;
		/*
		for(int i=0;i<size-1;i++)
			elements[i]=elements[i+1];
		*/
		size--;
		return firstValue;
	}
	public boolean empty() {
		return (size==0);	
	}
	public int getSize() {
		return size;
	}
}
