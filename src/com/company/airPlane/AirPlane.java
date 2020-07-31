package com.company.airPlane;

import com.company.componetsJet.CargoMax;
import com.company.componetsJet.Engine;
import com.company.componetsJet.Radar;
import com.company.componetsJet.Speed;

public class AirPlane {
    /**
     * O AirPlane é uma classe de produtos.
     */
    private final Type type;
    private final int seats;
    private  final Engine engine;
    private final Radar radar;
    private  final CargoMax  cargoMax;
    private final Speed speed;
    public AirPlane(Type type, int seats, Engine engine, Radar radar,
                    CargoMax cargoMax,Speed speed){
        this.type =type;
        this.seats =seats;
        this.cargoMax = cargoMax;
        this.radar = radar;
        this.engine = engine;
        this.speed = speed;
    }

    public Type getType() {
        return type;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Radar getRadar() {
        return radar;
    }

    public CargoMax getCargoMax() {
        return cargoMax;
    }

}
