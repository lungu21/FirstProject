package md.orange.zooclubservice;

public class Dog extends Animal implements AnimalInterface {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + "eats bones");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says Ham Ham");
    }
}
