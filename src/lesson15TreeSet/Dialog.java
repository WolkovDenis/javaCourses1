package lesson15TreeSet;

public class Dialog {
    private String tema;

    public Dialog() {
    }

    public Dialog(String tema) {
        this.tema = tema;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dialog dialog = (Dialog) o;

        return tema != null ? tema.equals(dialog.tema) : dialog.tema == null;
    }

    @Override
    public int hashCode() {
        return tema != null ? tema.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Тема диалога:" + tema;
    }
}
