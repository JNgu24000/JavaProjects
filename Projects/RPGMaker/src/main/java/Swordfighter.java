import java.util.Scanner;
import java.util.ArrayList;

class Swordfighter extends Hero implements Class{

  public Swordfighter(ArrayList<String>stats,ArrayList<String>abilities){
    super(stats,abilities);

  }
  public void displayStats(){
    stats.add("HP: 75");
    stats.add("Atk: 70");
    stats.add("Spd: 95");
    stats.add("Def: 55");
    stats.add("Res: 45");
    for(String i:stats){
      System.out.println(i);
    }
  }
  public void displayAbilities(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please select from one of the following attack abilities to acquire:\n"
                   + "* Air Slash\n"
                   + "* Cross-Slash\n"
                   + "* Spin Attack"
                  );
    String attackInput=sc.nextLine();
    abilities.add(attackInput);
    System.out.println("Select from one of the following self-buff abilities:\n"
                      + "* Limit Charge\n"
                      + "* Arts Change\n"
                      + "* Titanic Might");
    String buffInput=sc.nextLine();
    abilities.add(buffInput);
     System.out.println("Select from one of the following ultimate abilities:\n"
                      + "* Chain Attack\n"
                      + "* Omnislash\n"
                      + "* Zantetsuken");
    String ultimateInput=sc.nextLine();
    abilities.add(ultimateInput);
    System.out.println("The selected abilities are the following: "+abilities);
    sc.close();
}
}
