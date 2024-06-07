import java.util.*;

class Main {
  public static void main(String[] args) {
    ArrayDeque<String> stack = new ArrayDeque<>();

    stack.push("Apple");
    stack.push("Banana");
    stack.push("Cherry");

    System.out.println(stack.peek());

    ArrayDeque<Integer> stack2 = new ArrayDeque<>();
    for(int i=0;i<11;i++){
      stack2.push(i);
    }
    while(stack2.isEmpty()==false){
      System.out.println(stack2.peek());
      stack2.pop();
    }
  }
}