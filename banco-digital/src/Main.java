public class Main {
    public static void main(String[] args) throws Exception {
        //Criando contas
        ContaCorrente contaCorrente = new ContaCorrente("12345", 1000.0, 12.0);
        ContaPoupanca contaPoupanca = new  ContaPoupanca("67890", 500.0, 0.02);
        
        //Depósitos e saques
        contaCorrente.depositar(200.0);
        contaPoupanca.sacar(100.0);
        
        //Transferencia
        contaCorrente.transferir(150.0, contaPoupanca); 

        //Aplicação de taxas
        contaCorrente.calcularTaxas();
        contaPoupanca.calcularTaxas();
    }
}
