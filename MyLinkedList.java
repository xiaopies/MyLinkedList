public class MyLinkedList{
  private int size;
  private Node start, end;
  public MyLinkedList(){
  /*create a constructor*/
  size = 0;
  start = null;
  end = null;
}
  public int size(){
    return size;
  }
  public boolean add(String value){
    if (size ==0){
      Node here = new Node(value);
      start = here;
      end =here;
      size =1;
      return true;
    }
    else{
      Node here = new Node(value);
      here.setPrev(end);
      end.setNext(here);
      end =here;
      size ++;
      return true;
    }

  }
  public void add(int index, String value){
    int counter = 0;
    Node a = start;
    Node nom = new Node(value);
    if (size ==index){
      add(value);
    }
    while (counter != index){
      a = a.getNext();
      counter++;
    }
    if (counter !=0){
      nom.setPrev(a.getPrev());
      a.getPrev().setNext(nom);
    }
    nom.setNext(a);
    a.setPrev(nom);

  }
  public String get(int index){
    int counter = 0;
    Node a = start;
    while (counter != index){
      a = a.getNext();
      counter++;
    }
    return a.getData();

  }
  // public String set(int index, String value);
  // public String toString();
//Any helper method that returns a Node object MUST BE PRIVATE!
}
