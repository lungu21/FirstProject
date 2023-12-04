package md.orange.classesandobjects.autoservicetask;

public class Car {
    long km;
    String gearType;
    String make;
    String model;
    int productionYear;
    double carPrice;
    String fuelType;
    String colour;

    Car(String make, String model, int productionYear, String fuelType){
        this.make= make;
        this.model= model;
        this.productionYear = productionYear;
        this.fuelType = fuelType;
        System.out.println("In urma executiei acestui constructor cu 4 parametri se creeaza u nou obiect despre care nu cunoastem price, gearType,km ");

    }

    Car(String make, String model){
        this.make=make;
        this.model=model;
        System.out.println("A fost creata o masina despre care cunoastem doar marca si modelul");



    }




}
