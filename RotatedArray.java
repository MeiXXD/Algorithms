/**
 * @ClassName: RotatedArray
 * @Description: 旋转数组中的最小数字
 * @author: MeiXXD
 */
public class RotatedArray {

	public static void main(String[] args) {
		int a[] = { 4, 5, 1, 2, 3 };
		System.out.println(getMin(a));
		int b[] = { 1, 0, 1, 1, 1 };
		System.out.println(getMin(b));
	}

	/**
	 * @Title: getMin
	 * @Description: 通过二分查找得到数组中的最小值
	 * @param a
	 * @return
	 * @return: int
	 */
	public static int getMin(int a[]) {
		int start = 0;
		int end = a.length - 1;
		int mid = start;
		int result = 0;
		while (a[start] >= a[end]) {
			if (end - start == 1) {
				result = a[end];
				break;
			}
			mid = (start + end) / 2;

			// 如果出现数组为类似{1,1,1,0,1}这种情况，只能使用顺序查找
			if (a[start] == a[mid] && a[mid] == a[end]) {
				result = a[start];
				for (int i = start + 1; i <= end; i++) {
					if (result > a[i]) {
						result = a[i];
					}
				}
				return result;
			}
			if (a[mid] >= a[start]) {
				start = mid;
			} else if (a[mid] <= a[end]) {
				end = mid;
			}
		}
		return result;
	}
}
