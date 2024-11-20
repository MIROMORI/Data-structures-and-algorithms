public class BinarySearch{

    public static void main(String[] args) {
        int[] sortedList = {6,7,8,11,22,34,67};
        System.out.println(binarySearch(sortedList, 8));
    }

    static int binarySearch(int[] sortedList, int key){
        int low = 0;
        int high = sortedList.length - 1;

        while(low <= high){
            int middle = (low + high) / 2;
            int middleElement = sortedList[middle];

            if (middleElement == key) {
                return middle;
            } else if (middleElement < key){
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }

        return -1;
    }
}
