package Series10.ex1;

public class RLEElement {
    private int size;
    private char nucleotide;

    public RLEElement(int size, char nucleotide) {
        this.size = size;
        this.nucleotide = nucleotide;
    }

    public int getSequenceSize() {
        return this.size;
    }

    public char getSequenceNucleotide() {
        return this.nucleotide;
    }

    public String toString() {
        String output = "";
        for (int i = 0; i < this.size; i++) {
            output += this.nucleotide;
        }
        return output;
    }

}
