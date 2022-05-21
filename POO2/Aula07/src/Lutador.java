public class Lutador implements InterLutador {
    //Atibutos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    //Metodos especiais


    public Lutador(String no, String na, int id, float al, double pe, int vi, int de, int em) {
        this.setNome(no);
        this.setNacionalidade(na);
        this.setIdade(id);
        this.setAltura(al);
        this.setPeso(pe);
        this.setVitorias(vi);
        this.setDerrotas(de);
        this.setEmpates(em);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if(this.getPeso()<52.2){
            this.categoria="Invalido";
        }else if(this.getPeso()<=73){
            this.categoria="Leve";
        }else if(this.getPeso()<83.9){
            this.categoria="Medio";
        }else if(this.getPeso()<=120.2) {
            this.categoria="Pesado";
        }else{
            this.categoria="Invalido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    //Metodos abstractos
    @Override
    public void apresentar() {
        System.out.println("Lutador: " +this.getNome());
        System.out.println("Nacionalidade: " +this.getNacionalidade());
        System.out.println(this.getIdade()+" anos de idade");
        System.out.println(this.getAltura()+" m de altura");
        System.out.println(this.getPeso()+" Kg");
        System.out.println("Categoria: " +this.getCategoria());
        System.out.println("Vitoras: " +this.getVitorias());
        System.out.println("Derrotas: " +this.getDerrotas());
        System.out.println("Empates: " +this.getEmpates());
    }

    @Override
    public void status() {
        System.out.println("-----------------Status-------------------");
        System.out.println("Lutador: " +this.getNome());
        System.out.println("Categoria: " +this.getCategoria());
        System.out.println("Categoria: " +this.getCategoria());
        System.out.println("Vitoras: " +this.getVitorias());
        System.out.println("Derrotas: " +this.getDerrotas());
    }

    @Override
    public void ganharLuta() {
        this.setVitorias(getVitorias()+1);
    }

    @Override
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas()+1);
    }

    @Override
    public void empatarLuta() {
        this.setEmpates(this.getEmpates()+1);
    }
}
