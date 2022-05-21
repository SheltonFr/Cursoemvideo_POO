public final class Tecnico extends Aluno {
    private String regidtroProfissional;

    public String getRegidtroProfissional() {
        return regidtroProfissional;
    }

    public void setRegidtroProfissional(String regidtroProfissional) {
        this.regidtroProfissional = regidtroProfissional;
    }

    public void praticar(){
        System.out.println("Praticando");
    }
}
