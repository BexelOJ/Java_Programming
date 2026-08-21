public class Java_20260818_adapter_TurkeyAdapter implements Java_20260818_adapter_Duck {

    private Java_20260818_adapter_Turkey turkey;

    public Java_20260818_adapter_TurkeyAdapter(Java_20260818_adapter_Turkey turkey) {
        this.turkey = turkey;
    }

    //---------------------------------------------------
    // Duck interface
    //---------------------------------------------------

    @Override
    public void quack() {

        turkey.gobble();
    }

    @Override
    public void fly() {

        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}

