/**
 * @ClassName: Matrix
 * @Description: 顺时针打印矩阵
 * @author: MeiXXD
 */
public class Matrix {
  public static void main(String[] args) {
		int array[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };
		Matrix.printMatrix(array);
	}
	/**
	 * @Title: printMatrix
	 * @Description: 打印矩阵
	 * @param array
	 * @return: void
	 */
	public static void printMatrix(int array[][]) {
		int startX = 0;
		int startY = 0;
		int endX = array.length - 1;
		int endY = array[0].length - 1;
		//判断条件
		while (startX <= endX && startY <= endY) {
			printCircle(array, startX, startY, endX, endY);
			startX++;
			startY++;
			endX--;
			endY--;
		}
	}

	/**
	 * @Title: printCircle
	 * @Description: 顺时针绕圈打印
	 * @param array
	 * @param startX
	 * @param startY
	 * @param endX
	 * @param endY
	 * @return: void
	 */
	static void printCircle(int array[][], int startX, int startY, int endX,
			int endY) {
		// 如果矩阵只有一行
		if (startX == endX) {
			for (int i = startY; i <= endY; i++) {
				System.out.print(array[startX][i] + " ");
			}
			return;
		}

		// 如果矩阵只有一列
		if (startY == endY) {
			for (int i = startX; i <= endX; i++) {
				System.out.print(array[i][endY] + " ");
			}
			return;
		}

		// 如果矩阵不止一行或者一列
		for (int i = startY; i < endY; i++) {
			System.out.print(array[startX][i] + " ");
		}

		for (int i = startX; i < endX; i++) {
			System.out.print(array[i][endY] + " ");
		}

		for (int i = endY; i > startY; i--) {
			System.out.print(array[endX][i] + " ");
		}

		for (int i = endX; i > startX; i--) {
			System.out.print(array[i][startY] + " ");
		}
	}
}
