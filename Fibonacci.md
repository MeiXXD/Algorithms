/**
 * @ClassName: Fibonacci
 * @Description: 两种方式实现斐波那契数列
 * @author: MeiXXD
 */
public class Fibonacci {
	public static void main(String[] args) {
		System.out.println(StandardFibonacci(10));
		System.out.println(LowToHighFibonacci(10));
	}

	/**
	 * @Title: StandardFibonacci
	 * @Description: 斐波那契数列的标准实现（递归），优点：直观；缺点：存在重复计算的问题
	 * @param n
	 * @return
	 * @return: int
	 */
	public static int StandardFibonacci(int n) {
		int result = 0;
		if (n == 0) {
			result = 0;
		} else if (n == 1) {
			result = 1;
		} else {
			result = StandardFibonacci(n - 1) + StandardFibonacci(n - 2);
		}
		return result;
	}

	/**
	 * @Title: LowToHighFibonacci
	 * @Description: 从下往上实现斐波那契数列，可避免重复计算
	 * @param n
	 * @return
	 * @return: int
	 */
	public static int LowToHighFibonacci(int n) {
		int result = 0;
		int NMinOne = 1;
		int NMinTwo = 0;
		for (int i = 2; i <= n; i++) {
			result = NMinOne + NMinTwo;
			NMinTwo = NMinOne;
			NMinOne = result;
		}
		return result;
	}
}
