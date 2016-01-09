/**
 * @ClassName: MyStack
 * @Description: 通过两个队列实现栈
 * @author: MeiXXD
 */
public class MyStack {
	Queue<Integer> queue1;
	Queue<Integer> queue2;

	public MyStack() {
		queue1 = new LinkedList<Integer>();
		queue2 = new LinkedList<Integer>();
	}

	public static void main(String[] args) {
		MyStack myStack = new MyStack();
		myStack.push(1);
		myStack.push(2);
		myStack.push(3);
		myStack.pop();
		myStack.pop();
		myStack.push(4);
		myStack.pop();
		myStack.push(5);
		myStack.pop();
		myStack.pop();
	}

	/**
	 * @Title: push
	 * @Description: 进
	 * @param a
	 * @return: void
	 */
	public void push(int a) {
		if (queue1.isEmpty() && queue2.isEmpty()) {
			queue1.add(a);
		} else if (queue1.isEmpty()) {
			queue2.add(a);
		} else {
			queue1.add(a);
		}
	}

	/**
	 * @Title: pop
	 * @Description: 出
	 * @return
	 * @return: int
	 */
	public int pop() {
		int result = -1;
		int size = 0;
		if (queue1.isEmpty() && queue2.isEmpty()) {
			System.out.println("栈为空");
		} else if (queue1.isEmpty()) {
			size = queue2.size() - 1;
			for (int i = 0; i < size; i++) {
				queue1.add(queue2.remove());
			}
			result = queue2.remove();
		} else {
			size = queue1.size() - 1;
			for (int i = 0; i < size; i++) {
				queue2.add(queue1.remove());
			}
			result = queue1.remove();
		}
		return result;
	}
}
