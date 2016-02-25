/**
 * @ClassName: Node
 * @Description: 链表类
 * @author: MeiXXD
 */
class Node {
	int value;
	Node next;

	public Node(int value) {
		this.value = value;
	}

	/**
	 * @Title: ResverseUseStack
	 * @Description: 使用栈倒序输出
	 * @param head
	 * @return: void
	 */
	public static void ResverseUseStack(Node head) {
		Stack<Node> stack = new Stack<>();
		Node node = null;
		while (head != null) {
			stack.push(head);
			head = head.next;
		}
		System.out.print("使用栈实现链表倒序，结果为：");
		while (!stack.isEmpty()) {
			node = stack.pop();
			System.out.print(node.value + " ");
		}
	}

	/**
	 * @Title: ResverseUseRecursion
	 * @Description: 使用递归倒序输出
	 * @param head
	 * @return: void
	 */
	public static void ResverseUseRecursion(Node head) {
		if (head != null) {
			if (head.next != null) {
				ResverseUseRecursion(head.next);
			}
		}
		System.out.print(head.value + " ");
	}
	
	/**
	 * @Title: ResverseLinkedList
	 * @Description: 反转链表，并返回链表头
	 * @param head
	 * @return
	 * @return: Node
	 */
	public static Node ResverseLinkedList(Node head) {
		Node resversedHeadNode = null;
		Node pre = null;
		Node node = head;
		Node next = null;
		while (node != null) {
			next = node.next;
			if (next == null) {
				resversedHeadNode = node;
			}
			node.next = pre;
			pre = node;
			node = next;
		}
		return resversedHeadNode;
	}
}