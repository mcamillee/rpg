

public class Main {
    public static void main(String[] args) {
        
Mago mago;
mago = new Mago();
mago.setNome("M");


Guerreiro guerreiro;
guerreiro = new Guerreiro();
guerreiro.setNome("G");


Viking viking = new Viking();
guerreiro.setNome("V");

mago.imprimirEstatisticas();
guerreiro.imprimirEstatisticas();
viking.imprimirEstatisticas();

mago.atacar(guerreiro, 1);
guerreiro.atacar(viking, 2);
guerreiro.escudo(mago.magia(1));

viking.LancarMachado(mago);


mago.imprimirEstatisticas();
guerreiro.imprimirEstatisticas();
viking.imprimirEstatisticas();


    }
}