package Transport;


import java.time.LocalDate;

public class Car {

    private final String brand;
    private final String model;
    double engineVolume;
    String color;
    private final int productionYear;
    private final String productionCountry;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean summerTires;

    private Key key;

    private Insurance insurance;

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry,
               String transmission, String bodyType, String registrationNumber, int numberOfSeats, boolean summerTires, Key key,
               Insurance insurance) {
        if (brand == null) {
            this.brand =
                    "default";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (engineVolume == 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (productionYear == 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        if (productionCountry == null) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }
        if (transmission == null || transmission.isEmpty() || transmission.isBlank()) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
        if (bodyType == null || bodyType.isEmpty() || bodyType.isBlank()) {
            this.bodyType = "Любой тип кузова";
        } else {
            this.bodyType = bodyType;
        }

        if (registrationNumber != null && registrationNumber.isEmpty() && registrationNumber.isBlank()) {
            this.registrationNumber = "некорректный номер";
        } else {
            this.registrationNumber = registrationNumber;
        }
        if (numberOfSeats <= 0) {
            this.numberOfSeats = 2;
        } else {
            this.numberOfSeats = numberOfSeats;
        }
        this.summerTires = true;
        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
        if (insurance == null) {
            this.insurance = new Insurance();
        } else {
            this.insurance = insurance;
        }


    }

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        this(brand, model, engineVolume, color, productionYear, productionCountry, "МКПП", "Седан",
                "х000хх000", 5, true, new Key(), new Insurance());
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public boolean getSummerTires() {
        return summerTires;
    }

    public boolean isSummerTires() {
        return summerTires;
    }

    public void setSummerTires(boolean summerTires) {
        this.summerTires = summerTires;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }


    public void changeTires() {
        this.summerTires = !this.summerTires;

    }

    public static boolean numberCheck(String registrationNumber) {
        char[] chars = registrationNumber.toCharArray();
        if (registrationNumber.length() != 9) {
            return false;
        }
        if (!Character.isAlphabetic(registrationNumber.charAt(0))
                || !Character.isAlphabetic(registrationNumber.charAt(4))
                || !Character.isAlphabetic(registrationNumber.charAt(5))) {
            return false;
        }
        if (!Character.isDigit(registrationNumber.charAt(1))
                || !Character.isDigit(registrationNumber.charAt(2))
                || !Character.isDigit(registrationNumber.charAt(3))
                || !Character.isDigit(registrationNumber.charAt(6))
                || !Character.isDigit(registrationNumber.charAt(7))
                || !Character.isDigit(registrationNumber.charAt(8))) {
            return false;
        }
        return true;
    }

    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessEntry;

        public Key(boolean remoteEngineStart, boolean keylessEntry) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessEntry = keylessEntry;
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessEntry() {
            return keylessEntry;
        }

        public Key() {
            this(false, false);

        }

    }

    public static class Insurance {
        private final LocalDate validUntil;
        private final double cost;
        private final String insuranceNumber;

        public Insurance(LocalDate validUntil, double cost, String insuranceNumber) {
            this.validUntil = validUntil;
            if (validUntil.isBefore(LocalDate.now())) {
                System.out.println("Срочно ехать оформлять новую страховку");
            }
            if (cost < 0) {
                this.cost = 0;
            } else {
                this.cost = cost;
            }
            if (insuranceNumber == null || insuranceNumber.isEmpty() || insuranceNumber.isBlank() ||
                    insuranceNumber.length() < 9) {
                this.insuranceNumber = "Номер страховки некорректный!";
            } else {
                this.insuranceNumber = insuranceNumber;
            }
        }

        public LocalDate getValidUntil() {
            return validUntil;
        }

        public double getCost() {
            return cost;
        }

        public String getInsuranceNumber() {
            return insuranceNumber;
        }

        public Insurance() {
            this(LocalDate.now(), 15000, "888888888");
        }
    }
}





