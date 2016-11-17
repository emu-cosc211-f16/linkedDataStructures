import java.util.ArrayList;

public class LinkedList<T>{
	
	private class Node<T>{
		private T data;
		private Node<T> link;
		public Node(){
			data = null;
			link = null;
		}	
		public Node(T dataValue, Node<T> linkValue){
			data = dataValue;
			link = linkValue;
		}
	}
	private Node<T> head;
	public LinkedList(){
		head = null;
	}

	/**
	 * Adds a node to the start of the list with the specified data.
	 * @param data
	 */
	public void addToStart(T data){
		head = new Node<T>(data, head);
	}
	
	/**
	 * Removes the head node, and returns true if the list has at least
	 * one node. Returns false if the list is empty.
	 * @return boolean True if list not empty, false if list empty.
	 */
	public boolean deleteHeadNode(){
		if (head == null){
			return false;
		}else{
			head = head.link;
			return true;
		}
	}
	
	/**
	 * @return int representing the number of nodes in the list.
	 */
	public int size(){
		int count = 0;
		Node<T> position = head;
		while(position != null){
			count++;
			position = position.link;
		}
		return count;
	}
	
	/**
	 * @return true if list is empty, false otherwise
	 */
	public boolean isEmpty(){
		return (head==null);
	}
	
	public boolean contains(T data){
		return (find(data)!= null);
	}
	/**
	 * Finds and returns the node containing the target data.
	 * 
	 * @param target data to find within the list
	 * @return null if target does not exist, Node<T> containing the data 
	 *         otherwise
	 */
	private Node<T> find(T target){
		Node<T> position = head;
		while(position != null){
			if (position.data == target){
				return position;
			}
			position = position.link;
		}
		return null;
	}
	
	/*
	public T findData(T target){
		
	}
	*/
	public void clear(){
		this.head = null;
	}
	
}
