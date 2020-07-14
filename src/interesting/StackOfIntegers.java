package interesting;

public class StackOfIntegers {
	private int[] elements;
	private int size=0;//number of integers in the stack
	public static final int DEFAULT_CAPACITY=16;
	
	public StackOfIntegers() {	
		this(DEFAULT_CAPACITY);
	}
	public StackOfIntegers(int capacity) {	
		elements=new int[capacity];
	}

	public void push(int value) {//Stores an integer into the top of the stack
		if(size>=elements.length) {//Se redimensiona el array en el caso de que se llegue a su capacidad máxima
			int[] temp=new int[elements.length*2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements=temp;
		}
		elements[size++]=value;//Primero asigna y a continuación incrementa
	}
	public int pop() {
		return elements[--size];
	}
	
	public int peek() {//Return the top element from the stack
		return elements[size-1];
	}	
	public boolean empty() {//Return true if stack is empty
		return size==0;
	}
	public int getSize() {//Return the number of elements in the stack
		return size;		
	}
}
