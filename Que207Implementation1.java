package LL;

import java.util.NoSuchElementException;

public class Que207Implementation1<E> {
	
	
	private MyListNode<E> head; 
	private MyListNode<E> tail; 
	
	/**
	 * A constructor for queue
	 */
	public Que207Implementation1() {
		head = null;
		tail = null;
	}
	
	private boolean isEmpty() {
		return head == null; 
	}

	/**
     * inserts the specified element e into this queue,
     * if it is possible to do so
     * @param e - the element to add
     * @returns true upon success
     * @throws NullPointerException if e is null
     */
	public boolean add(E e) {
		if(e != null) {
			MyListNode<E> temp = new MyListNode<E>(e);
			if (head == null) {
				head = temp;
				tail = temp; 
			}
			else {
				tail.setNext(temp);
				tail = temp; 
			}
		}
		else {
			throw new NullPointerException();
		}
		return true;
	}

	/**
     * retrieves and removes the head of this queue
     * 
     * @returns the value of the head of this queue
     * @throws NoSuchElementException  if this queue is empty
     */
	public E remove() throws NoSuchElementException {
		MyListNode<E> temp;
		if(isEmpty()) 
			throw new NoSuchElementException();
		else {
			temp = head;
			head = head.getNext(); 
			if(head == null) {
				tail = null;
			}
		}
		return temp.getVal();
	}
	

	/**
    * retrieves, but does not remove, the value of the head 
    * of this queue
    * @returns the value of head of this queue
    * @throws NoSuchElementException  if this queue is empty
    */
    
	public E element() throws NoSuchElementException {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		return head.getVal(); 
	}

	/** 
     * returns the number of elements in this queue
     */
	public int size() {
		int counter = 0;
		for(MyListNode<E> node = head; node!=null; node = node.getNext()) {
			counter++;
		}
		return counter;
	}
	/**
	 * print all elements in the queue
	 */
	public void print() {
		for (MyListNode<E> p = head; p != null; p = p.getNext()) {
			System.out.println(p.getVal());
		}
		
	}
	
	
	public static void main(String args[]) {
		//initializing a queue
		Que207Implementation1<Integer> test = new Que207Implementation1<Integer>();
		//adding elements: 
		test.add(3);
		test.add(4);
		test.add(5);
		test.add(-1);
		test.add(Integer.MAX_VALUE); 
		test.add(Integer.MIN_VALUE); 
		//printing the first element of the queue: 
		System.out.println("The first element of the queue: " +test.element());
		//print out all elements: 
		System.out.println("All elements in the queue: ");
		test.print();
		//print out the size of the current queue: 
		System.out.println("The size of the queue is " + test.size());
		//dequeue: 
		test.remove();
		//printing the first element of the queue: 
		System.out.println("The first element of the queue: " +test.element());
		System.out.println("The size of the queue is " + test.size());
		//print out all elements: 
				System.out.println("All elements in the queue: ");
		test.print();
		
		
	}
	
}
