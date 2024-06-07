import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

System.out.println("Hello please tell me your name?");
String name = sc.nextLine();
System.out.println("Hello " + name + ", it is nice to meet you.");

System.out.println("What state do you live in?");
String state = sc.nextLine();

System.out.println("How old are you?");
String age = sc.nextLine();

System.out.println(name + ", I am also " + age + " and hear that " + state + " is beautiful!");

sc.close();
  }
}