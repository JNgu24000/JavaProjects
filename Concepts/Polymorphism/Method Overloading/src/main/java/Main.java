class Main {
  public static void main(String[] args) {
   //creating a guitar object, calling it g
  Guitar g = new Guitar();
  System.out.println(g.bass(12));
  System.out.println(g.bass(4,"deep sounds!"));
  System.out.println(g.bass(9,"clanging sounds",30));
  }
}