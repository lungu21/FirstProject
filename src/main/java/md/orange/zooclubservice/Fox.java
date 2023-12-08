package md.orange.zooclubservice;


public class Fox extends Animal implements AnimalInterface {

        public Fox(String name) {
            super(name);
        }

        @Override
        public void eat() {
            System.out.println(getName() + "eats chicken");
        }

        @Override
        public void makeSound() {
            System.out.println(getName() + " says pss pss");
        }
    }






