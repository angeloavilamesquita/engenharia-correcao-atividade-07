package correcaoatividade07;

public class Casa extends Moradia {
    private Parede paredeQuarto;
    private Parede paredeCozinha;
    private Parede paredeBanheiro;
    private Telhado telhadoAreExterna;
    private Telhado telhadoAreInterna;
    private Espelho espelhoCorredor;
    
    public Casa() {
        this.paredeQuarto = new Parede();
        this.paredeCozinha = new Parede();
        this.paredeBanheiro = new Parede();
        this.telhadoAreExterna = new Telhado();
        this.telhadoAreInterna = new Telhado();
    }

    public Espelho getEspelhoCorredor() {
        return espelhoCorredor;
    }

    public void setEspelhoCorredor(Espelho espelhoCorredor) {
        this.espelhoCorredor = espelhoCorredor;
    }

    public Parede getParedeQuarto() {
        return paredeQuarto;
    }

    public Parede getParedeCozinha() {
        return paredeCozinha;
    }

    public Parede getParedeBanheiro() {
        return paredeBanheiro;
    }

    public Telhado getTelhadoAreExterna() {
        return telhadoAreExterna;
    }

    public Telhado getTelhadoAreInterna() {
        return telhadoAreInterna;
    }
}
