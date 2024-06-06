import java.util.Scanner;
import java.util.ArrayList;

class Vanguard extends Hero implements Class{

  public Vanguard(ArrayList<String>stats,ArrayList<String>abilities){
    super(stats,abilities);

  }
  public void displayStats(){
    stats.add("HP: 125");
    stats.add("Atk: 85");
    stats.add("Spd: 50");
    stats.add("Def: 95");
    stats.add("Res: 65");
    for(String i:stats){
      System.out.println(i);
    }
  }
  public void displayAbilities(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please select from one of the following attack abilities to acquire:\n"
                   + "* Shield Rush\n"
                   + "* Wild Down\n"
                   + "* Spiral Blow"
                  );
    String attackInput=sc.nextLine();
    abilities.add(attackInput);
    System.out.println("Select from one of the following self-buff abilities:\n"
                      + "* Grand Protection\n"
                      + "* Protective Wall\n"
                      + "* Counterstrike");
    String buffInput=sc.nextLine();
    abilities.add(buffInput);
     System.out.println("Select from one of the following ultimate abilities:\n"
                      + "* Paragon Shield\n"
                      + "* Parselstrike\n"
                      + "* Glowing Ember");
    String ultimateInput=sc.nextLine();
    abilities.add(ultimateInput);
    System.out.println("The selected abilities are the following: "+abilities);
    sc.close();
}
}
