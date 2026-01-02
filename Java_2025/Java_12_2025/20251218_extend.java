class Animal {
    String name;
    void eat() { 
        System.out.println(name + " is eating"); 
    }
}

class Dog extends Animal {  // Dog IS-A Animal
    void bark() { 
        System.out.println(name + " barks!"); 
    }
}

class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Buddy";
        dog.eat();  // Inherited from Animal
        dog.bark(); // Dog's own method
    }
}





