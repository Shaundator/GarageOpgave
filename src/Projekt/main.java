package Projekt;

public class main {


    public static void main(String[] args) {
        Garage garage = new Garage();
        //String regNr, String mærke, String model, String årgang, int antalDøre
        //Benzin: oktantal, kmPrL
        //Diesel: PartikelFilter?(false/true), kmPrL
        //El: batterikapacitetkWh, maxKm, whPrKm
        Bil bil1 = new Benzinbil("01","Volvo","VoltModel",2001,4,4,23);
        Bil bil2 = new Benzinbil("02","Skoda","ComeBack",2025,2,16,43);
        Bil bil3 = new Dieselbil("03","Skejs","HurtigFyr",2010,2,false,25);
        Bil bil4 = new Dieselbil("04","FamilieBil","Familia",2000,4,true,43);
        Bil bil5 = new Elbil("05","Tesla","TeslaIDK",2050,4,20000,2000,200);
        Bil bil6 = new Elbil("06","RadioBeep","BeepBeep",2012,2,15000,100,100);
        System.out.println("Tilføjer biler til garage");
        garage.tilføjBil(bil1);
        garage.tilføjBil(bil2);
        garage.tilføjBil(bil3);
        garage.tilføjBil(bil4);
        garage.tilføjBil(bil5);
        garage.tilføjBil(bil6);
        System.out.println("Udskriver garage liste");
        System.out.println(garage.biler.toString());
        System.out.println("Beregn prisen");
        System.out.println("Den samlede udgift er " + garage.beregnGrønAfgiftBilpark() + "kr.");


    }
}