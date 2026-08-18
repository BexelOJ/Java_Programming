public class Java_20260815_strategy_RubberDuck extends Java_20260815_strategy_Duck {
	    public Java_20260815_strategy_RubberDuck() {
        System.out.println("\nRubber Duck Fly : ");
        flyBehavior = new Java_20260815_strategy_FlyNoWay();
        System.out.println("Rubber Duck Sound : ");
        soundBehavior = new Java_20260815_strategy_SoundWithSqueak();
    }
}


