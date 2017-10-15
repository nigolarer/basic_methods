package intv.method.BTree;
import intv.common.bTreeNode;
import  intv.util.*;
import static intv.util.TraversalBTree.*;

/*
class bTreeNode {
    bTreeNode lchild;
    bTreeNode rchild;
    int value;
    bTreeNode() {
    }
    bTreeNode(int value) {
        this.value = value;
    }
}*/
public class SubTreeMatchTest {
    public static void main(String[] args) {
/*        for (int i = 0; i < 100; i++){
            System.out.print (RandomNum.getRandom(2)+ " ");
        }*/
        GenerateBTree.setMaxValue(100);
        bTreeNode root = GenerateBTree.getBTree(10);
        System.out.println("final result:\n");
        System.out.println("inOrder:");
        inOrderTraversalBTree(root);//中序遍历
        System.out.println();
        System.out.println("preOrder:");
        preOrderTraversalBTree(root);//先序遍历
        System.out.println();

       /* System.out.println();
        bTreeNode n = new bTreeNode(10);
        root.rchild = n;
        n = new bTreeNode(20);
        root.lchild = n;
        inOrderTraversalBTree(root);
        System.out.println();
        preOrderTraversalBTree(root);//先序遍历
        System.out.println();
        postOrderTraversalBTree(root);//后序遍历*/
    }
}
