package de.katas;

import java.util.ArrayList;
import java.util.List;

/**
 * Should be called Solution
 */
public class Kata01 {
    public boolean checkInclusion(String s1, String s2) {
        return false;
    }

    public List<String> computeAllPermutations(String abc) {
        List<String> permutations = new ArrayList<>();
        StringBuilder workingCopy = new StringBuilder(abc);
        compute(0, workingCopy, permutations);
        return permutations;
    }

    private void compute(int index, StringBuilder workingCopy, List<String> permutations) {
        if (index == workingCopy.length()) {
            permutations.add(workingCopy.toString());
            return;
        }

        for (int i = index; i < workingCopy.length(); i++) {
            swap(workingCopy, index, i);
            compute(index + 1, workingCopy, permutations);
            swap(workingCopy, index, i);
        }

    }

    void swap(StringBuilder s, int i, int j) {
        char temp = s.charAt(i);
        s.setCharAt(i, s.charAt(j));
        s.setCharAt(j, temp);
    }

}

