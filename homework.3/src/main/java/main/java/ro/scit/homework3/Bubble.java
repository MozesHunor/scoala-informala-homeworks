package main.java.ro.scit.homework3;

public class Bubble {

    public static int[] bubble(int[] arr, String[] names) {
        boolean doneOne = false;
        for (int i = 0; i < arr.length && !doneOne; i++) {
            doneOne = true;
            for (int j = arr.length - 1; j > 1; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    doneOne = false;

                    String tempo = names[j];
                    names[j] = names [j-1];
                    names[j-1] = tempo;
                    doneOne = false;

                }
            }
        }
        return arr;
    }
}
