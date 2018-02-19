public class BinarySearchTree {

    private BinaryTreeNode root = null;
    private int size = 0;

    public BinarySearchTree(int[] array) {
        createTree(array);
    }

    public BinarySearchTree() {

    }

    void createTree(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            BinaryTreeNode node = new BinaryTreeNode(value);
            if (root == null) {
                root = node;
            } else {
                add(node);
            }
        }
    }

    boolean contains(int value) {
        BinaryTreeNode currentNode = root;
        while (true) {
            if (value == currentNode.value) {
                return true;
            } else if (value < currentNode.value) {
                if (currentNode.left != null) {
                    currentNode = currentNode.left;
                } else return false;
            } else if (value > currentNode.value) {
                if (currentNode.right != null) {
                    currentNode = currentNode.right;
                } else return false;
            } else return false;
        }
    }

    void addIfNotContains(int value) {
        BinaryTreeNode node = new BinaryTreeNode(value);
        if (root == null) {
            root = node;
            size++;
        }
        BinaryTreeNode currentNode = root;
        while (true) {
             if (value == currentNode.value) {
                break;
            } else if (value < currentNode.value) {
                if (currentNode.left != null) {
                    currentNode = currentNode.left;
                } else {
                    currentNode.left = node;
                    size++;
                    break;
                }
            } else if (value > currentNode.value) {
                if (currentNode.right != null) {
                    currentNode = currentNode.right;
                } else {
                    currentNode.right = node;
                    size++;
                    break;
                }
            }
        }
    }

    void add(BinaryTreeNode node) {
        BinaryTreeNode currentNode = root;
        while (true) {
            if (node.value < currentNode.value) {
                if (currentNode.left == null) {
                    currentNode.left = node;
                    break;
                } else {
                    currentNode = currentNode.left;
                }
            } else {
                if (currentNode.right == null) {
                    currentNode.right = node;
                    break;
                } else {
                    currentNode = currentNode.right;
                }
            }
        }
        size++;
    }

    void add(int value) {
        BinaryTreeNode node = new BinaryTreeNode(value);
        if (root == null) {
            root = node;
            size++;
        } else {
            add(node);
        }
    }

    void traverse() {
        traverse(root);
    }

    private void traverse(BinaryTreeNode node) {
        if (node.left != null) traverse(node.left);
        System.out.print(node.value + " ");
        if (node.right != null) traverse(node.right);
    }

    BinaryTreeNode getRoot() {
        return root;
    }

    int size() {
        return size;
    }

    private class BinaryTreeNode {

        int value;
        BinaryTreeNode left;
        BinaryTreeNode right;
    
        public BinaryTreeNode(int value) {
            this.value = value;
        }
    
    }

}
