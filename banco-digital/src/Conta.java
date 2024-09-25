public abstract class Conta {
    private String numeroConta;
    private double saldo;

    public Conta(String numeroConta, double saldoInicial){
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    public String getNumeroConta(){
        return numeroConta;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso. ");
        } else {
            System.out.println("Valor de depósito invalido");
        }
    }

    public void sacar(double valor){
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso");
        } else {
            System.out.println("Saldo insuficiente ou valor invalido para saque");
        }
    }

    public void transferir(double valor, Conta destino){
        if(valor > 0 && saldo >= valor){
            saldo -= valor;
            destino.depositar(valor);
            System.out.println("Transferencia de R$" + valor + " para a conta" + destino.getNumeroConta() + " realizada com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para transferencia");
        }
    }

    public abstract void calcularTaxas();
}

