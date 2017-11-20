package com.ni.datastructure;

/**
 * Created by losil_000 on 2017/11/18.
 */
public class MyTree {


    class BinaryNode {
        BinaryNode(int n) {
            this(n, null, null);
        }

        BinaryNode(int n, BinaryNode left, BinaryNode right) {
            data = n;
            this.left = left;
            this.right = right;

        }

        int data;
        BinaryNode left;
        BinaryNode right;
    }

    public BinaryNode root;

    public void insert(int n) {
        BinaryNode node = new BinaryNode(n);
        if (root == null) {
            this.root = node;

        } else {
            BinaryNode curNode = root;
            while (true) {
                if (n > curNode.data) {
                    if (curNode.right == null) {
                        curNode.right = node;
                        return;
                    } else {
                        curNode = curNode.right;
                    }

                } else {
                    if (curNode.left == null) {
                        curNode.left = node;
                        return;
                    } else {
                        curNode = curNode.left;
                    }
                }
            }
        }


    }

    public void prePrint(BinaryNode node) {
        while (node != null) {
            System.out.println(node.data);
            prePrint(node.left);
            prePrint(node.right);

        }

    }

    public void inPrint(BinaryNode node) {
        if (node != null) {
            inPrint(node.left);
            System.out.println(node.data);
            inPrint(node.right);
        }
    }

    public static void main(String[] args) {
        int[] preOrder = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] midOrder = {4, 7, 2, 1, 5, 3, 8, 6};


    }


    public int[] construct(int[] pre, int[] mid) {
        if (pre == null || mid == null) {
            return null;
        }
        return null;
    }

//    public BinaryNode constructCore(int[] pre, int[] mid, int lowPre, int higPre, int lowMid, int highMid) throws Exception {
//
//
//        BinaryNode root = new BinaryNode(pre[lowPre]);
//        if (lowPre == higPre) {
//            if (lowMid == highMid && pre[lowPre] == mid[lowMid])
//                return root;
//            else
//                throw new Exception("ss");
//
//        }
//
//        int rootMidOrder = lowMid;
////     while (rootMidOrder<=highMid&&mid[rootMidOrder])
////        rootMidOrder++;
////
////
////
////
////    }
//    }
}
