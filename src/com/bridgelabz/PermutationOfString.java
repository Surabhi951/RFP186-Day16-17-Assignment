package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class PermutationOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String To Permutation:");
        String word = sc.next();
        System.out.println("Permutation by Iterating:");
        permutationIteratively(word);
        System.out.println("Permutation by Recursion:");
        permutationRecursively(word, "");
    }

    public static void permutationIteratively(String word) {
        if (word.length() == 0)
            return;

        ArrayList<String> words = new ArrayList<>();
        words.add(String.valueOf(word.charAt(0)));

        for (int i = 1; i < word.length(); i++) {
            for (int j = words.size() - 1; j >= 0; j--) {
                String Permutation = words.remove(j);
                for (int k = 0; k <= Permutation.length(); k++) {
                    words.add(Permutation.substring(0, k) + word.charAt(i) + Permutation.substring(k));
                }
            }
        }
        System.out.println(words);
    }

    public static void permutationRecursively(String word, String result) {

        if (word.length() == 0) {
            System.out.print(result + " ");
            return;
        }

        for (int index = 0; index < word.length(); index++) {
            char ch = word.charAt(index);
            String restOfString = word.substring(0, index) + word.substring(index + 1);
            permutationRecursively(restOfString, result + ch);
        }
    }
}
