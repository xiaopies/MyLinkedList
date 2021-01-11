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
    if (index<0 || index >size){
      throw new IndexOutOfBoundsException();
    }
    else{
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
      size ++;
    }
    if (index ==0){
      start = nom;
    }
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
  public String set(int index, String value){
    int counter = 0;
    Node a = start;
    while (counter != index){
      a = a.getNext();
      counter++;
    }
    a.setData(value);
    return value;
  }
  public String toString(){
    String s = "[";
    int counter = 0;
    Node a = start;
    while (counter < size){
      s+= a.getData();
      a= a.getNext();
      counter++;
      if (counter <size){
        s += ", ";
      }
    }
    return (s + "]");
  }
  public String remove (int index){
    if (index<0 || index >=size){
      throw new IndexOutOfBoundsException(index + "index out of range");
    }
    int counter = 0;
    Node a = start;
    while (counter != index){
      a = a.getNext();
      counter++;
    }
    if (index>0){
      a.getPrev().setNext(a.getNext());
    }
    else{
      if (size>1) start.getNext().setPrev(null);
      start = start.getNext();
    }
    if (index<size-1){
      a.getNext().setPrev(a.getPrev());
    }
    else{
      if (size>1){
        end.getPrev().setNext(null);
        end = end.getPrev();
      }

    }
    size --;
    return get(index-1);
  }
  public void extend (MyLinkedList other){
    if (size==0) {
         start = other.start;
    } else if (other.size>0) {
         end.setNext(other.start);
         other.start.setPrev(end);
    }
    end = other.end;
   size += other.size;
   other.start = null;
   other.end = null;
   other.size = 0;
 }




//Any helper method that returns a Node object MUST BE PRIVATE!
}
