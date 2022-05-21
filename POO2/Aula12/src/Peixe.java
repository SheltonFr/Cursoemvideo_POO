public class Peixe extends Animal{
    private String corEscamas;

    public String getCorEscamas() {
        return corEscamas;
    }

    public void setCorEscamas(String corEscamas) {
        this.corEscamas = corEscamas;
    }

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de peixe");
    }
    public void soltarBolhas(){
        System.out.println("Soltando bolhas!!!");
    }
}
