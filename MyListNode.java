package LL;


public class MyListNode<E> {
	private E val; 
	private MyListNode<E>  next; 
	
	public MyListNode(E val) {
		this.val = val; 
		next = null;
	}
	public MyListNode(E val, MyListNode<E>  node) {
		this.val = val;
		next = node;
	}
	
	public MyListNode<E> getNext() {
		return next;
	}
	public E getVal() {
		return val;
	}
	public void setNext(MyListNode<E>  node) {
		next = node;
	}
	public void setVal(E val) {
		this.val = val;
	}
	public String toString() {
		return val.toString();
	}
	
}
