public class ProjectoFinal {
    public static void main(String[] args) {

        Video[] v = new Video[3];

        v[0]= new Video("Aula 1 de POO");
        v[1]= new Video("Aula 2 de POO");
        v[2]= new Video("Aula 3 de POO");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Julema", "F", 18, "Jujuba");
        g[1] = new Gafanhoto("Matias", "M" , 15, "Matheus");

        Vizualizacao[] viz = new Vizualizacao[2];
        viz[0] = new Vizualizacao(g[0], v[0]);
        System.out.println(viz[0].toString());
        viz[0].avaliar();

        viz[1] = new Vizualizacao(g[0], v[1]);
        System.out.println(viz[1].toString());
        viz[1].avaliar(35.6f);
        /*System.out.println(v[0].toString());
        System.out.println(g[0].toString());*/
    }
}
