public class ContaCorrente extends Conta{
    private double taxaManutencao;

    public ContaCorrente(String numeroConta, double saldoInicial, double taxaManutencao){
        super(numeroConta, saldoInicial);
        this.taxaManutencao = taxaManutencao;
    }

    @Override
    public void calcularTaxas(){
        if(getSaldo() >= taxaManutencao) {
            sacar(taxaManutencao);
            System.out.println("Taxa de manutenção de R$" + taxaManutencao + " descontada.");
        } else {
            System.out.println("Saldo insuficiente para manutenção");
        }
    }

}
