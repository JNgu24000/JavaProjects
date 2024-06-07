class Duck extends Bird implements Swimmer, Flyer {
  @Override
  public void fly () {
    System.out.println("Ducks can fly great distances when migrating");
  }
  public void swim () {
    System.out.println("Ducks swim by paddling their feet under the water");
  }
  public void dive () {
    System.out.println("Ducks can hold their breathe for several minutes when they dive for food");
  }
}