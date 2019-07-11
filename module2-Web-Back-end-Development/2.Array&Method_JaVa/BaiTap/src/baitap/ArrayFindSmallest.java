package baitap;

public class ArrayFindSmallest {
    public static int minValue(int[] array) {
        int min = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[index];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] array1 = {13, 8, 78, 6, 7, 76};
        int index = minValue(array1);
        System.out.println("The smallest element is at index: " + index);
    }
}
