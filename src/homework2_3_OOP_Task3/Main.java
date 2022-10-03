package homework2_3_OOP_Task3;

import Transport.Bus;

public class Main {
    public static void main(String[] args) {

        Herbivores gazelle = new Herbivores("Газель", 4, "Африке", 97, "Различные травы и иные растения");
        Herbivores giraffe = new Herbivores("Жираф", 2, "Саваннах Африки", 60, "Листвой древесных крон");
        Herbivores horse = new Herbivores("Лошадь", 5, "Россия", 88, "Сено");

        Predators hyena = new Predators("Гиена", 1, "Саваннах Африки", 64, "Любую пaдaль");
        Predators tiger = new Predators("Тигр", 6, "Индонезии", 50, "Кабанами");
        Predators bear = new Predators("Медведь", 4, "Россия", 50, "Рыба");

        Amphibians frog = new Amphibians("Лягушка", 3, "Пресноводные водоёмы России");
        Amphibians alreadyFreshwater = new Amphibians("Уж пресноводный", 1, "Пресноводные водоёмы Юго-Восточной Азии");

        NotFlying peacock = new NotFlying("Павлин", 4, "Индии", "Ходят по земле");
        NotFlying penguin = new NotFlying("Пингвин", 3, "Антарктике", "Неуклюже ходят");
        NotFlying birdDoDo = new NotFlying("Птица ДоДо", 6, "Острова Маврикий", "Ходят по земле");

        Flying gull = new Flying("Чайка", 2, "Везде, где есть море", "Летают над водой");
        Flying albatross = new Flying("Альбатрос", 5, "Южном океане", "Летает");
        Flying falcon = new Flying("Сокол", 1, "Россия", "Быстро летает");

        printInfo(gazelle);
        printInfo(giraffe);
        printInfo(horse);
        printInfo(hyena);
        printInfo(tiger);
        printInfo(bear);
        printInfo(frog);
        printInfo(alreadyFreshwater);
        printInfo(peacock);
        printInfo(penguin);
        printInfo(birdDoDo);
        printInfo(gull);
        printInfo(albatross);
        printInfo(falcon);

    }

    private static void printInfo(Herbivores herbivores) {
        System.out.println("Травоядные млекопитающее " + herbivores.getName() + ", Количество лет " + herbivores.getYear() +
                ", Среда проживания " + herbivores.getLivingEnvironment() + ", Скорость перемещения " + herbivores.getMovementSpeed() + " км/час " +
                ", тип пищи " + herbivores.getTypeOfFood());
    }

    private static void printInfo(Predators predators) {
        System.out.println("Хищные млекопитающие " + predators.getName() + ", Количество лет " + predators.getYear() +
                ", Среда проживания " + predators.getLivingEnvironment() + ", Скорость перемещения " + predators.getMovementSpeed() + " км/час " +
                ", тип пищи " + predators.getTypeOfFood());
    }

    private static void printInfo(Amphibians amphibians) {
        System.out.println("Земноводные " + amphibians.getName() + ", Количество лет " + amphibians.getYear() +
                ", Среда проживания " + amphibians.getLivingEnvironment());
    }

    private static void printInfo(NotFlying notFlying) {
        System.out.println("Нелетающие птицы " + notFlying.getName() + ", Количество лет " + notFlying.getYear() +
                ", Среда проживания " + notFlying.getLivingEnvironment() + ", Тип передвижения" + notFlying.getMovementType());
    }

    private static void printInfo(Flying flying) {
        System.out.println("Летающие птицы " + flying.getName() + ", Количество лет " + flying.getYear() +
                ", Среда проживания " + flying.getLivingEnvironment() + ", Тип передвижения" + flying.getMovementType());
    }
}