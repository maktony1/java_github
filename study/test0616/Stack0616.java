package test0616;

interface IStack0616{
	boolean isEmpty();
	boolean isFull();
	void push(int item);
	int pop();
	int peek();
	void clear();
}


public class Stack0616 implements IStack0616 {
	private int top;
	private int StackSize;
	private char[] StackArr;
	
	public Stack0616(int stackSize) {
		top=-1;
		
	}
	public static void main(String[] args) {
		
	}

	@Override
	public boolean isEmpty() {
		return (top==-1);
	}

	@Override
	public boolean isFull() {
		return (top==this.StackSize-1);
	}

	@Override
	public void push(int item) {
		
	}

	@Override
	public int pop() {
		return 0;
	}

	@Override
	public int peek() {
		return 0;
	}

	@Override
	public void clear() {
		
	}

}
