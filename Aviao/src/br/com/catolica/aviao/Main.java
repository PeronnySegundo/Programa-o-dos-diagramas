package br.com.catolica.aviao;

public class Main{
    public static void main(String args[]){
        Aviao aviaoDaGol = new Aviao("GOl", false, 0,0);
        aviaoDaGol.voar();
        aviaoDaGol.pousar();
        aviaoDaGol.infoQuantidadeDePessoas();
        aviaoDaGol.embarcar(20, 200);
        aviaoDaGol.desembarcar(10, 100);
        System.out.println(aviaoDaGol.toString());
    }
}