package Projekt;

public class Benzinbil extends Bil {
    private int oktantal;
    private double kmPrL;

    public Benzinbil(String regNr, String mærke, String model, int   årgang, int antalDøre, int oktantal, double kmPrL) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.oktantal = oktantal;
        this.kmPrL = kmPrL;
    }



    @Override
    public double beregnGrønEjerafgift() {
        double result = 0;
        if (50 >= kmPrL && kmPrL >= 20) {
            result = 300;
        } else if (20 >= kmPrL && kmPrL >= 15) {
            result = 1050;
        } else if (15 >= kmPrL && kmPrL >= 10) {
            result = 2340;
        } else if (10 > kmPrL && kmPrL > 5) {
            result = 5500;
        } else if (5 > kmPrL) {
            result = 10470;
        }
        return result;
    }

    @Override
    public String toString() {
        return super.toString() + "\nBenzinbil\n" +
                "Oktantal: " + oktantal +
                "\nkmPrL: " + kmPrL;
    }
}