package by.course.task.backpack;

import java.util.Comparator;

public class Thing {
    private int weight;
    private int cost;
    private double specificWeight;

    public Thing(int weight, int cost) {
        this.weight = weight;
        this.cost = cost;
        this.specificWeight = 1.0 * cost / weight;
    }

    public double getSpecificWeight() {
        return specificWeight;
    }

    public int getWeight() {
        return weight;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Thing thing = (Thing) o;
        if (weight != thing.weight) return false;
        return cost == thing.cost;
    }

    @Override
    public int hashCode() {
        int result = weight;
        result = 31 * result + cost;
        return result;
    }

    @Override
    public String toString() {
        return "Thing{" +
                "weight=" + weight +
                ", cost=" + cost +
                '}';
    }

}
