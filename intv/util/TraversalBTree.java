package intv.util;

import intv.common.bTreeNode;

/*
* 遍历二叉树
* 先序:preOrderTraversalBTree
* 中序:inOrderTraversalBTree
* */
public class TraversalBTree {

    //先序遍历
    public static void preOrderTraversalBTree(bTreeNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value+" ");
        preOrderTraversalBTree(node.lchild);
        preOrderTraversalBTree(node.rchild);
    }
    //中序遍历
    public static void inOrderTraversalBTree(bTreeNode node) {
        if (node == null) {
            return;
        }
        inOrderTraversalBTree(node.lchild);
        System.out.print(node.value+" ");
        inOrderTraversalBTree(node.rchild);
    }
    //后序遍历
    public static void postOrderTraversalBTree(bTreeNode node) {
        if (node == null) {
            return;
        }
        postOrderTraversalBTree(node.lchild);
        postOrderTraversalBTree(node.rchild);
        System.out.print(node.value+" ");
    }
}
