package strategy;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
        model.performQuack();
        model.setQuackBehavior(new Squeak());
        model.performQuack();
        model.setQuackBehavior(new MuteQuack());
        model.performQuack();
    }
}
