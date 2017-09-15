public class ShellSort {

    public static void main(String[] args) {
        int[] array = {30, 2, 10, 4, 6};
        int length = array.length;

        for (int i = length / 2; i >= 1; i /= 2) {
            for (int j = i; j < length; j++) {
                for (int k = j; k >= i && array[k - i] > array[k]; k -= i) {
                    int res = array[k];
                    array[k] = array[k - i];
                    array[k - i] = res;
                }
            }
        }

        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

