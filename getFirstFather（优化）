/**
	 * @Title: getPath
	 * @Description: 结点路径入口函数
	 * @param root
	 * @param node
	 * @return
	 * @return: ArrayList<BinaryTree>
	 */
	public static ArrayList<BinaryTree> getPath(BinaryTree root, BinaryTree node) {
		if (root == null) {
			return null;
		}
		ArrayList<BinaryTree> nodeList = new ArrayList<BinaryTree>();
		return getPath(root, node, nodeList);
	}

	/**
	 * @Title: getPath
	 * @Description: 得到到某一结点的路径
	 * @param root
	 * @param node
	 * @param nodeList
	 */
	public static ArrayList<BinaryTree> getPath(BinaryTree root,
			BinaryTree node, ArrayList<BinaryTree> nodeList) {
		ArrayList<BinaryTree> resultList = null;
		boolean found = true;
		if (root.value == node.value) {
			nodeList.add(node);
			resultList = nodeList;
			found = false;
		}
		// 递归实现
		if (found) {
			nodeList.add(root);
			if (root.lChild != null) {
				resultList = getPath(root.lChild, node, nodeList);
				// 找到了就直接返回结果
				if (resultList != null) {
					return resultList;
				}
			}
			if (root.rChild != null) {
				resultList = getPath(root.rChild, node, nodeList);
				// 找到了就直接返回结果
				if (resultList != null) {
					return resultList;
				}
			}
			nodeList.remove(nodeList.size() - 1);
		}
		// 没有找到返回null
		return resultList;
	}

	/**
	 * @Title: getLastCommonNode
	 * @Description: 得到list1和list2的最后一个公共结点
	 * @param list1
	 * @param list2
	 * @return
	 * @return: BinaryTree
	 */
	public static BinaryTree getLastCommonNode(ArrayList<BinaryTree> list1,
			ArrayList<BinaryTree> list2) {
		BinaryTree result = null;
		boolean mark = true;
		int index = 0;
		while (mark) {
			if (list1.get(index) == list2.get(index)) {
				result = list1.get(index);
				index++;
			} else {
				mark = false;
			}
		}
		return result;
	}

	/**
	 * @Title: getFirstFather
	 * @Description: 入口函数，得到第一个公共结点
	 * @param root
	 * @param node1
	 * @param node2
	 * @return
	 * @return: BinaryTree
	 */
	public static BinaryTree getFirstFather(BinaryTree root, BinaryTree node1,
			BinaryTree node2) {
		if (root == null || node1 == null || node2 == null) {
			return null;
		}
		ArrayList<BinaryTree> list1 = getPath(root, node1);
		ArrayList<BinaryTree> list2 = getPath(root, node2);
		return getLastCommonNode(list1, list2);
	}
