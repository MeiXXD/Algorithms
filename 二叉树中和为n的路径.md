>二叉树中和为某一值的路径

###分析
首先，二叉树的路径是指从树的根结点开始往下一直到叶结点所经过的所有结点。

其次，二叉树问题，首先考虑的解法就是递归。

下面用递归分析一下本题。

二叉树和为某一值的路径，先从根结点出发，然后在左右子树中找和为n-root.value的路径，以此类推。递归结束的地方就是最后找到的是叶子结点，而且叶子结点到根结点的路径和为n。值得注意的有两点，一是必须构成路径，也就是最后结束必须是叶子结点；二是必须有一个保存前面结点的容器，具体就是先将结点加入容器，然后查找路径，如果路径存在，则打印容器中的所有值，如果路径不存在，则移除刚刚放入容器的结点。

代码如下：

```java
/**
 * @Title: getPath
 * @Description: 入口函数
 * @param root
 * @param sum
 * @return: void
 */
public void getPath(BinaryTree root, int sum) {
    if (root == null) {
        return;
    }
    // 容器
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
public void getSumPath(BinaryTree root, int sum, Vector<BinaryTree> vector) {
    // 出口
    if (root.lChild == null && root.rChild == null) {
        if (root.value == sum) {
            vector.add(root);
            for (int i = 0; i < vector.size(); i++) {
                System.out.print(vector.get(i).value + " ");
            }
        }
        return;
    }
    
    // 添加到容器，并递归查找
    vector.add(root);
    if (root.lChild != null) {
        getSumPath(root.lChild, sum - root.value, vector);
    }
    if (root.rChild != null) {
        getSumPath(root.rChild, sum - root.value, vector);
    }
    // 没找到则移除
    vector.remove(vector.size() - 1);
}
```