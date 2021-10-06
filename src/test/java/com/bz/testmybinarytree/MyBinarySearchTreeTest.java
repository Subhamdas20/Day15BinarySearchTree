package com.bz.testmybinarytree;

import com.bz.testmybinarytree.binarysearchtree.MyBinaryNode;
import com.bz.testmybinarytree.binarysearchtree.MyBinaryTree;
import org.junit.Test;

public class MyBinarySearchTreeTest {
    @Test
    public  void given3NumbersWhenAddedToBSTShouldReturnSize3(){
        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);

    }
}
