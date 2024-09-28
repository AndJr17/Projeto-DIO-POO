package ContaBancaria;

public class Teste {
    public static void main(String[] args) {
        
        
        Banco bradesco = new Banco("Bradesco");

        
        
        Cliente cliente1 = new Cliente("Anderson Junior");
        Cliente cliente2 = new Cliente("Roberta Mineiro");
        Cliente cliente3 = new Cliente("Eduardo Fernandes");
        
        Conta c1 = new ContaCorrente(cliente1);
        Conta c2 = new ContaPoupanca(cliente2);
        Conta c3 = new ContaCorrente(cliente3);

        c1.depositar(3540.45);
        c2.depositar(1326.77);
        c3.depositar(4589.47);

        bradesco.adicionarConta(c1);
        bradesco.adicionarConta(c2);
        bradesco.adicionarConta(c3);

        bradesco.listarContas();

        System.out.println(bradesco.numeroDeContas());

        bradesco.deletarConta(3);

        bradesco.listarContas();
    }
}
