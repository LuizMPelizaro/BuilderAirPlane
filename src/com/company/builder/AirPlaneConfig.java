package com.company.builder;

import com.company.airPlane.Config;
import com.company.airPlane.Type;
import com.company.componetsJet.CargoMax;
import com.company.componetsJet.Engine;
import com.company.componetsJet.Radar;
import com.company.componetsJet.Speed;

public class AirPlaneConfig implements Builder{
    /**
     * Ao contrário de outros design patterns , o Buider pode construir produtos não relacionas , que não tem a interface comum
     * Neste caso ,foi construido uma configuração para um aviao mostrando dados como , motores , radar velocidade...
     * Esse "manual" configuração foi construida usando os mesmos passos que foram utilizado para construiro avião
     * Isso permite produziz configurações para aviões especificos , configurando com distintas caracteristicas .
     * */
    private Type type;
    private  int seats;
    private Engine engine;
    private Radar radar;
    private  CargoMax cargomax;
    private Speed speed;

    @Override
    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setRadar(Radar radar) {
        this.radar = radar;
    }

    @Override
    public void setCargoMax(CargoMax cargoMax) {
        this.cargomax = cargoMax;
    }

    @Override
    public void setSpeed(Speed speed) {
        this.speed = speed;
    }

    public Config getResult() {
        return new Config(type, seats, engine, radar, cargomax,speed);
    }

}
