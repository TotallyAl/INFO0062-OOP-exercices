package Series10.ex1;

public class FullDNA implements DNA {

    private String dna;

    public FullDNA(String sequence) throws DNAException {
        DNAException.checkDNASeq(sequence);
        this.dna = sequence;
    }

    private void checkDNASize(int i) throws DNAException {
        if (i >= this.dna.length())
            throw new DNAException("The i-th nucleotide doesn't exist\n");
    }

    public Object getNucleotide(int i) {
        try {
            this.checkDNASize(i);
            return this.dna.charAt(i);
        } catch (DNAException dnae) {
            System.out.println(dnae.getMessage());
        }
        return null;
    }

    public int getSize() {
        return this.dna.length();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DNA))
            return false;

        String bis = obj.toString();
        return bis.equals(this.dna);
    }

    public String toString() {
        return this.dna;
    }

    public int hashCode() {
        return this.toString().hashCode();
    }

}
