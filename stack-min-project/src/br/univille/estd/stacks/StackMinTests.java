package br.univille.estd.stacks;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import br.univille.estd.stacks.StackMin;
import br.univille.estd.stacks.comparables.Comparables;
import br.univille.estd.stacks.comparables.NumberComparable;

public class StackMinTests {
	
	Comparables<Integer> comparable = new NumberComparable();
	@Test
	public void isEmpty() {
		Stack<Integer> stack = new StackMin<Integer>(comparable);
		assertEquals("A pilha deve estar vazia",true,stack.isEmpty());
	}
	
	@Test
	public void size() {
		Stack<Integer> stack = new StackMin<Integer>(comparable);
		assertEquals("O tamanho da pilha deve ser zero",0,stack.size());
	}
	
	@Test
	public void push() {
		Stack<Integer> stack = new StackMin<Integer>(comparable);
		stack.push(10);
		assertEquals("Pilha deve conter um elemento",1,stack.size());
	}
	
	@Test
	public void top() {
		Stack<Integer> stack = new StackMin<Integer>(comparable);
		stack.push(10);
		stack.push(15);
		assertEquals("Top deve retornar o elemento 15",15,(int)stack.top());
	}
	
	@Test
	public void pop() {
		Stack<Integer> stack = new StackMin<Integer>(comparable);
		stack.push(10);
		stack.push(15);
		assertEquals("Top deve retornar o elemento 15",15,(int)stack.pop());
		assertEquals("Pilha deve conter um elemento",1,stack.size());
	}
	
	@Test
	public void popThrowsException() {
		Stack<Integer> stack = new StackMin<Integer>(comparable);
		try {
			stack.pop();
			fail("Pilha deve gerar exceçao EmptyStackException");
		}catch(Exception ignored) {
		}
	}
	
	@Test
	public void topThrowsException() {
		Stack<Integer> stack = new StackMin<Integer>(comparable);
		try {
			stack.top();
			fail("Pilha deve gerar exceçao EmptyStackException");
		}catch(Exception ignored) {
		}
	}
	
	@Test
	public void min() {
		Stack<Integer> stack = new StackMin<Integer>(comparable);
		stack.push(10);
		stack.pop();
		stack.push(15);
		stack.push(8);
		stack.pop();
		stack.push(30);
		stack.push(50);
		assertEquals("Top deve retornar o elemento 15",15,(int)stack.min());
	}

}
