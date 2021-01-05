public class Node{
  public Node(String value){
    node = value;
    next = null;
    prev = null;
  }
  private Node next, prev;
  public int getNode(){
    return node;
  }
  public int getNext(){
    return next;
  }
  public int getPrev(){
    return prev;
  }
}
