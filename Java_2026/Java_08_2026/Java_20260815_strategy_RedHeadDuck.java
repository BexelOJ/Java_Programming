public class Java_20260815_strategy_RedHeadDuck extends Java_20260815_strategy_Duck {

    public Java_20260815_strategy_RedHeadDuck() {
        System.out.println("\nRedHead Duck Fly : ");
        flyBehavior = new Java_20260815_strategy_FlyWithWings();
        System.out.println("_RedHead Duck Sound : ");
        soundBehavior = new Java_20260815_strategy_SoundWithQuack();
    }

}




