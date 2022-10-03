package homework2_3_OOP_Task3;

import java.util.Objects;

public class Mammals extends Animals {
    private String livingEnvironment;

    private int movementSpeed;

    public Mammals(String name, int year, String livingEnvironment, int movementSpeed) {
        super(name, year);
        if (livingEnvironment == null || name.isEmpty() || name.isBlank()) {
            this.livingEnvironment = "Планета Земля";
        } else {
            this.livingEnvironment = livingEnvironment;
        }
        if (movementSpeed < 0) {
            this.movementSpeed = 25;
        } else {
            this.movementSpeed = movementSpeed;
        }
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = livingEnvironment;
    }

    public int getMovementSpeed() {
        return movementSpeed;
    }

    public void setMovementSpeed(int movementSpeed) {
        this.movementSpeed = movementSpeed;
    }

    public void walk() {

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
        Mammals mammals = (Mammals) o;
        return movementSpeed == mammals.movementSpeed && Objects.equals(livingEnvironment, mammals.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment, movementSpeed);
    }
}
