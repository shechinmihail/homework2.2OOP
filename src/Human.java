public class Human {

    int yearOfBirth;
    String name;
    String town;
    String jobTitle;

    public Human(int yearOfBirth, String name, String town, String jobTitle) {
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
        if (name == null) {
            this.name = "Информация не указана";
        } else {
            this.name = name;
        }
        if (town == null) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
        if (jobTitle == null) {
            this.jobTitle = "Информация не указана";
        } else {
            this.jobTitle = jobTitle;
        }
    }

    void greetings() {
        System.out.println("Привет! Меня зовут " + name + ". " + "Я из города " + town + ". " + "Я родился в " +
                yearOfBirth + " году. " + "Я работаю на должности " + jobTitle + ". " + " Будем знакомы!");
    }


}
