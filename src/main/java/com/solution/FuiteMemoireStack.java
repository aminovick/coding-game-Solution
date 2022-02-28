package com.solution;

import java.util.EmptyStackException;

public class FuiteMemoireStack {

	public static void main(String[] args) {
		
		
		Stack stack = new Stack(10000);
		
		for (int i = 0; i < 10000; i++) {
			stack.push("a large , large , large" + i);
			
		}
		
		for (int i = 0; i < 10000; i++) {
			System.out.println(stack.pop());
			
		}

	}
	
	public static class  Stack {
		
		
		private Object[] elements;
		private int size = 0;
		
		public Stack(int initialCapicity) {
			elements = new Object[initialCapicity];
		}
		
		public void push(Object object) {
			ensureCapacity();
			elements[size++]=object;
		}
		
		public Object pop() {
			if(size == 0)
			{
				throw new EmptyStackException();
			}
			// modification code pour liberer de la m�moire
			
			Object x = elements[-- size];
			elements[size]=null;
			
			return x;
		}

		private void ensureCapacity() {
			if(elements.length == size) {
				Object[] old = elements;
				elements = new Object[2 * size +1];
				System.arraycopy(old, 0, elements, 0, size);
			}
			
		}
		
		
		
	}


}
