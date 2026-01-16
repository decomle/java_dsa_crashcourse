package com.decomle.dsa.crashcourse.tree;

// Binary search tree is a tree where the parent node has value greater than the left node, and less than the right node
// Big O notation:
//     worst case: O(n) if tree is not balance
//     best case: O(log(2))
public class BinarySearchTree {
    Node root;
    public void insert(Node node) {
        root = insertHelper(root, node);
    }

    private Node insertHelper(Node root, Node node) {
        int data = node.data;
        if(root == null) {
            root = node;
            return  root;
        } else if (data < root.data) {
            root.left = insertHelper(root.left, node);
        } else {
            root.right = insertHelper(root.right, node);
        }
        return root;
    }

    public void display() {
        displayHelper(root);
    }

    private void displayHelper(Node node) {
        if(node != null) {
            displayHelper(node.left);
            System.out.println(node.data);
            displayHelper(node.right);
        }
    }

    public boolean search(int data) {
        return searchHelper(root, data);
    }

    private boolean searchHelper(Node node, int data) {
        if(node == null) {
            return  false;
        } else if(node.data == data) {
            return true;
        } else if(node.data > data) {
            return searchHelper(node.left, data);
        } else {
            return searchHelper(node.right, data);
        }
    }

    public void remove(int data) {
        if(!search(data)) {
            System.out.println(data + "was not be found");
            return;
        }
        removeHelper(root, data);
    }

    public Node removeHelper(Node node, int data) {
        if(node == null) {
            return node;
        }
        if(data < node.data) {
            node.left = removeHelper(node.left, data);
        } else if(data > node.data){
            node.right = removeHelper(node.right, data);
        } else {
            if(node.left == null && node.right == null) {
                node = null;
            } else if (node.right != null) {
                node.data = successor(node);
                node.right = removeHelper(node.right, node.data);
            } else {
                node.data = predecessor(node);
                node.left = removeHelper(node.left, node.data);
            }
        }
        return node;
    }

    private int successor(Node node) { // Find the least value below the right child
        node = node.right;
        while(node.left != null) {
            node = node.left;
        }
        return node.data;
    }

    private int predecessor(Node node) { // Find the greatest value below the left child
        node = node.left;
        while(node.right != null) {
            node = node.right;
        }
        return node.data;
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(new Node(5));
        tree.insert(new Node(1));
        tree.insert(new Node(9));
        tree.insert(new Node(2));
        tree.insert(new Node(7));
        tree.insert(new Node(3));
        tree.insert(new Node(6));
        tree.insert(new Node(4));
        tree.insert(new Node(8));

//        tree.remove(4);



        tree.display();

        System.out.println("Root :" + tree.root.data);
    }
}


class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }
}