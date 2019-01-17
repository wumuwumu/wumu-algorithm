package cn.sciento.algorithm.tree;

public class Tree <T extends Comparable> {

    private Node head;

    public Tree(){
        head = null;
    }

    class Node<T>{
        Node left;
        Node right;
        Node parent;
        T val;

        public Node(Node left,Node right,Node parent,T val){
            this.left = left;
            this.right = right;
            this.parent = parent;
            this.val = val;
        }
    }

    public Node search(Node parent, T val){
        if(parent == null){
            return  null;
        }
        if(val.compareTo(parent)==0){
            return parent;
        }
        if(val.compareTo(parent.left)< 0){
            return search(parent.left,val);
        }else {
            return search(parent.right,val);
        }

    }

//    public void insert(T val){
//        Node node = head;
//        if(node.val)
//    }
}
