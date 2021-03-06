package chapter1.ararys.strings;

class Index {
	public int value = 0;
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

public class LinkedListOperations {
	public ListNode KthToLAst(ListNode head, int k) {
		Index id = new Index();
		return KthToLAst(head, k, id);
	}

	public ListNode KthToLAst(ListNode head, int k, Index id) {

		if (head == null)
			return null;

		ListNode node = KthToLAst(head.next, k, id);
		id.value += 1;
		if (id.value == k) {
			return head;
		}

		return node;
	}

	public ListNode reverse(ListNode n) {
		ListNode head = null;

		while (n != null) {
			ListNode node = new ListNode(n.val);
			node.next = head;
			head = node;
			n = n.next;
		}
		return head;
	}
}
