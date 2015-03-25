/**
 * @ClassName: Node
 * @Description: 在o(1)时间删除链表结点
 * @author: MeiXXD
 */
public class Node {
	private int value;
	private Node next;

	public Node(int value) {
		this.value = value;
		next = null;
	}

	/**
	 * @Title: deleteNode
	 * @Description: 受时间复杂度o(1)的限制，不能从头开始遍历。使用被删除结点的下一个节结点，巧妙结题
	 * @param head
	 * @param deleted
	 * @return: void
	 */
	public static void deleteNode(Node head, Node deleted) {
		if (head == null || deleted == null) {
			return;
		} else if (deleted.next != null) {
			Node temp = deleted.next;
			deleted.value = temp.value;
			deleted.next = temp.next;
		} else if (deleted.next == null) {
			Node temp = head;
			while (temp.next != deleted) {
				temp = temp.next;
			}
			temp.next = null;
		}
	}

	public static void main(String[] args) {
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		deleteNode(node1, node3);
		deleteNode(node1, node5);
	}
}
