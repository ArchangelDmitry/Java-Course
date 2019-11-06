package com.company;

public class Andrey {
    public static void main(String[] args) {
        // Assigning a value to a variable
        long BrazilArea = 8511000;
        long AustraliaArea = 7692000;
        long PortugalArea = 92212;

        Long BrazilAreaKm = BrazilArea * 1000000;
        Long AustraliaAreaKm = AustraliaArea * 1000000;
        Long PortugalAreaKm = PortugalArea * 1000000;

        Float BrazilAreaMile = BrazilArea / 2.59f;
        Float AustraliaAreaMile = AustraliaArea / 2.59f;
        float PortugalAreaMile = PortugalArea / 2.59f;

        System.out.println("Brazil:" + " " + BrazilAreaKm + "," + BrazilAreaMile);
        System.out.println("Australia:" + " " + AustraliaAreaKm + "," + AustraliaAreaMile);
        System.out.println("Portugal:" + " " + PortugalAreaKm + "," + PortugalAreaMile);
    }
}