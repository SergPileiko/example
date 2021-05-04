package by.course.task.backpack;

import java.util.Comparator;

public class ThingComparator implements Comparator <Thing>{

    @Override
    public int compare(Thing o1, Thing o2) {
        return Double.compare(o1.getSpecificWeight(), o2.getSpecificWeight());
    }
}
