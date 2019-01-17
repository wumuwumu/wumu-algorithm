package cn.sciento.algorithm;

public class List<T> {

    Node head;

    private int length= 0;




    public List(){
        head = new Node(null);
        head.setFore(head);
        head.setPre(head);
    }

    public int size(){
        return this.length;
    }

    public int add(T val){
        Node node = new Node(val);
        head.setPre(node);
        node.setFore(head);
        Node lastNode = getNode(this.length-1);
        lastNode.setFore(node);
        node.setPre(lastNode);
        this.length++;
        return this.length;
    }

    public T get(int i){
        if(i > this.length-1){
            throw new IllegalArgumentException("");
        }
        return (T) this.getNode(i).getValue();
    }

    public int remove(int i){
        Node node = getNode(i);
        Node pre = node.getPre();
        Node fore = node.getFore();
        pre.setFore(fore);
        fore.setPre(pre);
        node = null;
        this.length --;
        return this.length;
    }




    public Node getNode(int addr){
        if(addr>this.length/2){
            Node node = head.getPre();
            if(node == null){
                return head;
            }
            int i = this.length-addr-1;
            while (i > 0){
                node = node.getPre();
                i--;
            }
            return node;
        }else {
            Node node = head.getFore();
            if(node == null){
                return head;
            }
            int i = addr;
            while (i > 0){
                node = node.getFore();
                i--;
            }
            return node;
        }

    }


    class Node<T> {
        private T value;
        private Node pre;
        private Node fore;

        public Node(T val){
            this.value = val;

        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public Node getPre() {
            return pre;
        }

        public void setPre(Node pre) {
            this.pre = pre;
        }

        public Node getFore() {
            return fore;
        }

        public void setFore(Node fore) {
            this.fore = fore;
        }
    }
}
