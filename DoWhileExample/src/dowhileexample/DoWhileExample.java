package dowhileexample;

public class DoWhileExample {

    public static void main(String[] args) {
        int counter = 0;

        do {
            System.out.println("I'm on the way No " + (counter + 1));
            counter = counter + 1;
        } while (counter < 10);
    }
}
