import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Cliente taisa = new Cliente();
        taisa.setNome("Taisa");


        ContaCorrente cc = new ContaCorrente(taisa);
        Conta poupanca = new ContaPoupanca(taisa);
        ContaSalario salario = new ContaSalario(taisa);

        cc.depositar(1500);
        cc.transferir(100, poupanca);
        cc.pagarBoleto(150);

        salario.receberSalario();

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        salario.imprimirExtrato();

    }


}
