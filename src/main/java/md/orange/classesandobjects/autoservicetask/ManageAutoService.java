package md.orange.classesandobjects.autoservicetask;

public class ManageAutoService {
    public static void main(String[] args) {
        Garage garajulLuiVlada= new Garage("Lunca Nistrului");
        garajulLuiVlada.carCapacity = 342;
        garajulLuiVlada.hasComputerDiagnostics = true;
        garajulLuiVlada.numberId = "5455";
        garajulLuiVlada.schedule = "uneori";

        System.out.println("Garajul lui Vlada are urmatoarele proprietati: Adresa "+garajulLuiVlada.adress +
                "Car Capacity: "+garajulLuiVlada.carCapacity);


        System.out.println("Adresa garajului lui Vlada este"+garajulLuiVlada.adress);
    Garage garajulLuiLidia = new Garage("Lunca Prutului");

        garajulLuiLidia.carCapacity = 344;
        garajulLuiLidia.hasComputerDiagnostics = true;
        garajulLuiLidia.numberId = "0000";
        garajulLuiLidia.schedule = "mereu";

        System.out.println("Garajul lui Lidia are urmatoarele proprietati: Adresa "+garajulLuiLidia.adress +
                "Car Capacity: "+garajulLuiLidia.carCapacity);

        System.out.println(garajulLuiLidia.adress);
Garage garajulLuiElena = new Garage(345);
        System.out.println("Capacitatea garajului elenei"+garajulLuiElena.carCapacity);
Car masinaLuiLilian = new Car("Mercedes", "GLE class",2022, "Diesel");
masinaLuiLilian.carPrice = 54000;
masinaLuiLilian.km = 100000l;
masinaLuiLilian.gearType = "Automatic";
        System.out.println("Masina lui Lilian are umaoarele proprietati: Make: "+masinaLuiLilian.make+ ", Model: "+
                masinaLuiLilian.model+" pret: "+ masinaLuiLilian.carPrice);




Tool elevator = new Tool(20555);
Tool hummer = new Tool();
Worker lucratorulGavril = new Worker();



    }
}
