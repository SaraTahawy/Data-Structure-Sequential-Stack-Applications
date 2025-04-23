public class Stack {
    private char[] data;
    private int top;
    private int under, over;

    public Stack() {
        data = new char[80];
        top = -1;
        under = 0;
        over = 0;
    }

    public void push(char c) {
        if (isFull()) {
            over = -1;
        } else {
            over = 0;
            top += 1;
            data[top] = c;
        }
    }

    public char pop() {
        if (isEmpty()) {
            under = -1;
            return '\0';
        } else {
            under = 0;
            char c = data[top];
            top -= 1;
            return c;
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == 79;
    }
}
