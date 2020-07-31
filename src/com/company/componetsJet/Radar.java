package com.company.componetsJet;

public class Radar {
    /**
     * Mais uma das caracteristicas do Avião que é o Radar dele.
     * Esta classe pega o tipo de radar que ele tem .
     * Ex Radar : AN/APG-77.
     */
    private final String Radar;
    public Radar (String radar){
        this.Radar = radar;
    }

    public String getRadar() {
        return Radar;
    }
}
