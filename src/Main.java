public class Main {
    public static void main(String[] args) {

        Human Maksim = new Human("Maksim");
        Maksim.town = "Minsk";
        Maksim.yearOfBirth = 2022 - 35;
        Maksim.jobTitle = "бренд-менеджер";
        Maksim.greetings();


        Human Anna = new Human("Anna");
        Anna.town = "Moscow";
        Anna.yearOfBirth = 2022 - 29;
        Anna.jobTitle = "методистом образовательных программ";
        Anna.greetings();

        Human Katya = new Human("Katya");
        Katya.town = "Kaliningrad";
        Katya.yearOfBirth = 2022 - 28;
        Katya.jobTitle = "продакт-менеджер";
        Katya.greetings();

        Human Artem = new Human("Artem");
        Artem.town = "Moscow";
        Artem.yearOfBirth = 2022 - 27;
        Artem.jobTitle = "директором по развитию бизнеса";
        Artem.greetings();

    }
}