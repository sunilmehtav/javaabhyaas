package com.udayan.dsa.trees;

import com.udayan.dsa.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinarySearchTree {
    private TreeNode rootNode;

    public TreeNode getRootNode() {
        return rootNode;
    }

    public void setRootNode(TreeNode rootNode) {
        this.rootNode = rootNode;
    }

    public boolean insert(int value) {
        TreeNode newNode = new TreeNode(value);
        if (this.rootNode == null) {
            this.rootNode = newNode;
            return true;
        }
        TreeNode temp = this.rootNode;
        while (true) {
            if (value == temp.getValue()) return false;
            if (value < temp.getValue()) {
                if (temp.getLeftNode() == null) {
                    temp.setLeftNode(newNode);
                    return true;
                }
                temp = temp.getLeftNode();
            } else {
                if (temp.getRightNode() == null) {
                    temp.setRightNode(newNode);
                    return true;
                }
                temp = temp.getRightNode();
            }

        }
    }

    public void rInsert(int value) {
        rInsert(rootNode, value);
    }

    private TreeNode rInsert(TreeNode currentNode, int value) {
        if (currentNode == null) return new TreeNode(value);

        if (value < currentNode.getValue()) {
            currentNode.setLeftNode(rInsert(currentNode.getLeftNode(), value));
        } else if (value > currentNode.getValue()) {
            currentNode.setRightNode(rInsert(currentNode.getRightNode(), value));
        }
        return currentNode;
    }

    public TreeNode delete(TreeNode currentNode, int value) {
        if (value < currentNode.getValue()) {
            currentNode.setLeftNode(delete(currentNode.getLeftNode(), value));
        } else if (value > currentNode.getValue()) {
            currentNode.setRightNode(delete(currentNode.getRightNode(), value));
        } else {

            // 4 scenarios ie deleting leafNode, or deleting node with only one left node
            // or only one right node or deleting subtree with both right and left nodes
            if (currentNode.getLeftNode() == null && currentNode.getRightNode() == null) {
                return null;
            } else if (currentNode.getLeftNode() == null) {
                currentNode = currentNode.getRightNode();
            } else if (currentNode.getRightNode() == null) {
                currentNode = currentNode.getLeftNode();
            } else {
                // we need to find lowest value in subtree
                int subTreeMin = minValue(currentNode.getRightNode());
                currentNode.setValue(subTreeMin);
                currentNode.setRightNode(delete(currentNode.getRightNode(), subTreeMin));
            }
        }
        return currentNode;
    }

    public int minValue(TreeNode currentNode) {
        while (currentNode.getLeftNode() != null) {
            currentNode = currentNode.getLeftNode();
        }
        return currentNode.getValue();
    }

    public List<Integer> BFS() {
        TreeNode currentNode = rootNode;
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> results = new ArrayList<>();
        queue.add(currentNode);
        while (queue.size() > 0) {
            currentNode = queue.remove();
            results.add(currentNode.getValue());
            if (currentNode.getLeftNode() != null) {
                queue.add(currentNode.getLeftNode());
            }
            if (currentNode.getRightNode() != null) {
                queue.add(currentNode.getRightNode());
            }
        }
        return results;

    }

    public void DFSPreOrder(TreeNode currentNode, ArrayList<Integer> arrayList) {
        if (currentNode == null) return;
        arrayList.add(currentNode.getValue());
        //System.out.print(currentNode.getValue()+" ");
        DFSPreOrder(currentNode.getLeftNode(), arrayList);
        DFSPreOrder(currentNode.getRightNode(), arrayList);
        System.out.println();
    }

    public void DFSInOrder(TreeNode currentNode) {
        if (currentNode == null) return;
        DFSInOrder(currentNode.getLeftNode());
        System.out.print(currentNode.getValue() + " ");
        DFSInOrder(currentNode.getRightNode());
        System.out.println();
    }

    public void DFSPostOrder(TreeNode currentNode) {
        if (currentNode == null) return;
        DFSPostOrder(currentNode.getLeftNode());
        DFSPostOrder(currentNode.getRightNode());
        System.out.print(currentNode.getValue() + " ");
        System.out.println();
    }

}
