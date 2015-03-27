/**
 * @ClassName: TreeNode
 * @Description: 二叉树的镜像树
 * @author: MeiXXD
 */
public class TreeNode {
	int value;
	TreeNode lChild;
	TreeNode rChild;

	public TreeNode(int value) {
		this.value = value;
		lChild = null;
		rChild = null;
	}

	/**
	 * @Title: getMirrorTree
	 * @Description: 递归实现，得到二叉树的镜像树
	 * @param root
	 * @return: void
	 */
	public static void getMirrorTree(TreeNode root) {
		if (root == null) {
			return;
		}
		if (root.lChild == null && root.rChild == null) {
			return;
		}
		TreeNode temp = root.lChild;
		root.lChild = root.rChild;
		root.rChild = temp;
		if (root.lChild != null) {
			getMirrorTree(root.lChild);
		}
		if (root.rChild != null) {
			getMirrorTree(root.rChild);
		}
	}

	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		TreeNode node6 = new TreeNode(6);
		TreeNode node7 = new TreeNode(7);
		node1.lChild = node2;
		node1.rChild = node3;
		node2.lChild = node4;
		node4.rChild = node6;
		node3.rChild = node5;
		node5.lChild = node7;
		getMirrorTree(node1);
	}
}
