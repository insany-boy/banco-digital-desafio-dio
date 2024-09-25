public class ContaPoupanca extends Conta {
    private double taxaRendimento;

    public ContaPoupanca(String numeroConta, double saldoInicial, double taxaRendimento){
        super(numeroConta, saldoInicial);
        this.taxaRendimento = taxaRendimento;
    }

    public void aplicarRendimento(){
        double rendimento = getSaldo() * taxaRendimento;
        depositar(rendimento);
        System.out.println("Rendimento de R$" + rendimento + " aplicado à conta Poupança");
    }

    @Override

    public void calcularTaxas(){
        aplicarRendimento();
    }
}
