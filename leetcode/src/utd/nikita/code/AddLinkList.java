package utd.nikita.code;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

public class AddLinkList {

	public ListNode addTwoNumbersCopy(ListNode l1, ListNode l2) {
		ListNode ln1 = l1, ln2 = l2, head = null, node = null;
		int carry = 0, remainder = 0, sum = 0;
		head = node = new ListNode(0);

		while (ln1 != null || ln2 != null || carry != 0) {
			sum = (ln1 != null ? ln1.val : 0) + (ln2 != null ? ln2.val : 0) + carry;
			carry = sum / 10;
			remainder = sum % 10;
			node = node.next = new ListNode(remainder);
			ln1 = (ln1 != null ? ln1.next : null);
			ln2 = (ln2 != null ? ln2.next : null);
		}
		return head.next;
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		ListNode l3 = new ListNode(0);
		ListNode head = l3;
		int carry = 0, remainder = 0, sum = 0;

		while (l1 != null || l2 != null) {
			if (l1 == null) {
				sum = l2.val;
				l2 = l2.next;
			} else if (l2 == null) {
				sum = l1.val;
				l1 = l1.next;
			} else {
				sum = l1.val + l2.val;
				l1 = l1.next;
				l2 = l2.next;
			}
			sum = sum + carry;
			carry = sum / 10;
			remainder = sum % 10;
			l3 = l3.next = new ListNode(remainder);
		}
		if (carry != 0) {
			l3 = l3.next = new ListNode(carry);
		}
		return head.next;
	}

	public static void main(String args[]) {
		ListNode l1 = new ListNode(0);
		ListNode l2 = new ListNode(0);
		l1.val = 5;
		l1.next = new ListNode(0);
		l1.next.val = 3;

		l2.val = 7;
		l2.next = new ListNode(0);
		l2.next.val = 6;

		AddLinkList a = new AddLinkList();
		a.addTwoNumbersCopy(l1, l2);
	}

}
