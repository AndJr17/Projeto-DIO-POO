package ContaBancaria;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    
    private String nome;
    private List <Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }
    
    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }

    public int numeroDeContas() {
        return contas.size();
    }

    public void listarContas() {
        for(Conta conta : contas) {
            System.out.println(conta);
        }
    }

    public void deletarConta(int numeroConta) {
       Conta contaParaDeletar = null;

       for(Conta conta: contas) {
        if(conta.getNumero() == numeroConta) {
            contaParaDeletar = conta;
            break;
        }
       }

       if(contaParaDeletar != null) {
        contas.remove(contaParaDeletar);
        System.out.println("Conta número " + numeroConta + " removida com sucesso.");
    } else {
        System.out.println("Conta não encontrada.");
    }
}  




    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
