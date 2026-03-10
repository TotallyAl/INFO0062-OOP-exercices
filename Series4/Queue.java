public class Queue {

    private Node head;
    private Node tail;
    private int size = 0;

    // We don't need a constructor.

    public void put(Object value) {

        if (this.size == 0) {
            Node node = new Node(value, null);

            this.head = node;
            this.tail = node;
        } else {
            Node n = new Node(value, null);
            this.tail.setNextNode(n);
            this.tail = n;
        }
        this.size++;
    }

    public Object get() {
        if (this.size == 0)
            return null;

        Object value = this.head.getValue();
        this.head = this.head.getNextNode();
        this.size--;
        if (this.size == 0) // This mean that head is null
            this.tail = null;
        return value;
    }

    public Object first() {

        if (this.size == 0)
            return null;

        return this.head.getValue();
    }

    public int getSize() {
        return this.size;
    }

}
