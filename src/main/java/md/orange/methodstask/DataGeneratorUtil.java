package md.orange.methodstask;

import java.util.Random;
import java.util.UUID;

public class DataGeneratorUtil {

    private static Random random = new Random();

    public static int getRandomInt(int min, int max) {
        if (min >= max) {
            System.out.println("Valoarea minima trebuie sa fie mai mica ca cea maxima");
            return 0;
        }

        int delta = max - min; //150-1 = 50
        int deltaRandomInt = random.nextInt(delta);
        int numberAliator = deltaRandomInt + min;  //50 + 50(min) = 100

        return numberAliator;
    }


    public static int getRandomInt(int limit) {
        return random.nextInt(limit);

    }

    public static double getRandomDouble(double limit) {
        if (limit <= 0) {
            System.out.println("Limita trebuie sa fie pozitiva");
            return 0;
        }
        return random.nextDouble() * limit;

    }

    public static boolean getRandomBoolean(){
        return random.nextBoolean();

    }

    public static String getRandomEmail(){
        String uuid = UUID.randomUUID().toString();
        String domain = "@mailinator.com";
        return uuid + domain;
    }
    public static String generateRandomString(int lenght){
        String acceptedChars = "ABCDEFGHIJKLMNOPQRSTQWXYZabcdefghijlkmnopqrstwxyz123456789";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < lenght; i++){
            int randomIndex = getRandomInt(acceptedChars.length());
            stringBuilder.append(acceptedChars.charAt(randomIndex));
            System.out.println("In iteratia i= " +i + " caracterul alipit este "+ acceptedChars.charAt(randomIndex));

        }
        return stringBuilder.toString();
    }





}
