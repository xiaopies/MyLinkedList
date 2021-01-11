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
    System.out.println(hi.remove(6));
    System.out.println(hi.remove(0));
    System.out.println(hi.toString());
    MyLinkedList words = new MyLinkedList();
    words.add(0+"");
    words.add(1+"");
    words.add(2+"");
    words.add(3+"");
    words.add(4+"");
    words.add(5+"");
    words.add(6+"");
    words.add(7+"");
    System.out.println(words.toString());
    hi.extend(words);
    System.out.println(hi.toString());
    // words.add(8+"");
    // words.add(9+"");
    // words.add(0,0+"x");
    // words.add(2,1+"x");
    // words.add(4,2+"x");
    // words.add(6,3+"x");
    // words.add(8,4+"x");
    // words.add(10,5+"x");
    // words.add(12,6+"x");
    // words.add(14,7+"x");
    // words.add(16,8+"x");
    // words.add(18,9+"x");
    // System.out.println(words.toString());
    // MyLinkedList bye = new MyLinkedList();
    // bye.add("i");
    // bye.add("love");
    // bye.add("you");
    // bye.add("a");
    // bye.add("whole");
    // bye.add("!");
    // bye.add(5, "lot");


  }

}
