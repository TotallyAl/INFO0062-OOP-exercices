package Series8;

public class Lexicon<T> {

    private LexiNode<T> headNode;
    private int lexSize;

    public Lexicon() {
        this.lexSize = 0;
    }

    public void add(String label, T element) {
        LexiNode<T> newNode = new LexiNode<T>(label, element);
        if (this.lexSize == 0 || this.headNode.getLabel().compareTo(label) > 0) {
            newNode.updateNextNode(this.headNode);
            this.headNode = newNode;
        } else {
            LexiNode<T> previousNode = this.headNode;
            LexiNode<T> currentNode = this.headNode.getNext();
            for (int i = 0; i < this.lexSize; i++) {

                if (currentNode != null && currentNode.getLabel().compareTo(label) > 0) {
                    newNode.updateNextNode(currentNode);
                    previousNode.updateNextNode(newNode);
                    break;
                }

                if (i == lexSize - 1) {
                    previousNode.updateNextNode(newNode);
                    break;
                }

                previousNode = currentNode;
                currentNode = currentNode.getNext();
            }
        }
        lexSize++;
    }

    public void print() {
        LexiNode<T> node = this.headNode;
        for (int i = 0; i < this.lexSize; i++) {
            node.print();
            node = node.getNext();
        }
    }

}
