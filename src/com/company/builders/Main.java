package com.company.builders;

import com.company.airPlane.*;
import com.company.builder.*;
import com.company.director.*;

import  java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        /**
         * classe de testes
         */
        Scanner sc1 = new Scanner(System.in);
        Director director = new Director();
        AirPlaneBuilder builder = new AirPlaneBuilder();
        AirPlaneConfig configBuider = new AirPlaneConfig();
        int option = 0;
        while (option >= 0 && option <= 4) {
            System.out.println("Escreva o tipo de aviao que deseja construir" +
                    "\n1-Avião militar\n2-Avião de carga\n3-Avião de passageiros\n4-Sair");
            option = sc1.nextInt();
            switch (option) {
                case 1:
                    director.constructMilitaryJet(builder);
                    AirPlane airPlane = builder.getResult();
                    director.constructMilitaryJet(configBuider);
                    Config configMilitary = configBuider.getResult();
                    System.out.println("Avião construido : " + airPlane.getType() + "\n");
                    System.out.println("\nConfiguração do avião :\n" + configMilitary.print());
                    break;
                case 2:
                    director.constructCargoPlane(builder);
                    AirPlane airPlane2 = builder.getResult();
                    director.constructCargoPlane(configBuider);
                    Config configCargoPlan = configBuider.getResult();
                    System.out.println("Avião construido : " + airPlane2.getType() + "\n");
                    System.out.println("Configuração do avião :" + configCargoPlan.print());
                    break;
                case 3:
                    director.constructCargoPlane(builder);
                    AirPlane airPlane3 = builder.getResult();
                    director.constructBusinessJet(configBuider);
                    Config configBusinessJet = configBuider.getResult();
                    System.out.println("Avião construido : " + airPlane3.getType());
                    System.out.println("Configuração do avião :\n" + configBusinessJet.print() + "\n");
                    break;
                case 4:
                    System.out.println("Encerrando");
                    break;
            }
        }
    }
}