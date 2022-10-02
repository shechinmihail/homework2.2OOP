package Task3;

import Transport.Car;


public class Main2 {
    public static void main(String[] args) {

        Car lada = new Car("Lada", "Grande", 1.7, "yellow", 2015, "Russia",
                "Ручная", "Седан", "А111АА11", 5, true, new Car.Key(), new Car.Insurance());
        Car audi = new Car("Audi", "A8 50L TDI quattro", 3.0, "black", 2020,
                "Germany", "Автоамтическая", "Седан", "О222ОО22", 4, true, new Car.Key(), new Car.Insurance());
        Car bmw = new Car("BMW", "Z8", 3.0, "black", 2021, "Germany",
                "Автоамтическая", "Кабриолет", "В333ВВ33", 2, true, new Car.Key(), new Car.Insurance());
        Car kia = new Car("KIA", "Sportage 4", 2.4, "red", 2018, "South Korea",
                "Автоамтическая", "Джип", "Т444ТТ44", 5, true, new Car.Key(), new Car.Insurance());
        Car hyundai = new Car("Hyundai", "Avant", 1.6, "orange", 2016, "South Korea",
                "Вариатор", "Универсал", "С555СС05", 5, true, new Car.Key(), new Car.Insurance());


        printInfo(lada);
        printInfo(audi);
        printInfo(bmw);
        printInfo(kia);
        printInfo(hyundai);

        System.out.println(Character.isAlphabetic('t'));
        System.out.println(Character.isDigit('1'));
        System.out.println(Character.isDigit('2'));


    }

    private static void printInfo(Car car) {
        System.out.println(
                "Aвтомобиль " +
                        "Марка " + car.getBrand() + '\'' +
                        ", Модель " + car.getModel() + '\'' +
                        ", Объем двигателя в литрах " + car.getEngineVolume() +
                        ", Цвет кузова " + car.getColor() + '\'' +
                        ", год производства " + car.getProductionYear() +
                        ", страна сборки " + car.getProductionCountry() + ", коробка передач " + car.getTransmission() + ", тип кузова " + car.getBodyType()
                        + ", регистрационный номер " + car.getRegistrationNumber() + ", количество мест " + car.getNumberOfSeats() +
                        ", резина " + (car.isSummerTires() ? "Летняя" : "Зимняя")
                        + (car.getKey().isKeylessEntry() ? "Бесключевой доступ" : "ключевой доступ")
                        + (car.getKey().isRemoteEngineStart() ? "удалённый запуск двигателя" : "обычный запуск двигателя")
                        + " Дата окончания страховки " + car.getInsurance().getValidUntil() + " Стоимость страховки "
                        + car.getInsurance().getCost() + " Номер страховки " + car.getInsurance().getInsuranceNumber());
    }
}



