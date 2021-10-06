package Projekt;

import java.util.ArrayList;

public class Garage {
    ArrayList<Bil> biler = new ArrayList<>();

    public void tilføjBil(Bil bil){
        biler.add(bil);
    }

    public void beregnGrønAfgiftBilpark(){
        double result = 0;
        for(int i = 0; i < biler.size(); i++ ){
            result = result + biler.get(i).beregnGrønEjerafgift();
        }
        System.out.println("Den samlede udgift er " + result + "kr.");
    }


    @Override
    public String toString() {
        return "Garage:\n" +
                "Biler:\n" + biler;
    }
}
