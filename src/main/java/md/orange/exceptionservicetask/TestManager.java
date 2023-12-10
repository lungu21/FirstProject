package md.orange.exceptionservicetask;

public class TestManager {
    public static int getTheTextLenght(String inputString) {
        return inputString.length();
    }


    public static int getTheTextLenghtWithTryCatchFinally(String inputString) {
        try {
            return inputString.length();
        } catch (NullPointerException capturedExceptionInTryCatchBlock) {
            System.out.println("An exception has been captured with the following message: " + capturedExceptionInTryCatchBlock.getMessage());
            return 0;
        } finally {
            System.out.println("This block is executed no matter what");
        }
    }

    public static int getTheTextLenghtIfElse(String inputString) {
        if (inputString == null) {
            return 0;
        } else {
            return inputString.length();

        }
    }
}
