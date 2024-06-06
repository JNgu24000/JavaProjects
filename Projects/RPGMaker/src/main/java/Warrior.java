import java.util.Scanner;
import java.util.ArrayList;

class Warrior extends Hero implements Class{

  public Warrior(ArrayList<String>stats,ArrayList<String>abilities){
    super(stats,abilities);

  }
  public void displayStats(){
    stats.add("HP: 95");
    stats.add("Atk: 95");
    stats.add("Spd: 75");
    stats.add("Def: 75");
    stats.add("Res: 50");
    for(String i:stats){
      System.out.println(i);
    }
  }
  public void displayAbilities(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please select from one of the following attack abilities to acquire:\n"
                   + "* Smash\n"
                   + "* Hatchet Man\n"
                   + "* War Strike"
                  );
    String attackInput=sc.nextLine();
    abilities.add(attackInput);
    System.out.println("Select from one of the following self-buff abilities:\n"
                      + "* Fury\n"
                      + "* Defense Breaker\n"
                      + "* Wild Abandon");
    String buffInput=sc.nextLine();
    abilities.add(buffInput);
     System.out.println("Select from one of the following ultimate abilities:\n"
                      + "* Raging Storm\n"
                      + "* Berserker's Barrage\n"
                      + "* Piercing Edge");
    String ultimateInput=sc.nextLine();
    abilities.add(ultimateInput);
    System.out.println("The selected abilities are the following: "+abilities);
    sc.close();
}
}
