package md.orange.methodstask;

import java.sql.SQLOutput;

public class ExecutionService {
    public static void main(String[] args) {

        int randomInt = DataGeneratorUtil.getRandomInt(100, 300);
        System.out.println("Variabila RandomInt " + randomInt);

        int randomInt1 = DataGeneratorUtil.getRandomInt(150);
        System.out.println("Variabila RandomInt " + randomInt1);

        double randomDouble2 = DataGeneratorUtil.getRandomDouble(15.5);
        System.out.println("Variabila RandomInt " + randomDouble2);
        System.out.println("Random boolean: " + DataGeneratorUtil.getRandomBoolean());

        System.out.println("Random email 1: " + DataGeneratorUtil.getRandomEmail());
        System.out.println("Random email 2: " + DataGeneratorUtil.getRandomEmail());

        System.out.println("Random String de X chars " + DataGeneratorUtil.generateRandomString(5));


        Customer Vlada = new Customer("Vlada", 22, "vlada.01,lungu@gmail.com");
        System.out.println("Nume obiectului este " + Vlada.getName() + " are varsta de " + Vlada.getAge() + " si are email-ul: " + Vlada.getEmail());
        Vlada.setName("Ionela");
        Vlada.setAge(25);
        Vlada.setEmail("risul@gmail.com");
        System.out.println("Nume obiectului este " + Vlada.getName() + " are varsta de " + Vlada.getAge() + " si are email-ul: " + Vlada.getEmail());

        Customer randomDataCustomer = new Customer(DataGeneratorUtil.generateRandomString(12), DataGeneratorUtil.getRandomInt(127),
                DataGeneratorUtil.getRandomEmail());

        System.out.println(randomDataCustomer.toString());

        randomDataCustomer.setName(DataGeneratorUtil.generateRandomString(6));
        System.out.println(randomDataCustomer.toString());
    }

}
