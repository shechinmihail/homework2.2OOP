package Task3;

public class Car {

    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
    }

    @Override
    public String toString() {
        return "Aвтомобиль " +
                "Марка " + brand + '\'' +
                ", Модель " + model + '\'' +
                ", Объем двигателя в литрах " + engineVolume +
                ", Цвет кузова " + color + '\'' +
                ", год производства " + productionYear +
                ", страна сборки " + productionCountry;
    }
}
