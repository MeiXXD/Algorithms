/**
 * @ClassName: SubTree
 * @Description: 判断二叉树B是否为二叉树A的子结构
 * @author: MeiXXD
 */
public class SubTree {
	/**
	 * @Title: HasSubTree
	 * @Description: 先找根节点是否相等，如不相等，则去左右子树中寻找（递归）
	 * @param root1
	 * @param root2
	 * @return
	 * @return: boolean
	 */
	public static boolean HasSubTree(Tree root1, Tree root2) {
		boolean result = false;
		if (root1 != null && root2 != null) {
			if (root1.value == root2.value) {
				result = DoesTree1HasTree2(root1, root2);
			}
			if (!result) {
				result = HasSubTree(root1.lChild, root2);
			}
			if (!result) {
				result = HasSubTree(root1.rChild, root2);
			}
		}
		return result;
	}

	/**
	 * @Title: DoesTree1HasTree2
	 * @Description: 根节点相等，则比较左右孩子结点（递归）
	 * @param root1
	 * @param root2
	 * @return
	 * @return: boolean
	 */
	public static boolean DoesTree1HasTree2(Tree root1, Tree root2) {
		if (root2 == null) {
			return true;
		}
		if (root1 == null) {
			return false;
		}
		if (root1.value != root2.value) {
			return false;
		}
		return DoesTree1HasTree2(root1.lChild, root2.lChild)
				&& DoesTree1HasTree2(root1.rChild, root2.rChild);
	}

	public static void main(String args[]) {
		Tree root1 = new Tree(8);
		Tree node11 = new Tree(8);
		Tree node12 = new Tree(7);
		Tree node13 = new Tree(9);
		Tree node14 = new Tree(2);
		Tree node15 = new Tree(4);
		Tree node16 = new Tree(7);
		root1.lChild = node11;
		root1.rChild = node12;
		node11.lChild = node13;
		node11.rChild = node14;
		node14.lChild = node15;
		node14.rChild = node16;

		Tree root2 = new Tree(8);
		Tree node21 = new Tree(9);
		Tree node22 = new Tree(2);
		root2.lChild = node21;
		root2.rChild = node22;

		System.out.println(HasSubTree(root1, root2));
	}
}

class Tree {
	int value;
	Tree lChild;
	Tree rChild;

	public Tree(int value) {
		this.value = value;
		lChild = null;
		rChild = null;
	}
}
