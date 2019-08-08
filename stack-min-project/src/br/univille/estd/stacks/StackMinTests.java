package br.univille.estd.stacks;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import br.univille.estd.stacks.StackMin;

public class StackMinTests {
	
	@Test
	public void isEmpty() {
		Stack<Integer> stack = new StackMin<Integer>();
		assertEquals("A pilha deve estar vazia",true,stack.isEmpty());
	}
	
	@Test
	public void size() {
		Stack<Integer> stack = new StackMin<Integer>();
		assertEquals("O tamanho da pilha deve ser zero",0,stack.size());
	}
	
	@Test
	public void push() {
		Stack<Integer> stack = new StackMin<Integer>();
		stack.push(10);
		assertEquals("Pilha deve conter um elemento",1,stack.size());
	}
	
	@Test
	public void top() {
		Stack<Integer> stack = new StackMin<Integer>();
		stack.push(10);
		stack.push(15);
		assertEquals("Top deve retornar o elemento 15",15,(int)stack.top());
	}
	
	@Test
	public void pop() {
		Stack<Integer> stack = new StackMin<Integer>();
		stack.push(10);
		stack.push(15);
		assertEquals("Top deve retornar o elemento 15",15,(int)stack.pop());
		assertEquals("Pilha deve conter um elemento",1,stack.size());
	}
	
	@Test
	public void popThrowsException() {
		Stack<Integer> stack = new StackMin<Integer>();
		try {
			stack.pop();
			fail("Pilha deve gerar exceçao EmptyStackException");
		}catch(Exception ignored) {
		}
	}
	
	@Test
	public void topThrowsException() {
		Stack<Integer> stack = new StackMin<Integer>();
		try {
			stack.top();
			fail("Pilha deve gerar exceçao EmptyStackException");
		}catch(Exception ignored) {
		}
	}
	
	@Test
	public void min() {
		Stack<Integer> stack = new StackMin<Integer>();
		
		stack.push(20);
		stack.push(52);
		stack.push(85);
		stack.push(1);
		stack.push(10);
		stack.push(18);
		stack.push(30);
		stack.push(12);
		stack.push(11);
		stack.push(3);
		
		assertEquals("O menor elemento da lista deve ser 1",1,(int) stack.min());
	}
	
	@Test
	public void minThrowsException() {
		Stack<Integer> stack = new StackMin<Integer>();
		try {
			stack.min();
			fail("Pilha deve gerar exceção EmptyStackException");
		}catch(Exception ignored) {
		}
	}
	
	@Test
	public void minAnt() {
		Stack<Integer> stack = new StackMin<Integer>();
		
		stack.push(20);
		stack.push(52);
		stack.push(85);
		stack.push(1);
		stack.push(8);
		stack.push(18);
		stack.push(30);
		stack.push(12);
		stack.push(11);
		stack.push(3);
		
		assertEquals("O menor elemento da lista deve ser 1",1,(int) stack.min());
		stack.pop();
		assertEquals("O menor elemento da lista deve ser 3",3,(int) stack.min());
		stack.pop();
		assertEquals("O menor elemento da lista deve ser 8",8,(int) stack.min());
	}
	

}
