class LRUCache {

    private class Node {
        int key;
        int val;
        Node prv;
        Node nxt;
    }


    private void remove(Node temp) {
        Node p = temp.prv;
        Node n = temp.nxt;
        p.nxt = n;
        n.prv = p;
    }

    private void addToHead(Node temp) {
        temp.nxt = head.nxt;
        temp.prv = head;
        head.nxt.prv = temp;
        head.nxt = temp;
    }

    private void moveToHead(Node temp) {
        remove(temp);
        addToHead(temp);
    }

    private int popTail() {
        Node temp = tail.prv;
        remove(temp);
        return temp.key;
    }


    private Map<Integer, Node> map;
    private int size;
    private int capacity;
    Node head, tail;

    public LRUCache(int capacity) {

        map = new HashMap<>();
        this.capacity = capacity;
        this.size = 0;
        head = new Node();
        tail = new Node();
        head.nxt = tail;
        tail.prv = head;
    }

    public int get(int key) {
        Node temp = map.get(key);
        if (temp == null) {
            return -1;
        }
        moveToHead(temp);
        return temp.val;
    }

    public void put(int key, int value) {

        Node temp = map.get(key);

        if (temp == null) {

            Node newNode = new Node();
            newNode.key = key;
            newNode.val = value;
            map.put(key,newNode);
            addToHead(newNode);
            size++;
            
            if(size>capacity){
                size--;
                int LRUNodeKey = popTail();
                map.remove(LRUNodeKey);
            }
            

        } else {
            temp.val = value;
            moveToHead(temp);
        }

    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
