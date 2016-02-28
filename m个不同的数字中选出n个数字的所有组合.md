>题目：从m个不同的数字中选出n个数字的所有组合

###分析
此题如果运用数学排列组合知识的话，c(m,n)就是最后的组合数，那么如何输出所有的组合结果呢？

这种题目，可以看到，步骤有很强的重复性，因此自然而然会想到递归。

递归思路如下：

1. 从n个元素中选出序号最大的数，然后在剩下的(n-1)个元素中选(m-1)个。当m=1时，倒序输出数组b。
2. 从n个元素中选出编号次小的数，重复第1步。

递归解法代码如下：

```java
/**
 * @Title: comb
 * @Description: n个不同的数中选m个数
 * @param a   给定数组
 * @param b   组合结果数组
 * @param n   给定数组的长度
 * @param m   组合结果数组的长度
 * @param M   M = m
 * @return:   void
 */
public void comb(int[] a, int[] b, int n, int m, final int M) {
	for (int i = n; i >= m; i--) {
		b[m - 1] = i - 1;
		if (m > 1) {
		    //递归调用
			comb(a, b, i - 1, m - 1, M);
		} else {
		    for (int j = M - 1; j >= 0; j--) {
			    System.out.print(a[b[j]] + " ");
			}
			System.out.println();
		}
	}
}
```
