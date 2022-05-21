public class Aula10 {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        p1.setSexo("M");
        p1.setIdade(18);


        p2.setNome("Maria");
        p2.setSexo("F");
        p2.setIdade(22);
        p2.setCurso("Informatica");
        p2.setMatricula(6);
        p2.cancelarMatricula();

        p3.setNome("Claudio");
        p3.setSexo("M");
        p3.setIdade(35);
        p3.setEspecialidade("HTML5 com CSS3");
        p3.setSalario(8640.34f);

        p4.setNome("Fabiana");
        p4.setSexo("F");
        p4.setIdade(40);
        p4.setTrabalhando(true);



        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
