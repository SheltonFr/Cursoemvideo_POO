public class Aula07 {
    public static void main(String[] args) {

        Lutador l[] = new Lutador[6];

        l[0]= new Lutador("Pretty Boy", "França", 31,1.75f,
                68.9, 11, 2, 1);
        l[1]= new Lutador("Jhon smith", "Belgica", 29, 1.56f, 81.2,
                13,0,3);
        l[2]= new Lutador("Benny ", "Mozambique", 23, 1.20f, 90,
                4,5,1);
        l[3]= new Lutador("Shelton","Alemanha", 19, 1.60f, 58.4,
                14,2,0);
        l[4]= new Lutador("Hassan", "England", 27, 2.3f, 102.3,
                11, 2, 9);
        l[5]= new Lutador("Almiro", "Netherland", 34, 1.98f, 87.9,
                20,0,11);

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[0],l[3]);
        UEC01.lutar();

        l[0].status();
        l[3].status();
    }
}
