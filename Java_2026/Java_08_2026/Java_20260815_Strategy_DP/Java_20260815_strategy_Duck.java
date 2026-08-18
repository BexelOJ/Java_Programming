public abstract class Java_20260815_strategy_Duck {

    Java_20260815_strategy_FlyBehavior flyBehavior;

    Java_20260815_strategy_SoundBehavior soundBehavior;

    public void performFly() {
        flyBehavior.fly();
    }

    public void performSound() {
        soundBehavior.sound();
    }

}



