package lesson15TreeSet;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SortingTovars {

    public static TreeSet<Tovar> sortByPriceFromTo(Set<Tovar> tovars) {
        TreeSet<Tovar> sortByPrice = new TreeSet<>(new SortByPriceFromToComporator());
        for (Tovar t : tovars) {
            sortByPrice.add(t);
        }
        return sortByPrice;
    }

    public static TreeSet<Tovar> sortByPriceToFrom(Set<Tovar> tovars) {
        TreeSet<Tovar> sortByPrice = new TreeSet<>(new Comparator<Tovar>() {
            @Override
            public int compare(Tovar o1, Tovar o2) {
                // o1 - первый товар
                // o2 - второй товар

                if (o1.getPrice() != o2.getPrice()) {
                    return o2.getPrice() - o1.getPrice();
                }

                if (o1.totalRate() != o2.totalRate()) {         // Сортировка по рейтингу
                    return Double.compare(o2.totalRate(), o1.totalRate());
                }

                if (!o1.getName().equals(o2.getName())) {      // Сортировка по имени
                    return o2.getName().compareTo(o1.getName());
                }
                return o2.getDialogs().size() - o1.getDialogs().size();          // Сортировка по обсуждениям

            }
        });

        for (Tovar t : tovars) {
            sortByPrice.add(t);
        }
        return sortByPrice;
    }
    // Сортировка по наименованию

    public static TreeSet<Tovar> sortTovarsByName(Set<Tovar> tovars) {
        TreeSet<Tovar> sortByName = new TreeSet<>(new Comparator<Tovar>() {
            @Override
            public int compare(Tovar o1, Tovar o2) {
                if (!o1.getName().equals(o2.getName())) {
                    return o1.getName().compareTo(o2.getName());
                }
                if (o1.getPrice() != o2.getPrice()) {
                    return o1.getPrice() - o2.getPrice();
                }
                if (o1.totalRate() != o2.totalRate()) {
                    return Double.compare(o1.totalRate(), o2.totalRate());
                }
                return o1.getDialogs().size() - o2.getDialogs().size();

            }
        });
        for (Tovar t : tovars) {
            sortByName.add(t);
        }
        return sortByName;
    }

    // Сортировка по обсуждениям

    public static TreeSet<Tovar> sortTovarByDiscussion(Set<Tovar> tovars) {
        TreeSet<Tovar> sortByDiscussion = new TreeSet<>(new Comparator<Tovar>() {
            @Override
            public int compare(Tovar o1, Tovar o2) {

                if (o1.getDialogs().size() != o2.getDialogs().size()) {
                    return o2.getDialogs().size() - o1.getDialogs().size(); //Без обсуждения товар отображается последним
                }
                if (!o1.getName().equals(o2.getName())) {
                    return o1.getName().compareTo(o2.getName());
                }
                if (o1.totalRate() != o2.totalRate()) {
                    return Double.compare(o1.totalRate(), o2.totalRate());
                }
                return o1.getPrice() - o2.getPrice();
            }
        });
        for (Tovar t : tovars) {
            sortByDiscussion.add(t);
        }
        return sortByDiscussion;
    }

    public static TreeSet<Tovar> sortTovarByRating(Set<Tovar> tovars) {
        TreeSet<Tovar> sortByRating = new TreeSet<>(new Comparator<Tovar>() {
            @Override
            public int compare(Tovar o1, Tovar o2) {
                if (o1.totalRate() != o2.totalRate()) {
                    return Double.compare(o2.totalRate(), o1.totalRate());
                }
                if (!o1.getName().equals(o2.getName())) {
                    return o1.getName().compareTo(o2.getName());
                }
                if (o1.totalRate() != o2.totalRate()) {
                    return Double.compare(o1.totalRate(), o2.totalRate());
                }
                if (o1.getPrice() != o2.getPrice()) {
                    return o1.getPrice() - o2.getPrice();
                }
                return o1.getDialogs().size() - o2.getDialogs().size();
            }
        });
        for (Tovar t : tovars) {
            sortByRating.add(t);
        }
        return sortByRating;
    }
}
