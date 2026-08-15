public class Java_20260815_strategy_DuckMain {

    public static void main(String[] args) {

        Java_20260815_strategy_MallardDuck duck_mallard = new Java_20260815_strategy_MallardDuck();

        Java_20260815_strategy_RedHeadDuck duck_red = new Java_20260815_strategy_RedHeadDuck();
        
        Java_20260815_strategy_RubberDuck duck_rubber = new Java_20260815_strategy_RubberDuck();
        
	Java_20260815_strategy_DecoyDuck duck_decoy = new Java_20260815_strategy_DecoyDuck();
	
	duck_mallard.performFly();
	duck_mallard.performSound();

	duck_red.performFly();
	duck_red.performSound();

	duck_rubber.performFly();
	duck_rubber.performSound();

	duck_decoy.performFly();
	duck_decoy.performSound();

    }

}

