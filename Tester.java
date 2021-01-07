public class Tester{
  public static void main(String[] args){
    MyLinkedList hi = new MyLinkedList();
    hi.add("i");
    hi.add("love");
    hi.add("you");
    hi.add("a");
    hi.add("whole");
    hi.add("!");
    hi.add(5, "lot");
    System.out.println(hi.get(0));
    System.out.println(hi.get(1));
    System.out.println(hi.get(2));
    System.out.println(hi.get(3));
    System.out.println(hi.get(4));
    System.out.println(hi.get(5));
    System.out.println(hi.get(6));
    hi.set(5, "watermelon");
    System.out.println(hi.get(0));
    System.out.println(hi.get(1));
    System.out.println(hi.get(2));
    System.out.println(hi.get(3));
    System.out.println(hi.get(4));
    System.out.println(hi.get(5));
    System.out.println(hi.get(6));
    System.out.println(hi.toString());

  }

}
