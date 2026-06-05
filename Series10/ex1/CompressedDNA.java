package Series10.ex1;

import java.util.Vector;

public class CompressedDNA implements DNA {

    private Vector<RLEElement> dna;
    private int size;

    public CompressedDNA(String sequence) throws DNAException {
        DNAException.checkDNASeq(sequence);

        this.size = sequence.length();

        this.dna = new Vector<RLEElement>();

        char currentChar = 'z';
        for (int i = 0; i < this.size; i++) {
            currentChar = sequence.charAt(i);
            int repeat = 1;

            while (true) {
                if (i + 1 >= this.size)
                    break;

                if (currentChar == sequence.charAt(i + 1)) {
                    i++;
                    repeat++;
                } else {
                    break;
                }
            }

            RLEElement dnaSeq = new RLEElement(repeat, currentChar);
            this.dna.add(dnaSeq);
        }

    }

    private void checkDNASizeException(int i) throws DNAException {
        if (i >= this.size) {
            throw new DNAException("The i-th nucleotide exceeds the size of the dna strand");
        }
    }

    public Object getNucleotide(int i) {
        try {
            this.checkDNASizeException(i);

            int nbNucleotides = 0;

            for (RLEElement rleDna : this.dna) {
                nbNucleotides += rleDna.getSequenceSize();

                if (i < nbNucleotides) {
                    return rleDna.getSequenceNucleotide();
                }
            }
        } catch (DNAException dnae) {
            System.out.println(dnae.getMessage());
        }
        return null;
    }

    public int getSize() {
        return this.size;
    }

    public String toString() {
        String output = "";
        for (RLEElement rleee : this.dna) {
            output += rleee.toString();
        }
        return output;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DNA))
            return false;

        String bis = obj.toString();
        return bis.equals(this.dna.toString());
    }

    public int hashCode() {
        return this.toString().hashCode();
    }

}
