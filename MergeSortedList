/**
 * @ClassName: MergeSortedList
 * @Description: 合并有序链表
 * @author: MeiXXD
 */
public class MergeSortedList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node node1 = new Node(1);
		Node node3 = new Node(3);
		Node node5 = new Node(5);
		Node node7 = new Node(7);
		Node node9 = new Node(9);
		node1.next = node3;
		node3.next = node5;
		node5.next = node7;
		node7.next = node9;

		Node node2 = new Node(2);
		Node node4 = new Node(4);
		Node node6 = new Node(6);
		Node node8 = new Node(8);
		Node node10 = new Node(10);
		node2.next = node4;
		node4.next = node6;
		node6.next = node8;
		node8.next = node10;

		Node head = Node.Merge(node1, node2);
		while (head != null) {
			System.out.print(head.value + " ");
			head = head.next;
		}
	}
}

class Node {
	int value;
	Node next;

	public Node(int value) {
		this.value = value;
		next = null;
	}

	/**
	 * @Title: Merge
	 * @Description: 递归实现合并
	 * @param head1
	 * @param head2
	 * @return
	 * @return: Node
	 */
	public static Node Merge(Node head1, Node head2) {
		Node head = null;
		if (head1 == null) {
			return head2;
		}
		if (head2 == null) {
			return head1;
		}
		if (head1.value < head2.value) {
			head = head1;
			head.next = Merge(head1.next, head2);
		} else {
			head = head2;
			head.next = Merge(head1, head2.next);
		}
		return head;
	}
}
