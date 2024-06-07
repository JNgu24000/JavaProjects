import java.util.*;

class Main {
  public static void main(String[] args) {
     ArrayDeque<Integer> queue = new ArrayDeque<>();

    queue.offer(1);
    queue.offer(2);
    queue.offer(3);
    queue.offer(4);
    queue.offer(5);

    System.out.println(queue.peek());

    ArrayDeque<String> queue2 = new ArrayDeque<>();
    queue2.offer("Zero");
    queue2.offer("One");
    queue2.offer("Two");
    queue2.offer("Three");
    queue2.offer("Four");
    queue2.offer("Five");

    for (String i:queue2){
      queue2.poll();
      System.out.println(i);
    }

  }
}