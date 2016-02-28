>题目：判断二叉树B是否为二叉树A的子结构

###分析
老生常谈了，二叉树问题，记住要巧用递归。A树中，如果根结点与B树的根结点相同，那么分别比较根结点的左右子树是否相同。如果左右子树有不同，那么就继续在A的左右子树中查找B树。直到找到或者查找完整个A树。

代码如下：

```java
/**
 * @ClassName: SubTree
 * @Description: 判断二叉树B是否为二叉树A的子结构
 * @author: MeiXXD
 */
public class SubTree {
	/**
	 * @Title: HasSubTree
	 * @Description: 先找根节点是否相等，如不相等，则去左右子树中寻找（递归）
	 * @param root1为A树的根结点
	 * @param root2为B树的根结点
	 * @return
	 * @return: boolean
	 */
	public boolean HasSubTree(Tree root1, Tree root2) {
		boolean result = false;
		if (root1 != null && root2 != null) {
			if (root1.value == root2.value) {
			    // 根结点相同，做进一步比较。
				result = DoesTree1HasTree2(root1, root2);
			}
			// 左右子树中继续查找
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
	 * @Description: 根节点相等，则比较左右子树（递归）
	 * @param root1
	 * @param root2
	 * @return
	 * @return: boolean
	 */
	public boolean DoesTree1HasTree2(Tree root1, Tree root2) {
		if (root2 == null) {
			return true;
		}
		if (root1 == null) {
			return false;
		}
		if (root1.value != root2.value) {
			return false;
		}
		// Tree1左子树中包含Tree2的左子树，Tree2右子树中包含Tree2的右子树，才是Tree1包含Tree2
		return DoesTree1HasTree2(root1.lChild, root2.lChild)&& DoesTree1HasTree2(root1.rChild, root2.rChild);
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
```