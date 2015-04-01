/**
	 * @Title: preorderTraversal
	 * @Description: 二叉树的先序遍历，并将结果保存在ArrayList中
	 * @param root
	 * @return
	 * @return: ArrayList<BinaryTree>
	 */
	public static ArrayList<BinaryTree> preorderTraversal(BinaryTree root) {
		ArrayList<BinaryTree> arrayList = new ArrayList<BinaryTree>();
		if (root == null) {
			return null;
		}
		Stack<BinaryTree> binaryTrees = new Stack<BinaryTree>();
		binaryTrees.push(root);
		while (!binaryTrees.isEmpty()) {
			BinaryTree temp = binaryTrees.pop();
			arrayList.add(temp);
			if (temp.rChild != null) {
				binaryTrees.push(temp.rChild);
			}
			if (temp.lChild != null) {
				binaryTrees.push(temp.lChild);
			}
		}
		return arrayList;
	}

	/**
	 * @Title: isExisted
	 * @Description: 判断list中是否存在node1和node2
	 * @param list
	 * @param node1
	 * @param node2
	 * @return
	 * @return: boolean
	 */
	public static boolean isExisted(ArrayList<BinaryTree> list,
			BinaryTree node1, BinaryTree node2) {
		return list.contains(node1) && list.contains(node2);
	}

	/**
	 * @Title: getFirstFatherNode
	 * @Description: 得到两个结点的最低公共祖先（递归实现）
	 * @param root
	 * @param node1
	 * @param node2
	 * @return
	 * @return: BinaryTree
	 */
	public static BinaryTree getFirstFatherNode(BinaryTree root,
			BinaryTree node1, BinaryTree node2) {
		BinaryTree result = null;
		if (root == null) {
			return result;
		}
		//最低公共祖先就是自己的左右子树中包含node1和node2，但是左右子树中却不单独包含
		ArrayList<BinaryTree> rootList = preorderTraversal(root);
		ArrayList<BinaryTree> leftList = preorderTraversal(root.lChild);
		ArrayList<BinaryTree> rightList = preorderTraversal(root.rChild);
		if (isExisted(rootList, node1, node2)) {
			if (!isExisted(leftList, node1, node2)
					&& !isExisted(rightList, node1, node2)) {
				result = root;
			} else if (isExisted(leftList, node1, node2)) {
				result = getFirstFatherNode(root.lChild, node1, node2);
			} else {
				result = getFirstFatherNode(root.rChild, node1, node2);
			}
		}
		return result;
	}
