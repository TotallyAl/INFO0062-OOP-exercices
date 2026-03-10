public class test {

    public static void main(String[] args) {
        Queue q = new Queue();
        System.out.println("This is the size of the newly generated queue: " + q.getSize());

        q.put("A");
        q.put("Word");
        q.put("Sentence");
        System.out.println("This is the size of the queue after adding: " + q.getSize() + " values");

        System.out.println(q.first() + " is the next value that will get popped");
        System.out.println("See ? " + q.get());
    }

}
