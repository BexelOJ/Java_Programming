public class Java_20260818_adapter_Main {

    public static void main(String[] args) {

        //---------------------------------------------------
        // Normal Duck
        //---------------------------------------------------

        Java_20260818_adapter_Duck duck = new Java_20260818_adapter_MallardDuck();

        System.out.println("Duck:");

        duck.quack();
        duck.fly();

        //---------------------------------------------------
        // Turkey
        //---------------------------------------------------

        Java_20260818_adapter_Turkey turkey = new Java_20260818_adapter_WildTurkey();

        System.out.println("\nTurkey:");

        turkey.gobble();
        turkey.fly();

        //---------------------------------------------------
        // Turkey adapted to Duck
        //---------------------------------------------------

        Java_20260818_adapter_Duck turkeyAdapter = new Java_20260818_adapter_TurkeyAdapter(turkey);

        System.out.println("\nTurkey Adapter:");

        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}

