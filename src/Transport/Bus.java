package Transport;

public class Bus extends Transport{
    public Bus(String brand, String model, int productionYear, String productionCountry, int maxMovementSpeed) {
        super(brand, model, productionYear, productionCountry, maxMovementSpeed);
    }

    @Override
    public void refill() {
        System.out.println("Если у твоего автомобиля двигатель бензиновый, то заправляй 95-м бензином");
        System.out.println("Если у твоего автомобиля двигатель дизельный, то заправляй дизельным топливом");
    }

}
