package test0615;
interface IStack{
	boolean isEmpty();
	boolean isFull();
	void push(char item);
	int pop();
	int peek();
	void clear();
}
public class StackArrayTest implements IStack{

	private int top;
	private	int stackSize;
	private char[] stackArray;
		
	public StackArrayTest(int stackSize){
		top=-1;
		this.stackSize = stackSize;
		stackArray = new char[this.stackSize];
	}
	
		
	
	

	@Override
	public boolean isEmpty() {
		return (top==-1);
	}

	@Override
	public boolean isFull() {
		return (top==this.stackSize-1);
	}

	@Override
	public void push(char item) {
		
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
	private void printStack() {
		
	}
	public static void main(String[] args) {
		int stackSize = 5;
		StackArrayTest arrStack= new StackArrayTest(stackSize);
	
		 arrStack.push('A');
	        arrStack.printStack();
	        
	        arrStack.push('B');
	        arrStack.printStack();
	        
	        arrStack.push('C');
	        arrStack.printStack();
	        
	        arrStack.peek();
	        arrStack.printStack();
	        
	        arrStack.pop();
	        arrStack.printStack();
	        
	        arrStack.pop();
	        arrStack.printStack();
	        
	        arrStack.peek();
	        arrStack.printStack();
	        
	        arrStack.clear();
	        arrStack.printStack();
	        
	        arrStack.isEmpty();
	}





}
