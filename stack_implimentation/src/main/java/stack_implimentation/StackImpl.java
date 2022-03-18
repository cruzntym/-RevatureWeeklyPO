package stack_implimentation;

	import java.util.EmptyStackException;
	import java.util.Stack;
	
public class StackImpl {

	/*
	 * Implement a stack that has the following methods:
• push ( v a 1 ) : push v a 1 onto the stack
• pop: pop off and return the topmost element of the stack. If there are no elements in the stack, throw an error.
• max: return the maximum value in the stack currently. If there are no elements in the stack, throw an error.
	 * 
	 * 
	 */
	


	
		
		public static void setUp(Stack<Object> stack ) {
			stack.push("v");
			stack.push("a");
			stack.push(1);
			System.out.println(stack);
		}
		
		public static void Pop(Stack<Object> stack) {
			try {
				if(stack == null) {
					throw new EmptyStackException();
				}
				else
					stack.pop();
			}catch(EmptyStackException e) {
				System.out.println("Stack is empty. Error thrown.");
			}
			
		}
		
		public static Object max(Stack<Object> stack) {
			try {
				Object x;
				if(stack == null) {
					throw new EmptyStackException();
				}
				else {
					return x = stack.peek();
				}
			}catch(EmptyStackException e) {
				System.out.println("Stack is empty. Error thrown.");
			}
			return null;
		}
		
		public static void main(String[] args) {
			Stack<Object> stack = new Stack<Object>();
			int i = 0;
			
			System.out.print("The initial Stack contents are: ");
			setUp(stack);
			i = stack.size();
			
			System.out.println(max(stack));
			
			for(int x = 0; x < i; x++) {
				Pop(stack);
				if(max(stack) == null) {
					break;
				}else {
					System.out.println(max(stack));
				}			
			}
			
			
		}

	}
