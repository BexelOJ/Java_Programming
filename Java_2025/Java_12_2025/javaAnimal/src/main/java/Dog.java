class Dog extends Animal implements Barkable {
    public Dog(String name) {
        this.name = name;
    }
    
    public void bark() {
        System.out.println(name + " says: Woof! Woof!");
    }
}
