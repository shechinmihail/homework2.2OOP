package homework2_3_OOP_Task3;

import java.util.Objects;

public class Birds extends Animals {
    private String livingEnvironment;

    public Birds(String name, int year, String livingEnvironment) {
        super(name, year);
        if (livingEnvironment == null || name.isEmpty() || name.isBlank()) {
            this.livingEnvironment = "Планета Земля";
        } else {
            this.livingEnvironment = livingEnvironment;
        }
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = livingEnvironment;
    }

    public void hunt() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void move() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Birds birds = (Birds) o;
        return Objects.equals(livingEnvironment, birds.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }
}
