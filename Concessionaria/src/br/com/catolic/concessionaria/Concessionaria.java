package br.com.catolic.concessionaria;

public class Concessionaria {
    String nome;
    String dataAbertura;
    int quantidadeDeFuncionarios;
    int quantidadeDeCarros;
    int quantidadeDeMotos;
    String horarioDeAbertura;
    String horarioDeFechamento;
    double capital;

    public Concessionaria(String nome, String dataAbertura, int quantidadeDeFuncionarios, int quantidadeDeCarros, int quantidadeDeMotos, String horarioDeAbertura, String horarioDeFechamento, double capital){
        this.nome = nome;
        this.dataAbertura = dataAbertura;
        this.quantidadeDeFuncionarios = quantidadeDeFuncionarios;
        this.quantidadeDeCarros = quantidadeDeCarros;
        this.quantidadeDeMotos = quantidadeDeMotos;
        this.horarioDeAbertura = horarioDeAbertura;
        this.horarioDeFechamento = horarioDeFechamento;
        this.capital = capital;
    };
    void venderCarro(int quantidade, double valor){
        if(quantidade>this.quantidadeDeCarros || quantidade<=0 || valor < 0){
            System.out.println("Venda não realizada!");
        }
        this.quantidadeDeCarros -= quantidade;
        double valorDaVenda = quantidade * valor;
        capital += valorDaVenda;
        System.out.printf("Venda de %d carros, pelo valor de %2.f (valor da unidade: %2.f)foi realizada com sucesso", quantidade, valorDaVenda, valor);
    }
    void venderMoto(int quantidade, double valor){
        if(quantidade<this.quantidadeDeMotos || quantidade<=0 || valor <= 0){
            System.out.println("Venda não realiza!");
        }
        double valorDaVenda = quantidade * valor;
        System.out.printf("Venda de %d motos, pelo valor de %.2f (valor da unidade: %2.f) foi realizada com sucesso", quantidade, valorDaVenda, valor);
    }void contratar(int quantidade, double valor){
        if(quantidade<=0){
            System.out.println("Não foi possivel contratar");
        }valor = valor * quantidade;
        this.capital -= valor;
        System.out.printf("%d Funcionarios contratados, dinheiro gasto a mais no mês: %2.f", quantidade, valor);
    }void demitir(int quantidade, double valor){
        if(quantidade <= quantidadeDeFuncionarios || valor < 0){
            System.out.println("Não foi possível demitir os funcionarios");
        }this.quantidadeDeFuncionarios += quantidade;
        valor = valor * quantidade;
        this.capital += valor;
        System.out.printf("%d funcionarios foram demitidos, dinheiro economizado no mês: %.2f", quantidade, valor);
    }void comprarCarro(int quantidade, double valor){
        if(quantidade <= 0){
            System.out.println("Não foi possivel realizar a compra");
        }this.quantidadeDeCarros += quantidade;
        valor = valor * quantidade;
        this.capital -= valor;
        System.out.printf("%d carros foram comprados, valor gasto: %.2f", quantidade, valor);
    }void comprarMoto(int quantidade, double valor){
        if (quantidade <= 0){
            System.out.println("Não foi possivel realizar a compra");
        }this.quantidadeDeMotos += quantidade;
        valor = valor * quantidade;
        this.capital -= valor;
    }
}
