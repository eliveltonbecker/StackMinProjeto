 package br.univille.estd.stacks;

import br.univille.estd.stacks.comparables.Comparables;

public class StackMin<E> implements Stack<E> {

	
	protected AuxStack<E> auxStack = new AuxStack<E>();
	protected Comparables<E> _comparable;
	protected int capacity;
	public static final int CAPACITY = 1000;
	protected E S[];
	protected int top = -1;
	
	public StackMin(Comparables<E> comparable) {
		this(CAPACITY, comparable);
		_comparable = comparable;
	}
	public StackMin(int capacity, Comparables<E> comparable) {
		this.capacity = capacity;
		S = (E[])new Object[this.capacity];
		_comparable = comparable;
	}

	
	@Override
	public int size() {
		return top+1;
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
			throw new FullStackException("A pilha est� cheia");
		}
		top = top + 1;
		S[top] = element;
			
			
			if( auxStack.isEmpty()  == false && _comparable.compare(element, auxStack.top()) > 0 ) {
				auxStack.push(auxStack.top());
			}else {
				auxStack.push(element);
			}
		
	}

	@Override
	public E pop() throws EmptyStackException {
		if(isEmpty()) {
			throw new EmptyStackException("A pilha est� vazia");
		}
		
		E element = S[top];
		top = top -1;
		auxStack.pop();
		return element;
	}

	@Override
	public E min() throws EmptyStackException {
		if(isEmpty()) {
			throw new EmptyStackException("A pilha est� vazia");
		}
		else {
			return auxStack.top();
		}
	}

}
