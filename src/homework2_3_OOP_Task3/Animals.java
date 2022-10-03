package homework2_3_OOP_Task3;

import java.util.Objects;

public abstract class Animals {
    private String name;
    private int year;

    public Animals(String name, int year) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            this.name = "Имя не указано";
        } else {
            this.name = name;
        }
        if (year < 0) {
            this.year = 0;
        } else {
            this.year = year;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public abstract void eat();

    public void sleep() {

    }

    public abstract void move();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return year == animals.year && Objects.equals(name, animals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year);
    }
}
