public class SelectionSort {

    public static int[] sort(int[] unsorted) throws Exception{
            if (unsorted.length <= 1) {
                throw new NotAValidArray("Array Length is :" + unsorted.length);
            }

        for (int i = 0; i < unsorted.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < unsorted.length; j++)
                if (unsorted[j] < unsorted[min])
                    min = j;

            int temp = unsorted[min];
            unsorted[min] = unsorted[i];
            unsorted[i] = temp;
        }
        return unsorted;
    }

    static class NotAValidArray extends Exception {

        public      NotAValidArray(String Message) {
            super(Message);
        }
    }
}
