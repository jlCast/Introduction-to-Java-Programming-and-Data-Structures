package chapter_10_programming_exercises;

public class TestQueue {

	public static void main(String[] args) {
		Queue queue1=new Queue();
		for(int i=0;i<20;i++)
			queue1.enqueue(i+1);
		while(!queue1.empty())
			System.out.println(queue1.dequeue());
	}
}
