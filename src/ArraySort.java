public class ArraySort {

    public static void main(String[] args) {
        int[] array = {30, 2, 10, 4, 6};
        int length = array.length;

        boolean swapped ;
        int save;

        do {
            swapped = false;
            for (int i = 1; i <= length - 1; i++) {
                if (array[i - 1] > array[i]) {
                    save = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = save;
                    swapped = true;
                }
            }
        } while (swapped);

        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

