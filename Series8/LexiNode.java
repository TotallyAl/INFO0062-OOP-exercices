package Series8;

import java.util.Vector;

public class LexiNode<T> {

    private String label;
    private T element;
    private LexiNode<T> nextElement;

    public LexiNode(String label, T element) {
        this.label = label;
        this.element = element;
        this.nextElement = null;
    }

    public T getElement() {
        return this.element;
    }

    public String getLabel() {
        return this.label;
    }

    public LexiNode<T> getNext() {
        return this.nextElement;
    }

    public void updateNextNode(LexiNode<T> newNext) {
        this.nextElement = newNext;
    }

    public void print() {
        System.out.println("Label:" + label + ", element: " + element);
    }

}
