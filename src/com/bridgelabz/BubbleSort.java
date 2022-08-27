package com.bridgelabz;

public class BubbleSort {
    public void sortArray(int[] numArray) {
        int n = numArray.length;
        int temp;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {

                if (numArray[j - 1] > numArray[j]) {
                    temp = numArray[j - 1];
                    numArray[j - 1] = numArray[j];
                    numArray[j] = temp;
                }

            }
        }
    }

    public void printArray(int[] x) {
        for (int j : x) {
            System.out.print(j + " ");
        }
    }

    public static void main(String[] args) {
        BubbleSort b = new BubbleSort();
        int[] num = {50,48,37,52,18};
        System.out.println("Sorted List:");
        b.sortArray(num);
        b.printArray(num);
    }
}
