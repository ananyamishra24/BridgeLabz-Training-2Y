import java.util.*;

class SimpleHashMap {

    class Node {
        int key, value;

        Node(int k, int v) {
            key = k;
            value = v;
        }
    }

    private LinkedList<Node>[] buckets;
    private int size;

    // Constructor
    public SimpleHashMap() {
        buckets = new LinkedList[5]; // small size
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new LinkedList<>();
        }
        size = 0;
    }

    // Hash function
    private int hash(int key) {
        return key % buckets.length;
    }

    // PUT
    public void put(int key, int value) {
        int index = hash(key);

        for (Node node : buckets[index]) {
            if (node.key == key) {
                node.value = value; // update
                return;
            }
        }

        buckets[index].add(new Node(key, value));
        size++;
    }

    // GET
    public int get(int key) {
        int index = hash(key);

        for (Node node : buckets[index]) {
            if (node.key == key) {
                return node.value;
            }
        }

        return -1; // not found
    }

    // REMOVE
    public void remove(int key) {
        int index = hash(key);

        Iterator<Node> it = buckets[index].iterator();

        while (it.hasNext()) {
            Node node = it.next();
            if (node.key == key) {
                it.remove();
                size--;
                return;
            }
        }
    }

    // SIZE
    public int size() {
        return size;
    }
}