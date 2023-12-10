package md.orange.exceptionservicetask;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //  int result = ArithmeticOperatorService.devideIntWithExceptionHandling(10,0 );
        //System.out.println(result);
        //System.out.println("The programme is running till the end") ;

        // String stringValue = "Vlada";
        //String stringValue2 = null;
        //System.out.println(TestManager.getTheTextLenghtWithTryCatchFinally(stringValue2));
        //System.out.println(TestManager.getTheTextLenght(stringValue));
        //System.out.println(TestManager.getTheTextLenghtIfElse(stringValue2));

        String filePath = "src/main/java/md/orange/exceptionservicetask/text4.txt";
        try {
            ReadDataManager.readDataFromFileWithoutTryAndCatch(filePath);
        } catch (IOException exceptionObject) {
            System.out.println("The file does not exist");
        } finally{
            System.out.println("This block is always executed");
        }
        System.out.println("The programme is running");
        ReadDataManager.readDataFromFileWithTryAndCatch(filePath);
        }
    }

