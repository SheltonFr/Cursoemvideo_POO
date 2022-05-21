package aula02;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public void status(){
        System.out.println("Uma caneta " + this.cor);
        System.out.println("A caneta esta tampada: " + this.tampada);
        System.out.println("Ponta: " +this.ponta);
        System.out.println("Carga: " + this.carga);
        if( this.tampada){
            System.out.println("A caneta esta tampada");
        }else{
            System.out.println("A caneta esta destampada");
        }
    }

    public void rabiscar(){
        if(this.tampada){
            System.out.println("Nao posso rabiscar com a caneta tampada");
        }else{
            System.out.println("Rabiscando");
        }
    }

    public void tampar(){
        this.tampada=true;
    }

    public void destamoar(){
        this.tampada=false;
    }
}
