public class Java_20260821_AF_Main {

    public static void main(String[] args) {

        Java_20260821_AF_PizzaStore nyStore = new Java_20260821_AF_NYPizzaStore();
        Java_20260821_AF_PizzaStore chicagoStore = new Java_20260821_AF_ChicagoPizzaStore();

        System.out.println();
        System.out.println("===== NEW YORK STORE =====");

        Java_20260821_AF_Pizza pizza = nyStore.orderPizza("cheese");

        System.out.println();
        System.out.println("Ordered: " + pizza);

        System.out.println();
        System.out.println("===== CHICAGO STORE =====");

        pizza = chicagoStore.orderPizza("cheese");

        System.out.println();
        System.out.println("Ordered: " + pizza);
    }
}

