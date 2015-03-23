/**
 * @ClassName: MyQueue
 * @Description: 通过两个栈来实现队列
 * @author: MeiXXD
 */
public class MyQueue {
	private Stack<Integer> stack1;
	private Stack<Integer> stack2;

	public MyQueue() {
		stack1 = new Stack<Integer>();
		stack2 = new Stack<Integer>();
	}

	public static void main(String[] args) {
		MyQueue myQueue = new MyQueue();
		myQueue.appendTail(1);
		myQueue.appendTail(2);
		myQueue.appendTail(3);
		myQueue.appendTail(4);
		myQueue.appendTail(5);
		System.out.print(myQueue.deleteHead() + " ");
		System.out.print(myQueue.deleteHead() + " ");
		System.out.print(myQueue.deleteHead() + " ");
		myQueue.appendTail(6);
		System.out.print(myQueue.deleteHead() + " ");
		System.out.print(myQueue.deleteHead() + " ");
		System.out.print(myQueue.deleteHead() + " ");
		myQueue.appendTail(7);
		System.out.print(myQueue.deleteHead() + " ");
	}

	/**
	 * @Title: deleteHead
	 * @Description: 出
	 * @return
	 * @return: int
	 */
	public int deleteHead() {
		if (stack2.size() <= 0) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		if (stack2.isEmpty()) {
			System.out.println("队列已为空");
		}
		int result = stack2.pop();
		return result;
	}

	/**
	 * @Title: appendTail
	 * @Description: 进
	 * @param a
	 * @return: void
	 */
	public void appendTail(int a) {
		stack1.push((Integer) a);
	}
}
