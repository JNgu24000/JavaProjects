class Penguin extends Bird implements Swimmer {
  @Override
  public void swim() {
    System.out.println("Penguins are agile swimmers");
  }

  @Override
  public void dive() {
    System.out.println("Penguins can dive hundreds of feet to catch fish");
  }
}