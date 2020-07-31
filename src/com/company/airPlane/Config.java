package com.company.airPlane;

import com.company.componetsJet.CargoMax;
import com.company.componetsJet.Engine;
import com.company.componetsJet.Radar;
import com.company.componetsJet.Speed;

public class Config {
    /**
     * A config é outro produto .
     * Observe que ele não tem os mesmo ancestrais que um avião,isso mostra q eles nao estao relacionados
    */
    private final Type type;
    private final int seats;
    private  final Engine engine;
    private final Radar radar;
    private  final CargoMax cargoMax;
    private final Speed speed;
    public Config(Type type,int seats,Engine engine,Radar radar,
                  CargoMax cargoMax,Speed speed){
        this.type =type;
        this.seats =seats;
        this.cargoMax =cargoMax;
        this.radar = radar;
        this.engine = engine;
        this.speed = speed;
    }
    public String print(){
        String info = "";
        info  += "Tipo de avião : "+ type + "\n";
        info  += "Quantidade de assentos : "+seats+ "\n";
        info  += "Motor "+ engine.getTypeEngine() +" modelo "+ engine.getEngineModel()+"\n";
        info  += "Velocidade de cruseiro: "+speed.getCruiseSpeed()+" km/h\n";
        info  += "Velocidade de cruseiro em Mach: " + speed.getCruiseSpeedMach()+" M\n";
        info  += "Velocidade Maxima: "+ speed.getSpeedMax()+" Km/h\n";
        info  += "Velocidade Maxima em Mach : " + speed.getMachSpeedMax()+" M\n";
        info  += "Peso sem carga : "+ cargoMax.getEmptyWeight() +" KG \n";
        info  += "Peso Carregado : "+ cargoMax.getLoadedWeight() + " Kg\n";
        info  += "Peso Maximo de decolagem :"+cargoMax.getMaxTakeoff()+" Kg\n";
        if(this.radar.equals("N/A")){
            info += "Radar : Não ha radar";
        }
        else{
            info += "Radar : "+radar.getRadar();
        }
        return info;
    }
}
