package lesson15TreeSet;

import java.util.Comparator;

public class SortByPriceFromToComporator implements Comparator<Tovar> {
    @Override
    public int compare(Tovar o1, Tovar o2) {
        // o1 - первый товар
        // o2 - второй товар

        if (o1.getPrice() != o2.getPrice()) {
            return o1.getPrice() - o2.getPrice();
        }

        if (o1.totalRate() != o2.totalRate()) {         // Сортировка по рейтингу
            return Double.compare(o1.totalRate(), o2.totalRate());
        }

        if (!o1.getName().equals(o2.getName())) {      // Сортировка по имени
            return o1.getName().compareTo(o2.getName());
        }
        return o1.getDialogs().size() - o2.getDialogs().size();          // Сортировка по обсуждениям

    }
}

