package com.company.componetsJet;

public class CargoMax {
    /**
     * Uma das caracteristicas do Avião que é a o peso dele.
     * Esta classe pega o pesso dele vazio , cheio , e o peso maximo que ele consegue decolar.
     * Ex: EmptyWeight : 90.000 kg, LoadedWeight 180.000 kg , MaxTakeoff 185.000 kg
     *
     */
    private final int EmptyWeight;
    private final int LoadedWeight;
    private final int MaxTakeoff;
    public CargoMax(int emptyWeight,int loadedWeight,int maxTakeoff){
        this.EmptyWeight = emptyWeight;
        this.LoadedWeight = loadedWeight;
        this.MaxTakeoff = maxTakeoff;
    }

    public int getEmptyWeight() {
        return EmptyWeight;
    }

    public int getLoadedWeight() {
        return LoadedWeight;
    }

    public int getMaxTakeoff() {
        return MaxTakeoff;
    }
}
