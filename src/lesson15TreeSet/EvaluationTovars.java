package lesson15TreeSet;

public class EvaluationTovars {
    private double grade;

    public EvaluationTovars() {
    }

    public EvaluationTovars(double grade) {
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EvaluationTovars that = (EvaluationTovars) o;

        return Double.compare(that.grade, grade) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(grade);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        return "Оценка:" + grade ;
    }
}
