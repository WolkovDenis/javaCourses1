package lesson15TreeSet;

import java.util.ArrayList;


public class Tovar implements Comparable<Tovar> {
    private String name;
    private int price;
    private ArrayList<Otziv> otzivs = new ArrayList<>();
    private ArrayList<Dialog> dialogs = new ArrayList<>();
    private ArrayList<EvaluationTovars> grades = new ArrayList<>();

    public Tovar() {
    }

    public Tovar(String name, int price) {
        this.name = name;
        this.price = price;

    }

    public ArrayList<Otziv> getOtzivs() {
        return otzivs;
    }

    public void setOtzivs(ArrayList<Otziv> otzivs) {
        this.otzivs = otzivs;
    }

    public ArrayList<Dialog> getDialogs() {
        return dialogs;
    }

    public void setDialogs(ArrayList<Dialog> dialogs) {
        this.dialogs = dialogs;
    }

    public ArrayList<EvaluationTovars> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<EvaluationTovars> grades) {
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void addDialog(Dialog dialog) {
        dialogs.add(dialog);
    }

    public double totalRate() {
        double summaOtzivs = 0;
        for (Otziv otziv : otzivs) {
            summaOtzivs = summaOtzivs + otziv.getMainRate();
        }
        if (otzivs.size() > 0) {
            double total = summaOtzivs / otzivs.size();
            return total;
        } else {
            return 0.0;
        }
    }

    public void addGrade(EvaluationTovars gradeTovars) {
        grades.add(gradeTovars);
    }

    public double totalRating() {
        double summaGrade = 0;
        for (EvaluationTovars evaluationTovars : grades) {
            summaGrade = summaGrade + evaluationTovars.getGrade();
        }
        if (grades.size() > 0) {
            double total = summaGrade / grades.size();
            return total;
        } else {
            return 0.0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tovar tovar = (Tovar) o;

        if (price != tovar.price) return false;
        if (name != null ? !name.equals(tovar.name) : tovar.name != null) return false;
        if (otzivs != null ? !otzivs.equals(tovar.otzivs) : tovar.otzivs != null) return false;
        return dialogs != null ? dialogs.equals(tovar.dialogs) : tovar.dialogs == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + price;
        result = 31 * result + (otzivs != null ? otzivs.hashCode() : 0);
        result = 31 * result + (dialogs != null ? dialogs.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Товар{" + name + '\'' +
                ", Цена =" + price +
                ", Отзывы =" + otzivs +
                ", Обсуждения =" + dialogs +
                ", Оценка =" + grades;
    }

    @Override
    public int compareTo(Tovar o) {
        // this - первый товар
        // o - второй товар
        if (this.totalRate() != o.totalRate()) {
            return Double.compare(this.totalRate(), o.totalRate());
        }
        if (!this.getName().equals(o.getName())) {
            return this.getName().compareTo(o.getName());
        }
        if (this.dialogs.size() != o.dialogs.size()) {
            return this.dialogs.size() - o.dialogs.size();
        }
        if (this.totalRating() != o.totalRating()) {
            return Double.compare(this.totalRating(), o.totalRating());
        }
        return this.price - o.price;
    }
}
