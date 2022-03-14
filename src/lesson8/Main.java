package lesson8;


public class Main {
    public static void main(String[] args) {
        Animal slon1 = new Animal(12,"Африканский слон");
        Animal slon2 = new Animal(12,"Африканский слон");
        Animal slon3 = slon2;

        System.out.println(slon3.equals(slon1));
        System.out.println(slon1.toString());


    }
}
