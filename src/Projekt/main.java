package Projekt;

import java.util.Locale;
import java.util.Scanner;

public class main {
    static Scanner scText = new Scanner(System.in);
    static Scanner scNum = new Scanner(System.in);
    static Scanner scDob = new Scanner(System.in);
    static Garage garage = new Garage();


    public static void main(String[] args) {
        System.out.println("Commands:add,list,listtotal,price,pricetotal,quit");
        while (true) {
            System.out.println("Write a command");
            String choice = scText.nextLine().toLowerCase();
            switch (choice) {
                case "add":
                    add();
                    break;
                case "list":
                    list();
                    break;
                case "listtotal":
                    listTotal();
                    break;
                case "price":
                    price();
                    break;
                case "pricetotal":
                    priceTotal();
                    break;
                case "help":
                    help();
                    break;
                case "quit":
                    quit();
                    break;
                default:
                    System.out.println("Findes ikke");
                    break;
            }
        }
    }

    public static void add(){
        System.out.println("Hvilken slags bil?\nBenzin\nDiesel\nEl");
        String carChoice = scText.nextLine().toLowerCase();
        switch(carChoice){
            case "benzin":
                benzin();
                break;
            case "diesel":
                diesel();
                break;
            case "el":
                el();
                break;
            default:
                System.out.println("invalid");
                return;
        }
        System.out.println("Din bil er nu tilføjet til garagen");
    }
    public static void benzin(){
        System.out.println("Reg Nr: ");
        String regNr = scText.nextLine();
        System.out.println("Mærke: ");
        String mærke = scText.nextLine();
        System.out.println("Model: ");
        String model = scText.nextLine();
        System.out.println("År: ");
        String år = scText.nextLine();
        System.out.println("Antal Døre: ");
        int døre = scText.nextInt();
        System.out.println("Okt Antal: ");
        int okt = scNum.nextInt();
        System.out.println("kmPrL: ");
        double kmPrL = scDob.nextDouble();
        garage.tilføjBil(new Benzinbil(regNr,mærke,model,år,døre,okt,kmPrL));

    }
    public static void diesel(){
        System.out.println("Reg Nr: ");
        String regNr = scText.nextLine();
        System.out.println("Mærke: ");
        String mærke = scText.nextLine();
        System.out.println("Model: ");
        String model = scText.nextLine();
        System.out.println("År: ");
        String år = scText.nextLine();
        System.out.println("Antal Døre: ");
        int døre = scText.nextInt();
        System.out.println("Partikel Generator?");
        boolean partikel = false;
        boolean invalid = true;
        while(invalid){
            switch(scText.nextLine().toLowerCase()) {
            case "ja":
                partikel = true;
                invalid = false;
                break;
            case "nej":
                partikel = false;
                invalid = false;
                break;
                default:
                    System.out.println("invalid");
            }
        }
        System.out.println("kmPrL: ");
        double kmPrL = scDob.nextDouble();
        garage.tilføjBil(new Dieselbil(regNr,mærke,model,år,døre,partikel,kmPrL));
    }
    public static void el(){
        System.out.println("Reg Nr: ");
        String regNr = scText.nextLine();
        System.out.println("Mærke: ");
        String mærke = scText.nextLine();
        System.out.println("Model: ");
        String model = scText.nextLine();
        System.out.println("År: ");
        String år = scText.nextLine();
        System.out.println("Antal Døre: ");
        int døre = scText.nextInt();
        System.out.println("BatterikapacitetkWh: ");
        double batteri = scDob.nextDouble();
        System.out.println("Max KM: ");
        double maxKm = scDob.nextDouble();
        System.out.println("WhPrKm: ");
        double whPrKm = scDob.nextDouble();
        garage.tilføjBil(new Elbil(regNr,mærke,model,år,døre,batteri,maxKm,whPrKm));
    }
    public static void list(){
        System.out.println("angiv regNr: ");
        String regSearch = scText.nextLine().toLowerCase();
        for(int i = 0; i < garage.biler.size(); i++){
            if(regSearch.equalsIgnoreCase(garage.biler.get(i).regNr)){
                System.out.println(garage.biler.get(i).toString());
                return;
            }
        }
        System.out.println("Findes ikke man");
    }
    public static void listTotal(){
        System.out.println(garage.biler);
    }
    public static void price() {
        System.out.println("angiv regNr: ");
        String regSearch = scText.nextLine().toLowerCase();
        for (int i = 0; i < garage.biler.size(); i++) {
            if (regSearch.equalsIgnoreCase(garage.biler.get(i).regNr)) {
                System.out.println("Prisen er: " + garage.biler.get(i).beregnGrønEjerafgift() + "kr.");
                return;
            }
        }
        System.out.println("Findes ikke man");
    }
    public static void priceTotal() {
        garage.beregnGrønAfgiftBilpark();
    }
    public static void help(){
        System.out.println("Commands:add,list,listtotal,price,pricetotal,quit");
    }
    public static void quit(){
        System.out.println("Bye bye");
        System.exit(0);
    }
}
