import java.util.ArrayList;

class Hero{
  public ArrayList<String> stats;
  public ArrayList<String> abilities;

public Hero(ArrayList<String> stats,ArrayList<String>abilities){
  this.stats=stats;
  this.abilities=abilities;
}
public ArrayList<String>getStats(){
  return stats;
}
public ArrayList<String> getAbilities(){
  return abilities;
}
public void setStats(ArrayList<String> stats){
  this.stats=stats;
}
public void setAbilities(ArrayList<String>abilities){
  this.abilities=abilities;
  }

}
