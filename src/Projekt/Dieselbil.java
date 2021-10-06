package Projekt;

public class Dieselbil extends Bil {
    boolean harPartikelfilter;
    double kmPrL;

    public Dieselbil(String regNr, String mærke, String model, String årgang, int antalDøre, boolean harPartikelfilter, double kmPrL){
        super(regNr, mærke, model, årgang, antalDøre);
        this.harPartikelfilter=harPartikelfilter;
        this.kmPrL=kmPrL;
    }

    @Override
    public double beregnGrønEjerafgift() {
        double result = 0;
        if(50 >= kmPrL && kmPrL>= 20){
            result = 130;
        }
        else if(20 >= kmPrL && kmPrL >= 15){
            result = 1390;
        }
        else if(15 >= kmPrL && kmPrL >= 10){
            result = 1850;
        }
        else if(10 > kmPrL && kmPrL > 5){
            result = 2770;
        }
        else if(5 > kmPrL){
            result = 15260;
        }

        if(harPartikelfilter){
            result += 1000;
            return result;
        }
        else{
            return result;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nDieselbil" +
                "\nPartikelfilter: " + harPartikelfilter +
                "\nKmPrL=" + kmPrL;
    }
}
