/**
 * @ClassName: Number
 * @Description: 数组中只出现一次的两个数（剩下都是从重复出现的）
 * @author: MeiXXD
 */
public class Number {

	/**
	 * @Title: getNumAppearOnce
	 * @Description: 找到只出现一次的数字
	 * @param a
	 * @return: void
	 */
	public static void getNumAppearOnce(int a[]) {
		if (a == null || a.length < 2) {
			return;
		}
		int EOR = 0;
		for (int i = 0; i < a.length; i++) {
			EOR = EOR ^ a[i];
		}
		int firstBit1 = FindFirstBitIs1(EOR);
		int num1 = 0;
		int num2 = 0;
		for (int i = 0; i < a.length; i++) {
			if (IsBit1(a[i], firstBit1)) {
				num1 = num1 ^ a[i];
			} else {
				num2 = num2 ^ a[i];
			}
		}
		System.out.println(num1 + " " + num2);
	}

	/**
	 * @Title: FindFirstBitIs1
	 * @Description: 找到第一个是1的bit
	 * @param a
	 * @return
	 * @return: int
	 */
	public static int FindFirstBitIs1(int a) {
		int index = 0;
		while ((a & 1) == 0 && index < 32) {
			a = a >> 1;
			index++;
		}
		return index;
	}

	/**
	 * @Title: IsBit1
	 * @Description: 判断该bit是否为1
	 * @param a
	 * @param index
	 * @return
	 * @return: boolean
	 */
	public static boolean IsBit1(int a, int index) {
		boolean result = false;
		a = a >> index;
		result = (a & 1) == 1;
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 2, 4, 3, 6, 3, 2, 5, 5 };
		getNumAppearOnce(a);
	}

}
