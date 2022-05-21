package aula04;

public class Aula04 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("BIC", "Amarela", 0.6f);
        c1.status();
        System.out.println("---------------------------------");
        Caneta c2 = new Caneta("MONTE VIDEO", "VERM", 1.2f);
        c2.status();
        Caneta c3 = new Caneta("MSMSMSMS","asasasasasa", 3.4f);
        c3.status();
    }
}
