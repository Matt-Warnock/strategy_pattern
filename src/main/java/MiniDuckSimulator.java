public class MiniDuckSimulator {
    public static void main(String[] arg) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();

        Duck rubber = new RubberDuck();
        rubber.display();
        rubber.performFly();
        rubber.performQuack();

        Duck decoy = new DecoyDuck();
        decoy.display();
        decoy.performFly();
        decoy.performQuack();
    }
}
