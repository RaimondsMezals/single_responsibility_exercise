package com.qa.srp;


public class Runner {

    public static void main(String[] args) {

        Car tesla = new Car("black", "cybertruck", 1000);
        RacingDriver lewisHamilton = new RacingDriver();
        Mechanic mod = new Mechanic();

        lewisHamilton.setMilesDriven(500);
        lewisHamilton.drive(tesla);
        

        System.out.println(tesla.getMileage());
        System.out.println(mod.getTyreType());

    }

}
