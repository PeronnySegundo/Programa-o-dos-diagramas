package br.com.catolic.concessionaria;
public class Main{
    public static void main(String[] args){
        Concessionaria RioVale = new Concessionaria("Rio vale", "10/04/2010", 15, 150, 100, "08:30", "17:00", 1_200_000);
        RioVale.venderCarro(2, 80_000);
        RioVale.venderMoto(1, 17_000);
        RioVale.contratar(2, 2000);
        RioVale.demitir(3, 2000);
        RioVale.comprarCarro(3, 50_000);
        RioVale.comprarMoto(2, 10_000);
    }
}