public class DecoyDuck extends Duck {
    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new NonQuack();
    }

    public void display() {
        System.out.println("I'm made of wood");
    }
}
