package listaencadeada;

public class LinkedList {
    Node head;


    //insere um elemento no final da lista
    public void insert(int data){
        Node insertNode = new Node(); //cria e insere a informação no nó
        insertNode.data = data;

        if(head == null){
            head = insertNode;
        } else {
            Node temp = head;

            while(temp.next != null){ // se o temp tem o next diferente de nulo, entao ele nao é o ultimo da lista
                temp = temp.next; //passa para o proximo nó
            }
            temp.next = insertNode; //ao chegar aqui, temp é o ultimo nó da lista
        }
    }

    //mostra todos os elementos da lista
    public void show(){
        Node node = head;

        while(node != null){
            System.out.println(node.data);
            node = node.next;
        }
    }
}
