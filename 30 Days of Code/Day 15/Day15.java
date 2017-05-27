import java.util.*;
public class Day15 {
	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	class Solution {
		public Node insert(Node head, int data) {
			if (head == null) head = new Node(data);
			else {
				Node curr = head;
				while (curr.next != null) curr = curr.next;
				curr.next = new Node(data);
			}
			return head;
		}

		public void display(Node head) {
			Node start = head;
			while (start != null) {
				System.out.print(start.data + " ");
				start = start.next;
			}
		}
	}
}
