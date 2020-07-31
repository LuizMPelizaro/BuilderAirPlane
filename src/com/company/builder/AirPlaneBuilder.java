package com.company.builder;

import com.company.airPlane.AirPlane;
import com.company.airPlane.Type;
import com.company.componetsJet.CargoMax;
import com.company.componetsJet.Engine;
import com.company.componetsJet.Radar;
import com.company.componetsJet.Speed;

public class AirPlaneBuilder implements Builder{
    /**
     * O buider implementa as etapas definidas na interface
     */
    private  Type type;
    private  int seats;
    private  Engine engine;
    private  Radar radar;
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
        this.engine =engine;
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


    public AirPlane getResult() {
        return new AirPlane(
                type,
                seats,
                engine,
                radar,
               cargomax,
                speed);
    }
}
