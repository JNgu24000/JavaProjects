class Main {
  public static void main(String[] args){
    Parrot parrot = new Parrot();
    parrot.fly();

    Penguin penguin = new Penguin();
    penguin.swim();
    penguin.dive();

    Duck duck = new Duck();
    duck.fly();
    duck.swim();
    duck.dive();
  }
}
