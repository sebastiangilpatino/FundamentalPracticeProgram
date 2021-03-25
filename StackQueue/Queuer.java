package StackQueue;

import java.util.Iterator;
import java.util.LinkedList;

public class Queuer {

	public static void main(String[] args) {
		LinkedList<Integer> stack = new LinkedList<Integer>();
		LinkedList<Integer> queue = new LinkedList<Integer>();

		// fulfill the stack randomly
		for (int i = 0; i < 10; i++) {
			stack.push(i);
		}

		System.out.println("Stack: " + stack.toString());

		// fulfill the queue randomly
		for (int i = 20; i <= 30; i++) {
			queue.add(i);
		}

		System.out.println("Queue: " + queue.toString());

		System.out.println("stack2QueueIterator " + stack2QueueIterator(stack).toString()); // this first
		// System.out.println("stack2QueueIsEmpty " +
		// stack2QueueIsEmpty(stack).toString()); // this empty the stack
		System.out.println("queue2StackIterator " + queue2StackIterator(queue).toString()); // this first
		// System.out.println("queue2StackIsEmpty " +
		// queue2StackIsEmpty(queue).toString()); // this empty the stack
		System.out.println("stackEmpty2Stack " + stackEmpty2Stack(stack).toString()); // this first

	}

	public static LinkedList<Integer> stack2QueueIterator(LinkedList<Integer> stack) {
		LinkedList<Integer> queue = new LinkedList<Integer>();
		Iterator it = stack.iterator();
		while (it.hasNext()) {
			queue.add((Integer) it.next());
		}

		return queue;
	}

	public static LinkedList<Integer> stack2QueueIsEmpty(LinkedList<Integer> stack) {
		LinkedList<Integer> queue = new LinkedList<Integer>();
		while (stack.isEmpty() == false) {
			queue.add(stack.pop());
		}

		return queue;
	}

	public static LinkedList<Integer> queue2StackIterator(LinkedList<Integer> queue) {
		LinkedList<Integer> stack = new LinkedList<Integer>();

		Iterator it = queue.iterator();
		while (it.hasNext()) {
			stack.push((Integer) it.next());
		}

		return stack;
	}

	public static LinkedList<Integer> queue2StackIsEmpty(LinkedList<Integer> queue) {
		LinkedList<Integer> stack = new LinkedList<Integer>();
		while (queue.isEmpty() == false) {
			stack.push(queue.remove());
		}

		return stack;
	}

	public static LinkedList<Integer> stackEmpty2Stack(LinkedList<Integer> stack) {
		LinkedList<Integer> stackReturn = new LinkedList<Integer>();

		for (int i = 10; i < 120; i += 10) {
			stackReturn.push(i);
		} // fulfill randomly the stack

		System.out.println("Original: " + stackReturn.toString());

		LinkedList<Integer> temp = new LinkedList<Integer>();
		Iterator<Integer> stackIterator = stack.iterator();

		while (stackIterator.hasNext()) {
			temp.push(stackIterator.next());
		}

		while (temp.isEmpty() == false) {
			stackReturn.push(temp.pop());
		}

		return stackReturn;// return both the stack
	}

}
