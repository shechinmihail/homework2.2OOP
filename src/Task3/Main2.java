package Task3;

import Transport.Bus;
import Transport.Car;
import Transport.Train;

import java.time.LocalDate;


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

        Train martin = new Train("Ласточка", "B-901", 2011, "Россия", 301, 3500.0, 7,
                "от Белорусского вокзал", "до станции Минск-Пассажирский", 11);
        Train leningrad = new Train("Ленинград", "D-125", 2019, "Россия", 270, 1700.0, 5,
                "от Ленинградского вокзала", "до станции Ленинград-Пассажирский", 8);

        Bus liaz = new Bus("Лиаз", "Т-1000", 1989, "Россия", 355);
        Bus solaris = new Bus("Соларис", "Super 300", 2010, "Корея", 145);
        Bus maz = new Bus("Маз", "GP 3", 1999, "Россия", 120);


        printInfo(lada);
        printInfo(audi);
        printInfo(bmw);
        printInfo(kia);
        printInfo(hyundai);

        System.out.println(Character.isAlphabetic('t'));
        System.out.println(Character.isDigit('1'));
        System.out.println(Character.isDigit('2'));

        printInfo(martin);
        printInfo(leningrad);
        System.out.println();
        printInfo(liaz);
        printInfo(solaris);
        printInfo(maz);


    }

    private static void printInfo(Car car) {
        System.out.println(
                "Aвтомобиль " +
                        "Марка " + car.getBrand() + '\'' +
                        ", Модель " + car.getModel() + '\'' +
                        ", Объем двигателя в литрах " + car.getEngineVolume() +
                        ", Цвет кузова " + car.getBodyColor() + '\'' +
                        ", год производства " + car.getProductionYear() +
                        ", страна сборки " + car.getProductionCountry() + ", коробка передач " + car.getTransmission() + ", тип кузова " + car.getBodyType()
                        + ", регистрационный номер " + car.getRegistrationNumber() + ", количество мест " + car.getNumberOfSeats() +
                        ", резина " + (car.isSummerTires() ? " Летняя " : " Зимняя ")
                        + (car.getKey().isKeylessEntry() ? "Бесключевой доступ" : "ключевой доступ")
                        + (car.getKey().isRemoteEngineStart() ? " удалённый запуск двигателя " : " обычный запуск двигателя ")
                        + " Дата окончания страховки " + car.getInsurance().getValidUntil() + " Стоимость страховки "
                        + car.getInsurance().getCost() + " Номер страховки " + car.getInsurance().getInsuranceNumber());
    }

    private static void printInfo(Train train) {
        System.out.println("Поезд " +
                train.getBrand() + ", Модель " + train.getModel() + ", год производства " + train.getProductionYear() +
                ", страна сборки " + train.getProductionCountry() + ", скорость передвижения " + train.getMaxMovementSpeed() +
                " км/час , отходит " + train.getDepartureStationName() + ", следует " + train.getEndingStation() + ", Цена поездки " +
                train.getTripPrice() + " рублей, время поездки " + train.getTravelTime() + " часов, в поезде " +
                train.getNumberOfWagons() + " вагонов.");
    }

    private static void printInfo(Bus bus) {
        System.out.println("Автобус " + bus.getBrand() + ", Модель " + bus.getModel() + ", год производства " +
                bus.getProductionYear() + ", страна сборки " + bus.getProductionCountry() + ", скорость передвижения " +
                bus.getMaxMovementSpeed() + " км/час.");
    }
}




