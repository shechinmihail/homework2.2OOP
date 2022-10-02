public class Main {
    public static void main(String[] args) {

        Human Maksim = new Human(35, "Maksim", "Minsk", "бренд-менеджер");
        Human Anna = new Human(29, "Anna", "Moscow", "методистом образовательных программ");
        Human Katya = new Human(28, "Katya", "Kaliningrad", "продакт-менеджер");
        Human Artem = new Human(27, "Artem", "Moscow", "директором по развитию бизнеса");
        Human Vladimir = new Human(21,"Vladimir","Kazan",null);

        Maksim.greetings();
        Anna.greetings();
        Katya.greetings();
        Artem.greetings();
        Vladimir.greetings();
    }
}