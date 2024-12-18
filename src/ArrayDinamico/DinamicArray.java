package ArrayDinamico;

import java.util.Arrays;

public class DinamicArray {

    int capacidade, alocados = 0;
    Lutador[] array = null;


    public void initArray(int capacidade){ //cria um array com o tamanho especificado
        this.capacidade = capacidade;
        this.array = new Lutador[capacidade];
    }

    public void resizeArray(){
        capacidade *= 2;
        Lutador[] temp = new Lutador[capacidade];
        for(int i = 0; i < capacidade /2 ; i++){ //copia os elementos do array no novo array de tamanho duplicado
            temp[i] = array[i];
        }
        this.array = temp; //associa o novo array a estrutura
    }

    public void insert(Lutador lutador){ //insere um lutador no final do array
        if(capacidade == 0 || capacidade == alocados){ //verifica se há espaço no array
            System.out.println("Nao há espaço no array");
        }
        array[alocados] = lutador; //adiciona o lutador no final do array
        alocados++; //atualiza a quantidade de elementos no array
    }

    public void delete(int id){
        int index = find(id); //guarda a posicao do lutador
        if(index == -1){
            System.out.println("Lutador nao encontrado");
            return;
        }
        array[index] = null; //apaga o lutador do array
        format(index); //ajusta a posicao dos elementos no array
        alocados--; //atualiza a quantidade de elementos no array
    }

    public int find(int id){ //retorna a posicao do lutador caso seja encontrado, senao retorna -1
        for(int i = 0; i < capacidade; i++){
            if(array[i].id == id){
                return i;
            }
        }
        return -1;
    }


    public void format(int index){ //remove os gaps entee os elementos no array após uma remoção
        for(int i = index; i < capacidade; i++){
            if(i + 1 == capacidade){ //se o elemento removido foi o ultimo, nada é alterado
                return;
            }
            //se nao, puxa todos os elementos a direita do removido uma unidade a esquerda
            array[i] = array[i + 1];
            array[i + 1] = array[i];
        }
    }


    public void print(){ //printa os elementos nao nulos do array
        for(int i = 0; i < capacidade; i++){
            if(array[i] != null){
                System.out.println(array[i].toString());
            }
        }
    }

    @Override
    public String toString() {
        return "DinamicArray{" +
                "capacidade=" + capacidade +
                ", alocados=" + alocados +
                ", array=" + Arrays.toString(array) +
                '}';
    }
}
