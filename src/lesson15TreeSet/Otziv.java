package lesson15TreeSet;

public class Otziv {
    private int mainRate;
    private String mainText;

    public Otziv() {
    }

    public Otziv(int mainRate, String mainText) {
        this.mainRate = mainRate;
        this.mainText = mainText;
    }

    public int getMainRate() {
        return mainRate;
    }

    public void setMainRate(int mainRate) {
        this.mainRate = mainRate;
    }

    public String getMainText() {
        return mainText;
    }

    public void setMainText(String mainText) {
        this.mainText = mainText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Otziv otziv = (Otziv) o;

        if (mainRate != otziv.mainRate) return false;
        return mainText != null ? mainText.equals(otziv.mainText) : otziv.mainText == null;
    }

    @Override
    public int hashCode() {
        int result = mainRate;
        result = 31 * result + (mainText != null ? mainText.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Отзыв: " + mainRate + ", " + mainText;
    }
}
