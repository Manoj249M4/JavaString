package com.java.datastructures;

public class Queue {

	private int arr[];
	private int front;
	private int rear;
	private int capacity;
	private int count;

	public static void main(String... args) {
		Queue q = new Queue(5);
		q.enqueue(1);
		q.enqueue(3);
		q.enqueue(5);
		q.enqueue(4);

		System.out.println("Front element is : " + q.peek());
		q.dequeue();
		System.out.println("Front element is : " + q.peek());
		System.out.println("Queue size is : " + q.size());
		q.dequeue();
		q.dequeue();

		if (q.isEmpty()) {
			System.out.println("Queue is empty!");
		} else {
			System.out.println("Queue is not empty!");
		}
	}

	public Queue(int size) {
		arr = new int[size];
		capacity = size;
		front = 0;
		rear = -1;
		count = 0;
	}

	public void enqueue(int item) {
		if (isFull()) {
			System.out.println("Overflow!");
			System.exit(1);
		}

		System.out.println("Inserting : " + item);
		rear = (rear + 1) % capacity;
		arr[rear] = item;
		count++;
	}

	public void dequeue() {
		if (isEmpty()) {
			System.out.println("Underflow!");
			System.exit(1);
		}
		System.out.println("Removing : " + arr[front]);
		front = (front + 1) % capacity;
		count--;
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Undeflow!");
			System.exit(1);
		}
		return arr[front];
	}

	public int size() {
		return count;
	}

	boolean isEmpty() {
		return (size() == 0);
	}

	public boolean isFull() {
		return (size() == capacity);
	}
}
