package ArrayDinamico.teste;

import ArrayDinamico.DinamicArray;
import ArrayDinamico.Lutador;

public class Runner {
    public static void main(String[] args) {
        DinamicArray arrayDinamico = new DinamicArray();
        Lutador lutador1 = new Lutador();
        Lutador lutador2 = new Lutador();
        Lutador lutador3 = new Lutador();

        arrayDinamico.initArray(5);
        arrayDinamico.insert(lutador1);
        arrayDinamico.insert(lutador2);
        arrayDinamico.insert(lutador3);
        arrayDinamico.delete(0);
        arrayDinamico.print();


    }
}
