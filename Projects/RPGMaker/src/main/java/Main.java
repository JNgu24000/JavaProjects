import java.util.Scanner;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    ArrayList<String> stats = new ArrayList<String>();
    ArrayList<String> abilities = new ArrayList<String>();
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome! Enter the class you would like to start in:\n"
                      + "* Swordfighter\n"
                      + "* Vanguard\n"
                      + "* Warrior\n"
                      + "* Mage");
  String input=sc.nextLine();
  switch (input){
    case "Swordfighter":
      Swordfighter s1=new Swordfighter(stats,abilities);
      System.out.println("You have selected the Swordfighter class.");
      s1.displayStats();
      s1.displayAbilities();
      break;
      case "Vanguard":
      Vanguard v1=new Vanguard(stats,abilities);
      System.out.println("You have selected the Vanguard class.");
      v1.displayStats();
      v1.displayAbilities();
      break;
  }
    sc.close();
  }
}