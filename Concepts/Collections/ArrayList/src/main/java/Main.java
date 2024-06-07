import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    ArrayList<String> instruments = new ArrayList<String>();
    String drums = "Drums";
    instruments.add(drums);
    String violin = "Violin";
    instruments.add(violin);

    instruments.add("Guitar");
    instruments.add(new String("Piano"));

   for (int i = 0; i < instruments.size(); i++) {
    System.out.println(instruments.get(i));
    }

  instruments.remove("Violin");
  System.out.println();
    for (int i = 0; i < instruments.size(); i++) {
      System.out.println(instruments.get(i));
    }
  instruments.remove(1);
  System.out.println();
  for (int i = 0; i < instruments.size(); i++) {
    System.out.println(instruments.get(i));
    }

  ArrayList<Integer> integerList = new ArrayList<Integer>();
  integerList.add(15);
  integerList.add(22);
  integerList.add(99);
  integerList.add(75);
  integerList.add(16);
  integerList.add(2);

  for (int i = 0; i < integerList.size(); i++) {
    System.out.println(integerList.get(i));
    }
  for (int i = integerList.size()-1; i >= 0; i--) {
    System.out.println(integerList.get(i));
    }
  }
}