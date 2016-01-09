**
 * @ClassName: NumOfOne
 * @Description: 4种方式实现二进制中1的个数
 * @author: MeiXXD
 */
public class NumOfOne {
	public static void main(String[] args) {
		System.out.println(stupidGetNum(15));
		System.out.println(stupidGetNum(-1));
		System.out.println(wrongGetNum(15));
		// 此处造成死循环
		// System.out.println(wrongGetNum(-1));
		System.out.println(rightGetNum(15));
		System.out.println(rightGetNum(-1));
		System.out.println(newGetNum(15));
		System.out.println(newGetNum(-1));
	}

	/**
	 * @Title: stupidGetNum
	 * @Description: 最笨的一种办法
	 * @param a
	 * @return
	 * @return: int
	 */
	public static int stupidGetNum(int a) {
		int count = 0;
		String string = Integer.toBinaryString(a);
		for (int i = 0; i < string.length(); i++) {
			char temp = string.charAt(i);
			if (temp == '1') {
				count++;
			}
		}
		return count;
	}

	/**
	 * @Title: wrongGetNum
	 * @Description: 不完全正确的办法，如传递过来的是负数，则造成死循环
	 * @param a
	 * @return
	 * @return: int
	 */
	public static int wrongGetNum(int a) {
		int count = 0;
		int temp = 1;
		while (a != 0) {
			if ((a & temp) == 1) {
				count++;
			}
			a = a >> 1;
		}
		return count;
	}

	/**
	 * @Title: rightGetNum
	 * @Description: 正确的求法，效率高，缺点是要比32次
	 * @param a
	 * @return
	 * @return: int
	 */
	public static int rightGetNum(int a) {
		int count = 0;
		int temp = 1;
		while (temp != 0) {
			if ((a & temp) != 0) {
				count++;
			}
			temp = temp << 1;
		}
		return count;
	}

	/**
	 * @Title: newGetNum
	 * @Description: 新颖的解法，更快，有几个1比几次
	 * @param a
	 * @return
	 * @return: int
	 */
	public static int newGetNum(int a) {
		int count = 0;
		while (a != 0) {
			a = a & (a - 1);
			count++;
		}
		return count;
	}
}
