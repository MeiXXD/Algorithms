/**
	 * @Title: IsBST
	 * @Description: 根据后序遍历结果判断是否为二叉搜索树（递归实现）
	 * @param a
	 * @param length
	 * @return
	 * @return: boolean
	 */
	public static boolean IsBST(int a[], int length) {
		if (a == null || length <= 0) {
			return false;
		}
		int root = a[length - 1];
		int i = 0;
		for (; i < length - 1; i++) {
			if (a[i] > root) {
				break;
			}
		}
		int j = i;
		for (; j < length - 1; j++) {
			if (a[j] < root) {
				return false;
			}
		}
		// 判断左子树是否为二叉搜索树
		boolean left = true;
		if (i > 0) {
			int temp1[] = new int[i];
			for (int k = 0; k < temp1.length; k++) {
				temp1[k] = a[k];
			}
			left = IsBST(temp1, temp1.length);
		}
		// 判断右子树是否为二叉搜索树
		boolean right = true;
		if (i < length - 1) {
			int temp2[] = new int[length - i - 1];
			for (int k = 0; k < temp2.length; k++) {
				temp2[k] = a[i];
				i++;
			}
			right = IsBST(temp2, temp2.length);
		}
		return left && right;
	}
