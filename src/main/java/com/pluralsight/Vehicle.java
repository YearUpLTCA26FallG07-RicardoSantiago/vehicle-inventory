package com.pluralsight;

public class Vehicle {


        private long vehicleid;
        private String makeModel;
        private String color;
        private int odometerReading;
        private double price;

        public Vehicle(long vehicleid, String makeModel, String color, int odometerReading, double price) {
            this.vehicleid = vehicleid;
            this.makeModel = makeModel;
            this.color = color;
            this.odometerReading = odometerReading;
            this.price = price;
        }

    public long getVehicleid() {
        return vehicleid;
    }

    public void setVehicleid(long vehicleid) {
        this.vehicleid = vehicleid;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getOdometerReading() {
        return odometerReading;
    }

    public void setOdometerReading(int odometerReading) {
        this.odometerReading = odometerReading;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Vehicle ID: " + vehicleid +
                ", Make/Model: " + makeModel +
                ", Color: " + color +
                ", Odometer: " + odometerReading +
                ", Price: $" + price;
    }
}
