public class queue {
    private node[] elements;
    private int size;
    public queue() {
        elements = new node[10000];
        size = 0;
    }

    public void enqueue(node a) {
        elements[size] = a;
        size++;
    }


    public node dequeue() {
        node a = elements[size - 1];
        elements[size - 1] = null;
        size--;
        return a;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        if(size == 0) {
            return true;
        }
        return false;
    }

}
