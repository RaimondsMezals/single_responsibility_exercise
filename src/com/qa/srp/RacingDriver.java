package com.qa.srp;


public class RacingDriver {

    private int milesDriven;

    public int getMilesDriven() {
        return milesDriven;
    }

    public void setMilesDriven(int milesDriven) {
        this.milesDriven = milesDriven;
    }

    // the functionality for driving a car should be the responsibility
    // of whoever is driving it - not the car itself!
    public void drive(Car car) {
        car.setMileage(car.getMileage() + this.getMilesDriven());
    }

}
