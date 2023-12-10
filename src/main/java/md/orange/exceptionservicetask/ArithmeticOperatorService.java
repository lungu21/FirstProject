package md.orange.exceptionservicetask;

public class ArithmeticOperatorService {

    public static int divideInt (int a, int b){
        return a/b;
    }

    public static int devideIntWithExceptionHandling(int a, int b){
try {
    int result = a / b;
    return result;
}
catch (Exception capturedException){
    System.out.println("An exception has occured: "+ capturedException.getMessage());
    return 0;

}




    }
}
