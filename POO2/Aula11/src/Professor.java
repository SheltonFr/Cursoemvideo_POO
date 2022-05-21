public final class Professor extends Pessoa{
    private String capacidade;
    private float salario;
    public void receberAumento(){
        System.out.println("Recebeu aumento");
    }

    public String getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
