import java.util.*;

class Main {
  public static void main(String[] args) {
    ArrayList<Person> family = new ArrayList<Person>();
    GrandParent gp1 = new GrandParent("Mary");
    GrandParent gp2 = new GrandParent("John");
    Parent p1 = new Parent("Amy","medium");
    Parent p2 = new Parent("Andy","low");
    Child c = new Child("Annie","high","Johnson");

    family.add(gp1);
    family.add(gp2);
    family.add(p1);
    family.add(p2);
    family.add(c);

    for (Person person : family){
      person.walk();
    }
}
}