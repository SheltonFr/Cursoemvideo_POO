public final class Bolsista extends Aluno{
    private float bolsa;

    public void renovarBolsa(){
        System.out.println("Renovando a bolsa do aluno " +this.getNome());
    }
    @Override
    public void pagarMensalidade(){
        System.out.println("Pagamento de bolsista!");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
