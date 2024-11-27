import java.util.Arrays;

public class MatrizTransposta { //escrever uma função que verifica se duas matrizes são transpostas

    public static void main(String[] args) {
        int[][] A = {{1, 2, 3}, {4, 5, 6},}; int[][] B = {{1,4}, {2,5}, {3,6}};
        print(A); print(B);
        isTransposta(A, B, 2, 3, 3, 2);
    }

    public static void isTransposta(int[][] A, int[][] B, int linha, int coluna, int s, int p) {
        boolean flag = true;

        if((linha != p) || (coluna != s)){ //verifica se as matrizes tem dimensoes validas
            flag = false;
        }

        if(flag){
            for(int l = 0; l < linha; l++){ //compara o elemento de A ao seu equivalente em B
                for(int c = 0; c < coluna; c++){
                    if (A[l][c] != B[c][l]){
                        flag = false;
                    }
                }
            }
        }

        if(flag){
            System.out.println("As matrizes são transpostas");
        } else throw new RuntimeException("As matrizes nao sao transpostas");
    }

    public static void print(int[][] A){
        for(int l = 0; l < A.length; l++) {
            System.out.println();
            for(int c = 0; c < A[l].length; c++) {
                System.out.print(A[l][c] + " ");
            }
        }
        System.out.println();
        System.out.println("---------------------------");
    }
}
