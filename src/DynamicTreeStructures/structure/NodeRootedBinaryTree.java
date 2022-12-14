
package DynamicTreeStructures.structure;

/**
 *
 * @author Fiordor
 * @param <K>
 */
public class NodeRootedBinaryTree<K extends Comparable<K>> implements Comparable<NodeRootedBinaryTree<K>>{

    private K data;
    private NodeRootedBinaryTree<K> left;
    private NodeRootedBinaryTree<K> right;

    public NodeRootedBinaryTree(K data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public K getData() {
        return data;
    }

    public void setData(K data) {
        this.data = data;
    }

    public NodeRootedBinaryTree<K> getLeft() {
        return left;
    }

    public void setLeft(NodeRootedBinaryTree<K> left) {
        this.left = left;
    }

    public NodeRootedBinaryTree<K> getRight() {
        return right;
    }

    public void setRight(NodeRootedBinaryTree<K> right) {
        this.right = right;
    }
    
    @Override
    public int compareTo(NodeRootedBinaryTree<K> data) {
        return this.data.compareTo(data.getData());
    }

    @Override
    public String toString() {
        String l = left == null ? "null" : left.data.toString();
        String d = data.toString();
        String r = right == null ? "null" : right.data.toString();
        return String.format("%s;%s;%s", l, d, r);
    }
}
