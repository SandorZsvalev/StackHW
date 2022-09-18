public class MyStack <T> {

    private Node <T> first;

    public T peek (){
        return first.getValue();
    }

    public T pop (){
        if (!isEmpty()) {
            T value = first.getValue();
            Node<T> newFirstNod = first.getNext();
            first = newFirstNod;
            return value;
        }
        return null;
    }

    public T push (T value) {
        Node<T> newFirstNode = new Node<>(value);
        newFirstNode.setNext(first);
        first = newFirstNode;
        return value;
    }

    boolean isEmpty (){
        return first == null;
    }

    public void printStack() {
            Node<T> nodeForPrint = first;
            while (!(nodeForPrint.getNext() == null)) {
                System.out.println(nodeForPrint.getValue());
                Node<T> tempNode = nodeForPrint.getNext();
                nodeForPrint = tempNode;
            }
        System.out.println(nodeForPrint.getValue().toString());
    }
}
