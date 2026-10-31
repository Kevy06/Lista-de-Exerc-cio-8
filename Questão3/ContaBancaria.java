public class ContaBancaria {
    protected double saldo;

    public void sacar (double valor) {
        saldo -= valor;
    }
}

public class ContaComTaxa extends ContaBancaria {

    @Override
    public void sacar(double valor) {
        super.sacar(valor + 0.10);
    }
}