import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] inteiros = {7,2,3,44,55};
        selectionSort(inteiros);
        System.out.println(Arrays.toString(inteiros));

    }

    public static void selectionSort(int[] array){
        for(int i = 0; i < array.length - 1; i++){ //passa por todos os elementos exceto o ultimo
            int minIndex = 1;
            int min = array[i];

            for(int k = i + 1; k < array.length; k++){ //passa por todos os elementos depois de i até o final

                if(array[k] < min){
                    min = array[k];
                    minIndex = k;
                }
            }

            swap(array, i, minIndex);
        }
    }

    public static void swap(int[] array, int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
