package lesson15TreeSet;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Tovar tovar1 = new Tovar("Мышка", 120);
        Tovar tovar2 = new Tovar("Клавиатура", 23000);
        Tovar tovar3 = new Tovar("Ноутбук HP", 47000);
        Tovar tovar4 = new Tovar("Гарнитура", 3500);
        Tovar tovar5 = new Tovar("Мышка DELL", 2600);

        Dialog dialog1 = new Dialog("Промакает ли");
        Dialog dialog2 = new Dialog("Можно ли греть");
        Dialog dialog3 = new Dialog("Как с устойчивостью?");
        Dialog dialog4 = new Dialog("В белом или сером цвете?");

        tovar1.addDialog(dialog1);
        tovar1.addDialog(dialog2);
        tovar3.addDialog(dialog3);
        tovar4.addDialog(dialog4);

        EvaluationTovars rating1 = new EvaluationTovars(4);
        EvaluationTovars rating2 = new EvaluationTovars(5);
        EvaluationTovars rating3 = new EvaluationTovars(2);
        EvaluationTovars rating4 = new EvaluationTovars(3);
        EvaluationTovars rating5 = new EvaluationTovars(1);

        tovar1.addGrade(rating3);
        tovar2.addGrade(rating2);
        tovar3.addGrade(rating4);
        tovar4.addGrade(rating1);
        tovar5.addGrade(rating5);

        TreeSet<Tovar> tovars = new TreeSet<>();
        tovars.add(tovar1);
        tovars.add(tovar2);
        tovars.add(tovar3);
        tovars.add(tovar4);
        tovars.add(tovar5);

        for (Tovar tovar : tovars) {
            System.out.println(tovar);
        }
        System.out.println("-----------------СОРТИРОВКА ОТ МЕНЬШЕГО К БОЛЬШЕМУ ------------------------");

        TreeSet<Tovar> sortByPriceFromTo = SortingTovars.sortByPriceFromTo(tovars);
        for (Tovar tovar : sortByPriceFromTo) {
            System.out.println(tovar);
        }

        System.out.println("-------------СОРТИРОВКА ОТ БОЛЬШЕГО К МЕНЬШЕМУ---------------------");

        TreeSet<Tovar> sortByPriceToFrom = SortingTovars.sortByPriceToFrom(tovars);
        for (Tovar tovar : sortByPriceToFrom) {
            System.out.println(tovar);
        }

        System.out.println("--------------------СОРТИРОВКА ПО НАИМЕНОВАНИЮ---------------------");

        TreeSet<Tovar> sortTovarsByName = SortingTovars.sortTovarsByName(tovars);
        for (Tovar tovar : sortTovarsByName) {
            System.out.println(tovar);
        }

        System.out.println("-------------------СОРТИРОВКА ПО ОБСУЖДЕНИЯМ------------------------");

        TreeSet<Tovar> sortByDiscussion = SortingTovars.sortTovarByDiscussion(tovars);
        for (Tovar tovar:sortByDiscussion){
            System.out.println(tovar);
        }

        System.out.println("-----------------------СОРТИРОВКА С ЛУЧШЕЙ ОЦЕНКОЙ----------------------");

        TreeSet<Tovar> sortByRating = SortingTovars.sortTovarByRating(tovars);
        for (Tovar tovar:sortByRating){
            System.out.println(tovar);
        }
    }
}