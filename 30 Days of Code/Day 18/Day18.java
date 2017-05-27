package thirty_days_of_code;
import java.util.*;
public class Day18{
    // Write your code here.
    private LinkedList stack;
    private LinkedList queue;

    public Day18() {
        this.stack = new LinkedList();
        this.queue = new LinkedList();
    }

    private char popCharacter() {
        return (char) this.stack.pop();
    }

    private void pushCharacter(char c) {
        this.stack.push(c);
    }

    private char dequeueCharacter() {
        return (char) this.queue.remove(0);
    }

    private void enqueueCharacter(char c) {
        this.queue.addLast(c);
    }
}