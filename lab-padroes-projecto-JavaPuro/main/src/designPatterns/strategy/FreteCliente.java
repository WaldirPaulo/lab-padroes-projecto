package designPatterns.strategy;

public class FreteCliente {
    private Frete operadora;

    public FreteCliente(Frete operadora) {
        this.operadora = operadora;
    }

    public Frete getOperadora() {
        return operadora;
    }

    public void setOperadora(Frete operadora) {
        this.operadora = operadora;
    }


    public double calcula(double peso)
    {
        return this.operadora.calcula(peso);
    }
}
