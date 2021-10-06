package Projekt;

public class Elbil extends Bil {
    double batterikapacitetkWh;
    double maxKm;
    double whPrKm;

    public Elbil(String regNr, String mærke, String model, String årgang, int antalDøre, double batterikapacitetkWh, double maxKm, double whPrKm){
        super(regNr, mærke, model, årgang, antalDøre);
        this.batterikapacitetkWh=batterikapacitetkWh;
        this.maxKm=maxKm;
        this.whPrKm=whPrKm;
    }

    public double getWhPrKmTokmPrL(){
        double result;
        result = (whPrKm/91.25);
        result = (result/100);
        return result;
    }


    @Override
    public double beregnGrønEjerafgift() {
        double kmPrL = getWhPrKmTokmPrL();
        double result = 0;
        if(50 >= kmPrL && kmPrL>= 20){
            result = 300;
        }
        else if(20 >= kmPrL && kmPrL >= 15){
            result = 1050;
        }
        else if(15 >= kmPrL && kmPrL >= 10){
            result = 2340;
        }
        else if(10 > kmPrL && kmPrL > 5){
            result = 5500;
        }
        else if(5 > kmPrL){
            result = 10470;
        }
        return result;
    }

    @Override
    public String toString() {
        return super.toString() + "\nElbil" +
                "\nBatterikapacitet kWh: " + batterikapacitetkWh +
                "\nMaxKm: " + maxKm +
                "\nWhPrKm: " + whPrKm;
    }
}
