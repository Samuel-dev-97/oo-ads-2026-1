public class ContaEspecial extends ContaBancaria {
    public Double limite;

    //construtor personalizado
    public ContaEspecial(String titular, Double saldoInicial, Double limite) {

        super(titular, saldoInicial);
        this.limite = limite;
    }

    @Override
    public void exibirSaldo() {

        Double saldoComLimite = this.saldo + this.limite;

        System.out.println("Titular: " + this.titular + " | Saldo + Limite: R$ " + saldoComLimite);
    }
    public void exibirSaldoReal() {

        System.out.println("Titular: " + this.titular + " | Saldo Real (sem limite): R$ " + this.saldo);

    }

}