package homework2_3_OOP_Task3;

import java.util.Objects;

public final class Flying extends Birds {
    private String movementType;

    public Flying(String name, int year, String livingEnvironment, String movementType) {
        super(name, year, livingEnvironment);
        if (movementType == null || name.isEmpty() || name.isBlank()) {
            this.movementType = "Летает как стрела";
        } else {
            this.movementType = movementType;
        }

    }

    public String getMovementType() {
        return movementType;
    }

    public void setMovementType(String movementType) {
        this.movementType = movementType;
    }

    public void flying() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flying flying = (Flying) o;
        return Objects.equals(movementType, flying.movementType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), movementType);
    }
}

