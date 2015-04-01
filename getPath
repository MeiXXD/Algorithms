/**
	 * @Title: getPath
	 * @Description: 入口函数
	 * @param root
	 * @param sum
	 * @return: void
	 */
	public static void getPath(BinaryTree root, int sum) {
		if (root == null) {
			return;
		}
		Vector<BinaryTree> vector = new Stack<BinaryTree>();
		getSumPath(root, sum, vector);
	}
	
	/**
	 * @Title: getSumPath
	 * @Description: 二叉树中和为某一值的路径
	 * @param root
	 * @param sum
	 * @param vector
	 * @return: void
	 */
	public static void getSumPath(BinaryTree root, int sum,
			Vector<BinaryTree> vector) {
		if (root.lChild == null && root.rChild == null) {
			if (root.value == sum) {
				vector.add(root);
				for (int i = 0; i < vector.size(); i++) {
					System.out.print(vector.get(i).value + " ");
				}
			}
			return;
		}
		//递归实现
		vector.add(root);
		if (root.lChild != null) {
			getSumPath(root.lChild, sum - root.value, vector);
		}
		if (root.rChild != null) {
			getSumPath(root.rChild, sum - root.value, vector);
		}
		vector.remove(vector.size() - 1);
	}
