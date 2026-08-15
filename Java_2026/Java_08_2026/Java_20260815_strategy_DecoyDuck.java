public class Java_20260815_strategy_DecoyDuck extends Java_20260815_strategy_Duck {
	    public Java_20260815_strategy_DecoyDuck() {
        System.out.println("\nDecoy Duck Fly : ");
        flyBehavior = new Java_20260815_strategy_FlyNoWay();
        System.out.println("Decoy Duck Sound : ");
        soundBehavior = new Java_20260815_strategy_SoundWithMuteQuack();
    }
}


