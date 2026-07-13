import java.util.HashMap;
import java.util.Map;

/**
 * Doubly linked list (MRU at head, LRU at tail) + HashMap for O(1) lookup.
 * Time Complexity:  O(1) for both get and put
 * Space Complexity: O(capacity)
 */
class Node {
    int key, value;
    Node next, previous;

    Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

class LRUCache {
    private static final int ABSENT = -1;
    private final Node head = new Node(0, 0);
    private final Node tail = new Node(0, 0);
    private final int capacity;
    private final Map<Integer, Node> cache;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<>(capacity);
        head.next = tail;
        tail.previous = head;
    }

    public int get(int key) {
        if (cache.containsKey(key)) {
            Node node = cache.get(key);
            remove(node);
            insertAtFirst(node);
            return node.value;
        } else {
            return ABSENT;
        }
    }

    public void put(int key, int value) {
        Node node = cache.get(key);
        if (node != null) {
            node.value = value;
            remove(node);
            insertAtFirst(node);
        } else {
            if (cache.size() == capacity) {
                Node lru = tail.previous;
                remove(lru);
                cache.remove(lru.key);
            }
            Node newNode = new Node(key, value);
            insertAtFirst(newNode);
            cache.put(key, newNode);
        }
    }

    private void remove(Node node) {
        node.next.previous = node.previous;
        node.previous.next = node.next;
    }

    private void insertAtFirst(Node node) {
        node.previous = head;
        node.next = head.next;
        head.next.previous = node;
        head.next = node;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
