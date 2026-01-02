// Interface definition (can be in same file)
interface Barkable {
    void bark();  // Abstract method - Dog must implement
}

// Dog implements the interface
class Dog implements Barkable {
    String name;
    
    public Dog(String name) {
        this.name = name;
    }
    
    // MUST implement all interface methods
    public void bark() {
        System.out.println(name + " says: Woof! Woof!");
    }
    
    void eat() {
        System.out.println(name + " is eating.");
    }
}

class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy");
        myDog.bark();  // Interface method
        myDog.eat();   // Dog's own method
    }
}
