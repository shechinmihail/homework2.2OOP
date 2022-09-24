public class Human {

    int yearOfBirth;
    String name;
    String town;
    String jobTitle;

    public Human(String name) {
        this.name = name;
    }

    void greetings() {
        System.out.println("Привет! Меня зовут " + name + ". " + "Я из города " + town + ". " + "Я родился в " +
                yearOfBirth + "году. " + "Я работаю на должности " + jobTitle + ". " + " Будем знакомы!");
    }


}
