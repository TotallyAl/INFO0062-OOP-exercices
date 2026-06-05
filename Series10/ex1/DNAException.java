package Series10.ex1;

public class DNAException extends Exception {

    public DNAException() {
        super();
    }

    public DNAException(String s) {
        super(s);
    }

    public static void checkDNASeq(String seq) throws DNAException {
        char[] ch_seq = seq.toCharArray();

        for (char ch : ch_seq) {
            if (ch != 'A' && ch != 'C' && ch != 'T' && ch != 'G')
                throw new DNAException("The nucleotide is invalid\n");
        }
    }
}
