public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWing();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a Mallard Duck");
    }
}
