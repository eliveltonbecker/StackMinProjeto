 package br.univille.estd.stacks;

public class StackMin<E> implements Stack<E> {
	
	protected int capacity;
	public static final int CAPACITY = 1000;
	protected E S[];
	protected int top = -1;
	public StackMin() {
		this(CAPACITY);
	}
	public StackMin(int capacity) {
		this.capacity = capacity;
		S = (E[])new Object[this.capacity];
	}

	
	@Override
	public int size() {
		return top-1;
	}

	@Override
	public boolean isEmpty() {
		return top < 0;
	}

	@Override
	public E top() throws EmptyStackException {
		if(isEmpty()) {
			throw new EmptyStackException(null);
		}
		return S[top];
	}

	@Override
	public void push(E element) {
		if(size() == capacity) {
			throw new FullStackException("A pilha está cheia");
		}
		top = top + 1;
		S[top] = element;
	}

	@Override
	public E pop() throws EmptyStackException {
		if(isEmpty()) {
			throw new EmptyStackException("A pilha está vazia");
		}
		E element = S[top];
		top = top -1;
		return element;
	}

	@Override
	public E min() throws EmptyStackException {
		// TODO Auto-generated method stub
		return null;
	}

}
