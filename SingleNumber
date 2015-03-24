/**
 * @ClassName: SingleNumber
 * @Description: 找出2n+1中的不成对的那个
 * @author: MeiXXD
 */
public class SingleNumber {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 1, 5, 3, 4 };
		System.out.println(getSingleNumber(a));
	}

	/**
	 * @Title: getSingleNumber
	 * @Description: 通过异或实现（异或具有交换律）
	 * @param a
	 * @return
	 * @return: int
	 */
	public static int getSingleNumber(int a[]) {
		int result = a[0];
		for (int i = 1; i < a.length; i++) {
			result = result ^ a[i];
		}
		return result;
	}
}
