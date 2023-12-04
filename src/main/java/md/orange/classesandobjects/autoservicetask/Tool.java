package md.orange.classesandobjects.autoservicetask;

import java.sql.SQLOutput;

public class Tool {

    boolean needsElectricity;
    boolean isElevator;
    boolean isUsed;
    long uniqueCode;
    Tool(){
        System.out.println("A fost creat un instrument despre care nu se stie nimic");
    }

    Tool(long uniqueCode){
        this.uniqueCode = uniqueCode;
        System.out.println("A fost creat un nou intrument despre care se cunoaste doar codul");
    }




}
