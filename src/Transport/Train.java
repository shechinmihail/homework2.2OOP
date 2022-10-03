package Transport;

import java.time.LocalDate;

public class Train extends Transport {
    private double tripPrice;
    private int travelTime;
    private String departureStationName;
    private String endingStation;
    private int numberOfWagons;

    public Train(String brand, String model, int productionYear, String productionCountry, int maxMovementSpeed, double tripPrice,
                 int travelTime, String departureStationName, String endingStation, int numberOfWagons) {
        super(brand, model, productionYear, productionCountry, maxMovementSpeed);
        this.tripPrice = tripPrice;
        this.travelTime = travelTime;
        this.departureStationName = departureStationName;
        this.endingStation = endingStation;
        this.numberOfWagons = numberOfWagons;
    }

    public double getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(double tripPrice) {
        this.tripPrice = tripPrice;
    }

    public int getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(int travelTime) {
        this.travelTime = travelTime;
    }

    public String getDepartureStationName() {
        return departureStationName;
    }

    public void setDepartureStationName(String departureStationName) {
        this.departureStationName = departureStationName;
    }

    public String getEndingStation() {
        return endingStation;
    }

    public void setEndingStation(String endingStation) {
        this.endingStation = endingStation;
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        this.numberOfWagons = numberOfWagons;
    }

    @Override
    public void refill() {
        System.out.println("двигатель дизельный, заправляй дизельным топливом!");
    }
}


