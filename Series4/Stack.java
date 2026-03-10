public class Stack {

    private Node head;
    private int size;

    // No constructor

    public Object first() {
        if (this.size == 0)
            return null;

        return this.head.getValue();
    }

    public Object pop() {
        if (this.size == 0)
            return null;

        Object value = this.head.getValue();
        this.head = this.head.getNextNode();
        this.size--;

        return value;
    }

    public void push(Object value) {

        Node n = new Node(value);
        n.setNextNode(this.head);
        this.head = n;
        this.size++;
    }

    public int getSize() {
        return this.size;
    }

}
