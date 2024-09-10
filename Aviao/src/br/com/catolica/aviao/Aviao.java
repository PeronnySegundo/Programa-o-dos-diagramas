package br.com.catolica.aviao;

public class Aviao {
    String empresa;
    boolean estaVoando;
    int quantidadeDePessoas;
    double quantidadeDePesoDeMalas;
    double LIMITE_PESO_MALAR = 3000;
    int LIMITE_PESSOAS = 150;

    public Aviao(String empresa, boolean estaVoando, int quantidadeDePessoas, double quantiadeDePesoDeMalas){
        this.empresa = empresa;
        this.estaVoando = estaVoando;
        this.quantidadeDePessoas = quantidadeDePessoas;
        this.quantidadeDePesoDeMalas = quantiadeDePesoDeMalas;
    }
    boolean voar(){
        System.out.println("O Avião acabou de decolar");
        return true;
    }boolean pousar(){
        System.out.println("O avião esta pousando");
        return true;
    }int infoQuantidadeDePessoas(){
        return this.quantidadeDePessoas;
    }void embarcar(int quantidade, double pesoMalar){
        if(quantidade < this.LIMITE_PESSOAS || pesoMalar < this.LIMITE_PESO_MALAR){
            System.out.println("O embarque não foi concluido");
        }this.quantidadeDePessoas += quantidade;
        this.quantidadeDePesoDeMalas += pesoMalar;
        System.out.printf("%d pessoas foram embarcadas com o peso total de malar: %.2f", quantidade, pesoMalar);
    }void desembarcar(int quantidade, double pesoMalas){
        if(quantidade < this.quantidadeDePessoas || pesoMalas > this.quantidadeDePesoDeMalas){
            System.out.println("O desembarque não foi possível");
        }this.quantidadeDePessoas -= quantidade;
        this.quantidadeDePesoDeMalas -= pesoMalas;
        System.out.printf("%d desembarcaram, peso total das malas: %.2f", quantidade, pesoMalas);
    }

    @Override
    public String toString() {
        return String.format("Empresa: %s\n" +
                "Esta voando: %b\n" +
                "Quantidade de pessoas: %s\n" +
                "Quantidade de peso das malas: %.2f\n" +
                "Numero de acentos: %d\n" +
                "Peso máximo das malas: %.2f", empresa, estaVoando, quantidadeDePessoas, quantidadeDePesoDeMalas, LIMITE_PESSOAS, LIMITE_PESO_MALAR);
    }
}

