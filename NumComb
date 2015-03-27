	/**
	 * @Title: comb
	 * @Description: n个数中选m个不同的数
	 * @param a   给定数组
	 * @param b   组合结果
	 * @param n   给定数组的长度
	 * @param m   组合结果的长度
	 * @param M   M=n
	 * @return:   void
	 * 思路： 
	 * 1. 从n个元素中选出序号最大的数，然后在剩下的(n-1)个元素中选(m-1)个。
	 *     当m=1时，倒序输出数组b。
	 * 2. 从n个元素中选出编号次小的数，重复第1步。
	 */
	public static void comb(int[] a, int[] b, int n, int m, final int M) {
		for (int i = n; i >= m; i--) {
			b[m - 1] = i - 1;
			if (m > 1) {
				comb(a, b, i - 1, m - 1, M);
			} else {
				for (int j = M - 1; j >= 0; j--) {
					System.out.print(a[b[j]] + " ");
				}
				System.out.println();
			}
		}
	}
