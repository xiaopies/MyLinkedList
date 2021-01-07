public class Node{
  private String data;
  private Node next, prev;
  public Node(String value){
    data = value;
    next = null;
    prev = null;
  }

  public String getData(){
    return data;
  }
  public void setData(String a){
    data = a;
  }
  public Node getNext(){
    return next;
  }
  public void setNext(Node n){
    next = n;
  }
  public Node getPrev(){
    return prev;
  }
  public void setPrev(Node m){
    prev = m;
  }
}
