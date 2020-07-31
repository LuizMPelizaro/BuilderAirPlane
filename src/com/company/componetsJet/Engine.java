package com.company.componetsJet;

public class Engine {
    /**
     * Mais uma das caracteristicas do Avião que é o motor  dele.
     * Esta classe pega o tipo de motor dele e o modelo dele .
     * Ex TypeEngine : turboélices , EngineModel : Kuneztsov NK-12M.
     */
    private final String TypeEngine;
    private final String EngineModel;
    public Engine(String typeEngine,String engineModel){
        this.TypeEngine = typeEngine;
        this.EngineModel = engineModel;
    }
    public String getTypeEngine() {
        return TypeEngine;
    }

    public String getEngineModel() {
        return EngineModel;
    }
}
