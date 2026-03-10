public class Node {

    private Object data;
    private Node nextNode;

    public Node(Object data, Node nextNode) {
        this.data = data;
        this.nextNode = nextNode;
    }

    public Node(Object data) {
        this.data = data;
        this.nextNode = null;
    }

    public Object getValue() {
        return this.data;
    }

    public void setData(Object obj) {
        this.data = obj;
    }

    public Node getNextNode() {
        return this.nextNode;
    }

    public void setNextNode(Node node) {
        this.nextNode = node;
    }

}
