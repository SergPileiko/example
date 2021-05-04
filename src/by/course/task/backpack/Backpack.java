package by.course.task.backpack;

import java.util.Objects;

public class Backpack {

    private int carryingCapacity;

    public Backpack(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public int getCarryingCapacity() {
        return this.carryingCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Backpack backpack = (Backpack) o;
        return carryingCapacity == backpack.carryingCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(carryingCapacity);
    }

    @Override
    public String toString() {
        return "Backpack{" +
                "carryingCapacity=" + carryingCapacity +
                '}';
    }
}
