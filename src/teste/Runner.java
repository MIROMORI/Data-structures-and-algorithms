package teste;

import listaencadeada.LinkedList;

public class Runner {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(11);
        list.insert(15);

        list.show();
    }
}
