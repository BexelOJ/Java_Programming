class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy");
        myDog.name = "Buddy";  // Inherited from Animal
        myDog.eat();           // Animal method
        myDog.bark();          // Barkable interface
    }
}


