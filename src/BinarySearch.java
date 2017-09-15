public class BinarySearch {

    public static void main(String[] args) {

        int data[] = {3, 6, 7, 10, 34, 56, 60};
        int numberToFind = 10;
        int length = data.length / 2;
        int i = length;
        int c = -1;
        int candidate;

        while (true) {
            candidate = data[i];

            if (candidate == numberToFind) {
                c = i;
                break;
            } else if (length == 0)
                break;
            else if (candidate < numberToFind) {
                length /= 2;
                i += length == 0 ? 1 : length;
            } else {
                length /= 2;
                i -= length == 0 ? 1 : length;
            }

        }

        System.out.println(c);
    }
}
