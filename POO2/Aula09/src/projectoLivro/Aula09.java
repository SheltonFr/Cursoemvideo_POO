package projectoLivro;

public class Aula09 {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Pedro" ,21, "M");
        p[1] = new Pessoa("Maria", 26, "F");

        l[0] = new Livro("Aprendendo Java", "Jose da Silva", 120, p[0]);
        l[1] = new Livro("POO", "Pedro Paulo", 200, p[1]);
        l[2] = new Livro("Java Profissional", "Guanavara", 600, p[0]);

        System.out.println(l[0].detalhes());
    }
}
