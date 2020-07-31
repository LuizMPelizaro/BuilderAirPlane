package com.company.director;
import com.company.builder.Builder;
import com.company.airPlane.Type;
import com.company.componetsJet.CargoMax;
import com.company.componetsJet.Engine;
import com.company.componetsJet.Radar;
import com.company.componetsJet.Speed;


public class Director {
    /**
     * O diretor define as ordem das etapas de construção.
     * Ele funciona com um objeto contrutor atraves da interface comum do construtor.
     * Portanto , ele pode não saber que o produto esta sendo construido.
     */
    public void constructMilitaryJet(Builder builder){
        builder.setType(Type.MilitaryJet);
        builder.setSeats(1);
        builder.setEngine(new Engine("Turbofans","Saturn/Lyulka AL-41F1S"));
        builder.setSpeed(new Speed(2400,1250,1.1,2.25));
        builder.setCargoMax(new CargoMax(18400 ,25300,34500));
        builder.setRadar(new Radar("Phazotron Zhuk-AE"));
    }
    public void constructCargoPlane(Builder builder){
        builder.setType(Type.CargoAirPlane);
        builder.setSeats(6);
        builder.setEngine(new Engine("Turbofans","Ivchenko-Progress D-18T"));
        builder.setSpeed(new Speed(850,800,0.64,0.68));
        builder.setCargoMax(new CargoMax(285000,640000,640000));
        builder.setRadar(new Radar("N/A"));
    }
    public void constructBusinessJet(Builder builder){
        builder.setType(Type.BusinessJet);
        builder.setSeats(855);
        builder.setEngine(new Engine("Turbofans","GP7270"));
        builder.setSpeed(new Speed(970,910,0.73,0.78));
        builder.setCargoMax(new CargoMax(276800,560000,575000));
        builder.setRadar(new Radar("N/A"));
    }
}
