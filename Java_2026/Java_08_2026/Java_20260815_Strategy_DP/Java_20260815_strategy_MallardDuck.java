public class Java_20260815_strategy_MallardDuck extends Java_20260815_strategy_Duck {

    public Java_20260815_strategy_MallardDuck() {
        System.out.println("\nMallard Duck Fly : ");
        flyBehavior = new Java_20260815_strategy_FlyWithWings();
        System.out.println("Mallard Duck Sound : ");
        soundBehavior = new Java_20260815_strategy_SoundWithQuack();
    }
    
}



