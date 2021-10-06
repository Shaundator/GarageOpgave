package Projekt;

public abstract class Bil{
    String regNr;
    String mærke;
    String model;
    String årgang;
    int antalDøre;

    public Bil(String regNr, String mærke, String model, String årgang, int antalDøre){
        this.regNr=regNr;
        this.mærke=mærke;
        this.model=model;
        this.årgang=årgang;
        this.antalDøre=antalDøre;
    }

    public abstract double beregnGrønEjerafgift();


    public String toString(){
        return "\n\nReg NR: " + regNr +
                "\nMærke: " + mærke +
                "\nModel: " + model +
                "\nÅrgang: " + årgang +
                "\nAntal Døre: " + antalDøre;
    }



}
