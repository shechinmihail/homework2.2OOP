package homework2_3_OOP_Task3;

import java.util.Objects;

public final class Predators extends Mammals {
    private String typeOfFood;

    public Predators(String name, int year, String livingEnvironment, int movementSpeed, String typeOfFood) {
        super(name, year, livingEnvironment, movementSpeed);
        if (typeOfFood == null || name.isEmpty() || name.isBlank()) {
            this.typeOfFood = "не кушает, худеет";
        } else {
            this.typeOfFood = typeOfFood;
        }
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = typeOfFood;
    }

    public void hunt() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predators predators = (Predators) o;
        return Objects.equals(typeOfFood, predators.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }
}
