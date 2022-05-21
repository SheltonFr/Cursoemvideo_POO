package aula02;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status(){
        System.out.println("Uma caneta " + this.cor);
        System.out.println("A caneta esta tampada: " + this.tampada);
        System.out.println("Ponta: " +this.ponta);
        System.out.println("Carga: " + this.carga);
        if( this.tampada){
            System.out.println("A caneta esta tampada");
        }else{
            System.out.println("A caneta esta destamoada");
        }
    }
    void rabiscar(){
        if(this.tampada){
            System.out.println("Nao posso rabiscar com a caneta tampada");
        }else{
            System.out.println("Rabiscando");
        }
    }
    void tampar(){
        this.tampada=true;
    }
    void destamoar(){
        this.tampada=false;
    }
}
