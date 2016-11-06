package utd.nikita.code;

public class LinkedList {

	public int length(ListNode l) {
		int length = 0;
		while (l != null) {
			length++;
			l = l.next;
		}
		return length;
	}

	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode start = new ListNode(0);
		ListNode slow = start, fast = start;
		slow.next = head;

		// Move fast in front so that the gap between slow and fast becomes n
		for (int i = 1; i <= n + 1; i++) {
			fast = fast.next;
		}
		// Move fast to the end, maintaining the gap
		while (fast != null) {
			slow = slow.next;
			fast = fast.next;
		}
		// Skip the desired node
		slow.next = slow.next.next;
		return start.next;
	}

	public static void main(String args[]) {
		ListNode l1 = new ListNode(0);
		l1.val = 5;

		LinkedList l = new LinkedList();
		l.removeNthFromEnd(l1, 1);

	}
}