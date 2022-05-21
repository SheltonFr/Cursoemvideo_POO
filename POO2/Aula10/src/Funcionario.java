public class Funcionario extends Pessoa{
    private String sector;
    private boolean trabalhando;

    //metodos da classe
    public void mudaTrabalho(){
        this.setTrabalhando(!this.isTrabalhando());
    }

    //Metodos especiais

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
