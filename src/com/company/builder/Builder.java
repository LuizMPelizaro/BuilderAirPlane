package com.company.builder;
import com.company.airPlane.Type;
import com.company.componetsJet.CargoMax;
import com.company.componetsJet.Engine;
import com.company.componetsJet.Radar;
import com.company.componetsJet.Speed;

public interface Builder {
    /**
     * A interface do Buider define todas as formas de configura o produto
     */
    void setType(Type type);
    void setSeats(int number);
    void setEngine(Engine engine);
    void setRadar(Radar radar);
    void setCargoMax(CargoMax cargoMax);
    void setSpeed(Speed speed);
}
