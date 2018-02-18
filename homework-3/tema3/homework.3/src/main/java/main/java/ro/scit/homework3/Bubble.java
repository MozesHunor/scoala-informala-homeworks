package main.java.ro.scit.homework3;

public class Bubble {

    static void bubble(int[] arr, String[] name) {
        int n = arr.length;
        int temp = 0;
        String tempo = "";
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - 1); j++) {
                temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;

                tempo = name[j - 1];
                name[j - 1] = name[j];
                name[j] = tempo;
            }
        }
    }
}
