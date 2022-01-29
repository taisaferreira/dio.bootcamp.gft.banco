public class ContaSalario extends Conta {


    public ContaSalario(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("===Extrato conta Corrente===");
        super.imprimirInfosComuns();
    }

    public void receberSalario() {
        saldo += 1650.10;
    }

}
