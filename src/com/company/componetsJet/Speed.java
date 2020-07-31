package com.company.componetsJet;

import javax.swing.*;

public class Speed {
    /**
     * Mais uma das caracteristicas do Avião que mostra a Velocidade dele.
     * Esta classe pega a velocidade dele em mach e km/h .
     * Ex SpeedMax 2410 km/h,CruiseSpeed 1960 km/h,MachSpeedMax 2.25 M,CruiseSpeedMach 1.58 M.
     */
    private final int SpeedMax;
    private final int CruiseSpeed;
    private final double MachSpeedMax;
    private final double CruiseSpeedMach;
    public Speed(int speedMax, int cruiseSpeed, double cruiseSpeedMach, double machSpeedMax){
        this.CruiseSpeed = cruiseSpeed;
        this.CruiseSpeedMach = cruiseSpeedMach;
        this.SpeedMax =speedMax;
        this.MachSpeedMax = machSpeedMax;
    }

    public int getSpeedMax() {
        return SpeedMax;
    }

    public int getCruiseSpeed() {
        return CruiseSpeed;
    }

    public double getMachSpeedMax() {
        return MachSpeedMax;
    }

    public double getCruiseSpeedMach() {
        return CruiseSpeedMach;
    }
}
