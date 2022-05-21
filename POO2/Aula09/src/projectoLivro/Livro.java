package projectoLivro;

public class Livro implements Publicacao{
    //Atributtos
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagActual;
    private boolean aberto;
    private Pessoa leitor;

    //Metoddos publicos

    public String detalhes() {
        return "Livro{" +
                "titulo=" + titulo +
                "\nautor='" + autor +
                "\ntotPaginas=" + totPaginas +
                "\npagActual=" + pagActual +
                "\naberto=" + aberto +
                "\nleitor=" + leitor.getNome() +
                "\nidade=" + leitor.getIdade() +
                "\nsexo=" + leitor.getSexo()+
                '}';
    }


    //Metodos especiais


    public Livro(String tituli, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = tituli;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
        this.setPagActual(0);
        this.setAberto(false);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String tituli) {
        this.titulo = tituli;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagActual() {
        return pagActual;
    }

    public void setPagActual(int pagActual) {
        this.pagActual = pagActual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int p) {
        this.setPagActual(p);
    }

    @Override
    public void avancarPag() {
        this.setPagActual(this.getPagActual()+1);
    }

    @Override
    public void voltarPag() {
        this.setPagActual(this.getPagActual()-1);
    }
}