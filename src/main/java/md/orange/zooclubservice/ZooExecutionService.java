package md.orange.zooclubservice;

public class ZooExecutionService {
    public static void main(String[] args) {
        Animal garikDog = new Dog("Garik");
        Animal kipceak = new Dog("Kipceak");
        System.out.println("Numele cainelui este " + garikDog.getName());
        garikDog.setName("Vadim");
        System.out.println("Acum numele este " +garikDog.getName());

         garikDog.eat();
         //AnimalInterface kipceakDog = new Dog("Kipceak");
         //kipceakDog.makeSound();
        kipceak.makeSound();

    }

}
